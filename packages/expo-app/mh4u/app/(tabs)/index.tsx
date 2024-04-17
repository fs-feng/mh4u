import { FlatList, StyleSheet, Dimensions } from "react-native";

import { Text, View } from "@/components/Themed";
import CListItem from "@/components/CListItem";

import { menuData } from "@/data/menuData";
import { Stack } from "expo-router";

export default function TabOneScreen() {
  return (
    <View style={styles.container}>
      <Stack.Screen
        options={{
          title: "Home",
        }}
      />
      <FlatList
        data={menuData}
        keyExtractor={(item) => item.title}
        initialNumToRender={10}
        windowSize={2}
        renderItem={({ item }) => (
          <CListItem title={item.title} icon={item.icon} route={item.route} />
        )}
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
  },
  title: {
    fontSize: 20,
    fontWeight: "bold",
  },
  separator: {
    marginVertical: 30,
    height: 1,
    width: "100%",
  },
});
