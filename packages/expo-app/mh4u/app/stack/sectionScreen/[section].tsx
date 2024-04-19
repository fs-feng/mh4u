import { FlatList, StyleSheet } from "react-native";
import { useLocalSearchParams } from "expo-router";

import { View, Text } from "@/components/Themed";

import { setDataList } from "./section";
import CListItem from "@/components/ListItem/CListItem";

export default function SectionScreen() {
  const { section } = useLocalSearchParams();
  const data = setDataList(section.toString());

  return (
    <View style={styles.container}>
      <Text>{section}</Text>
      <FlatList
        data={data}
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
