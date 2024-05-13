import { FC, useEffect, useState } from "react";

import { View, Pressable, StyleSheet, Dimensions } from "react-native";
import { ListItem, Image, Text } from "@rneui/themed";
import { Href, Link } from "expo-router";

import { Decoration, ItemToSkillTree } from "@/types/types";

import { fetchItemToSkillTree } from "@/services/itemToSkillTreeService";

type Props = {
  data: Decoration;
};

const ItemDecoration: FC<Props> = ({ data }) => {
  const { item, num_slots } = data;
  const [itemToSkillTrees, setItemToSkillTrees] = useState<ItemToSkillTree[]>(
    []
  );

  useEffect(() => {
    const fetchData = async () => {
      const data = await fetchItemToSkillTree(item.id);
      setItemToSkillTrees(data);
    };

    fetchData();
  }, []);

  return (
    <Link href={"/two"} asChild>
      <Pressable>
        <ListItem style={styles.container}>
          <Image
            source={{
              uri: "http://10.0.2.2:8000/icons/icons_items/" + item.icon_name,
            }}
            style={styles.image}
          />
          <View>
            <Text style={styles.title}>{item.name}</Text>
            {itemToSkillTrees.map((itemToSkillTree) => (
              <Text key={itemToSkillTree.id} style={styles.text}>
                {itemToSkillTree.skill_tree.name}
                {"  "}
                {itemToSkillTree.point_value > 0 ? "+" : ""}
                {itemToSkillTree.point_value}
              </Text>
            ))}
          </View>
          <View style={styles.slots}>
            <Text style={styles.title}>
              {num_slots >= 1 ? "O" : "-"}
              {num_slots >= 2 ? "O" : "-"}
              {num_slots >= 3 ? "O" : "-"}
            </Text>
          </View>
        </ListItem>
      </Pressable>
    </Link>
  );
};

const styles = StyleSheet.create({
  container: {
    width: Dimensions.get("window").width,
    borderBottomColor: "rgba(0, 0, 0, 0.1)",
    borderBottomWidth: 0.5,
  },
  image: {
    marginBottom: 0,
    marginTop: 0,
    width: Dimensions.get("window").height * 0.05,
    height: Dimensions.get("window").height * 0.05,
  },
  title: {
    marginBottom: 0,
    marginTop: 0,
    fontSize: Dimensions.get("window").height * 0.02,
  },
  text: {
    marginBottom: 0,
    marginTop: 0,
    fontSize: Dimensions.get("window").height * 0.015,
  },

  item: {
    borderColor: "black",
    borderTopWidth: 0.2,

    padding: 20,
    fontSize: 15,
  },

  slots: {
    flex: 1,
    flexDirection: "row",
    justifyContent: "flex-end",
  },
});

export default ItemDecoration;
