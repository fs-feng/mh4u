import { FC } from "react";

import { Pressable, StyleSheet, Dimensions, View } from "react-native";
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
          <View style={styles.section}>
            <View style={styles.sectionItem}>
              <Image
                source={{
                  uri:
                    "http://10.0.2.2:8000/icons/icons_items/" +
                    created_item.icon_name,
                }}
                style={styles.image}
              />
              <Text style={styles.text}>{created_item.name}</Text>
            </View>
          </View>
          <View style={styles.section}>
            <View style={styles.sectionItem}>
              <Image
                source={{
                  uri:
                    "http://10.0.2.2:8000/icons/icons_items/" + item1.icon_name,
                }}
                style={styles.image}
              />
              <Text style={styles.text}>{item1.name}</Text>
            </View>
            <View style={styles.sectionItem2}>
              <Image
                source={{
                  uri:
                    "http://10.0.2.2:8000/icons/icons_items/" + item2.icon_name,
                }}
                style={styles.image}
              />
              <Text style={styles.text}>{item2.name}</Text>
            </View>
          </View>
        </ListItem>
      </Pressable>
    </Link>
  );
};

const styles = StyleSheet.create({
  container: {
    flexDirection: "row",
    justifyContent: "space-between",
    width: Dimensions.get("window").width,
    borderBottomColor: "rgba(0, 0, 0, 0.1)",
    borderBottomWidth: 0.5,
  },
  section: {
    width: "50%",
  },
  sectionItem: {
    flexDirection: "row",
    justifyContent: "flex-start",
    alignItems: "center",
  },
  sectionItem2: {
    flexDirection: "row",
    justifyContent: "flex-start",
    marginTop: 10,
    alignItems: "center",
  },

  image: {
    marginBottom: 0,
    marginTop: 0,
    width: Dimensions.get("window").height * 0.03,
    height: Dimensions.get("window").height * 0.03,
  },
  text: {
    marginBottom: 0,
    marginTop: 0,
    fontSize: Dimensions.get("window").height * 0.015,
  },
});

export default ItemCombining;
