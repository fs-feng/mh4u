import {SkillTree} from "../../types/types";
import {FC} from "react";
import {Link} from "expo-router";
import {Dimensions, Pressable, StyleSheet, View} from "react-native";
import {Divider, ListItem, Text} from "@rneui/themed";


type Props = {
    data: SkillTree;
};

const ItemSkillTree: FC<Props> = ({ data }) => {
    const { name } = data;
    return (
        <View>
            <ListItem>
                <Text style={styles.text}>{name}</Text>
            </ListItem>
            <Divider/>
        </View>
    );
};

const styles = StyleSheet.create({
    text: {
        fontSize: Dimensions.get("window").height * 0.018,
    }
});

export default ItemSkillTree;