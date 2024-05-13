import { FlatList, StyleSheet } from "react-native";

import { View } from "@/components/misc/Themed";

import SectionItem from "@/components/NavItems/NavItem";
import { weaponsData } from "@/data/weaponsData";

import { Stack } from "expo-router";

export default function WeaponsScreen() {
  return (
    <View style={styles.container}>
      <Stack.Screen
        options={{
          title: "Home",
        }}
      />
      <FlatList
        data={weaponsData}
        keyExtractor={(item) => item.title}
        initialNumToRender={10}
        windowSize={2}
        renderItem={({ item }) => (
          <SectionItem title={item.title} icon={item.icon} route={item.route} />
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
