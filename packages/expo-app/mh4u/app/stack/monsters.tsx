import React, { useEffect, useState } from "react";
import { FlatList, StyleSheet } from "react-native";

import EditScreenInfo from "@/components/EditScreenInfo";
import { Text, View } from "@/components/Themed";

import SectionItem from "@/components/ListItem/SectionItem";
import { sectionData } from "@/data/sectionData";

import { fetchMonsters } from "@/services/monsterService";
import ItemMonster from "@/components/ListItem/ItemMonster";
import { Monster } from "@/types/types";
import CListItem from "@/components/ListItem/CListItem";

export default function Monsters() {
  const [monsters, setMonsters] = useState<Monster[]>([]);

  useEffect(() => {
    const fetchData = async () => {
      const data = await fetchMonsters();
      setMonsters(data);
    };

    fetchData();
  }, []);

  return (
    <View style={styles.container}>
      <FlatList
        data={monsters}
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
      <EditScreenInfo path="app/(tabs)/two.tsx" />
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
