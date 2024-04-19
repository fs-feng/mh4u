import React, { useEffect, useState } from "react";
import { FlatList, StyleSheet } from "react-native";

import { Text, View } from "@/components/Themed";

import CListItem from "@/components/ListItem/CListItem";
import { Combining } from "@/types/types";
import { fetchCombining } from "@/services/combiningService";
import ItemCombining from "@/components/ListItem/ItemCombining";

export default function Combinations() {
  const [combining, setCombining] = useState<Combining[]>([]);

  useEffect(() => {
    const fetchData = async () => {
      const data = await fetchCombining();
      setCombining(data);
    };

    fetchData();
  }, []);

  return (
    <View style={styles.container}>
      <FlatList
        data={combining}
        keyExtractor={(item) => item.id.toString()}
        initialNumToRender={20}
        windowSize={5}
        renderItem={({ item }) => <CListItem data={item} />}
      />
      <View
        style={styles.separator}
        lightColor="#eee"
        darkColor="rgba(255,255,255,0.1)"
      />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: "center",
    justifyContent: "center",
  },
  title: {
    fontSize: 20,
    fontWeight: "bold",
  },
  separator: {
    marginVertical: 30,
    height: 1,
    width: "80%",
  },
});
