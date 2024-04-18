import { FC } from "react";

import { Pressable, StyleSheet, Dimensions } from "react-native";
import { ListItem, Image, Text } from "@rneui/themed";
import { Href, Link } from "expo-router";

import { Combining } from "@/types/types";

type Props = {
  data: Combining;
};

const ItemCombining: FC<Props> = ({ data }) => {
  const { created_item, item1, item2 } = data;
  return (
    <Link href={"/two"} asChild>
      <Pressable>
        <ListItem style={styles.container}>
          <Image
            source={{
              uri: "http://10.0.2.2:8000/icons/icons_items/" + icon_name,
            }}
            style={styles.image}
          />
          <Text style={styles.text}>{name}</Text>
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
  text: {
    marginBottom: 0,
    marginTop: 0,
    fontSize: Dimensions.get("window").height * 0.02,
  },

  item: {
    borderColor: "black",
    borderTopWidth: 0.2,

    padding: 20,
    fontSize: 15,
  },
});

export default ItemCombining;