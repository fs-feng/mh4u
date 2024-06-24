import {Monster} from "../../types/types";
import {FC} from "react";
import {Link} from "expo-router";
import {Dimensions, Pressable, StyleSheet} from "react-native";
import {Divider, Image, ListItem, Text} from "@rneui/themed";

type Props = {
    data: Monster;
};



const ItemMonster: FC<Props> = ({ data }) => {
    const { name, icon_name } = data;
    return (
        <Link href={"/detail/monster/" + data.id} asChild>
            <Pressable>
                <ListItem>
                    <Image style={styles.image} source={{ uri: "http://10.0.2.2:8000/icons/icons_monster/" + icon_name }}/>
                    <Text style={styles.text}>{name}</Text>
                </ListItem>
                <Divider/>
            </Pressable>
        </Link>
    );
};

const styles = StyleSheet.create({
    image: {
        width: Dimensions.get("window").height * 0.04,
        height: Dimensions.get("window").height * 0.04,
    },
    text: {
        fontSize: Dimensions.get("window").height * 0.018,
    }
});


export default ItemMonster;