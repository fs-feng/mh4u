import {FC, memo} from "react";
import ItemMonster from "./ItemMonster";
import ItemItem from "./ItemItem";
import ItemCombining from "./ItemCombining";
import ItemLocation from "./ItemLocation";
import ItemSkillTree from "./ItemSkillTree"
import ItemDecoration from "./ItemDecoration";
import NavItem from "../NavItem";
import ItemWeapon from "./ItemWeapon";
import ItemQuest from "./ItemQuest";
import {Text} from "@rneui/themed";
import ItemArmor from "./ItemArmor";



type Props = {
    data: any;
}

const ListItem: FC<Props> = ({ data }) => {
    if (!data) {
        return <></>;
    }

    let content;

    //determine which Item to show
    switch (data.unique) {
        case "Monster":
            content = <ItemMonster data={data} />;
            break;
        case "Item":
            content = <ItemItem data={data} />;
            break;
        case "Combining":
            content = <ItemCombining data={data} />;
            break;
        case "Location":
            content = <ItemLocation data={data} />;
            break;
        case "SkillTree":
            content = <ItemSkillTree data={data} />;
            break;
        case "Decoration":
            content = <ItemDecoration data={data} />;
            break;
        case "Weapon":
            content = <ItemWeapon data={data} />;
            break;
        case "Section": //navitems
            content = <NavItem data={data} />;
            break;
        case "Quest":
            content = <ItemQuest data={data} />;
            break;
        case "Armor":
            content = <ItemArmor data={data} />
            break;
        default:
            break;
    }

    return <>{ content }</>;
}

export default memo(ListItem);