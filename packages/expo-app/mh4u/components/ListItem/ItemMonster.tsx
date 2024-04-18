import { FC } from "react";

import { Pressable, StyleSheet, Dimensions } from "react-native";
import { ListItem, Image, Text } from "@rneui/themed";
import { Href, Link } from "expo-router";

import { Monster } from "@/types/types";

type Props = {
  data: Monster;
};

const MonsterItem: FC<Props> = ({ data }) => {
  return (
    <Link href={"/two"} asChild>
      <Pressable>
        <ListItem style={styles.container}>
          <Image
            source={{
              uri: "http://10.0.2.2:8000/icons" + "test",
            }}
            style={styles.image}
          />
          <Text style={styles.text}>{"test"}</Text>
        </ListItem>
      </Pressable>
    </Link>
  );
};

const styles = StyleSheet.create({
  container: {
    padding: 0,
    width: Dimensions.get("window").width,
  },
  image: {
    width: Dimensions.get("window").height * 0.05,
    height: Dimensions.get("window").height * 0.05,
  },
  text: {
    fontSize: Dimensions.get("window").height * 0.025,
  },

  item: {
    borderColor: "black",
    borderTopWidth: 0.2,

    padding: 20,
    fontSize: 15,
  },
});

export default MonsterItem;