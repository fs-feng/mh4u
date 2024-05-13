import { FC } from "react";

import { Pressable, StyleSheet, Dimensions } from "react-native";
import { ListItem, Image, Text } from "@rneui/themed";
import { Href, Link } from "expo-router";

type Props = {
  title: string;
  icon: string;
  route: string;
};

const SectionItem: FC<Props> = ({ title, icon, route }) => {
  return (
    <Link href={route as Href<string>} asChild>
      <Pressable>
        <ListItem style={styles.container}>
          <Image
            source={{
              uri: "http://10.0.2.2:8000/icons" + icon,
            }}
            style={styles.image}
          />
          <Text style={styles.text}>{title}</Text>
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
    width: Dimensions.get("window").height * 0.05,
    height: Dimensions.get("window").height * 0.05,
  },
  text: {
    fontSize: Dimensions.get("window").height * 0.025,
  },
});

export default SectionItem;
