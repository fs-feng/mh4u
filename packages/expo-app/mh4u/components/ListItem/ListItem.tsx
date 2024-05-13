import { FC } from "react";
import {
  Monster,
  Item,
  Combining,
  Location,
  SkillTree,
  Decoration,
} from "@/types/types";
import ItemMonster from "./ItemMonster";
import ItemItem from "./ItemItem";
import ItemCombining from "./ItemCombining";
import ItemLocation from "./ItemLocation";
import ItemSkillTree from "./ItemSkillTree";
import ItemDecoration from "./ItemDecoration";

type Props = {
  data: any;
};

function isMonster(data: any): data is Monster {
  return (data as Monster).unique === "Monster";
}

function isItem(data: any): data is Item {
  return (data as Item).unique === "Item";
}

function isCombining(data: any): data is Combining {
  return (data as Combining).unique === "Combining";
}

function isLocation(data: any): data is Location {
  return (data as Location).unique === "Location";
}

function isSkillTree(data: any): data is SkillTree {
  return (data as SkillTree).unique === "SkillTree";
}

const CListItem: FC<Props> = ({ data }) => {
  let content;

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

    default:
      break;
  }

  return <>{content}</>;
};

export default CListItem;
