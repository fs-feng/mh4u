import { FC } from "react";
import { Monster, Item, Combining, Location, SkillTree } from "@/types/types";
import ItemMonster from "./ItemMonster";
import ItemItem from "./ItemItem";
import ItemCombining from "./ItemCombining";
import ItemLocation from "./ItemLocation";
import ItemSkillTree from "./ItemSkillTree";

type Props = {
  data: Monster | Item | Combining | Location | SkillTree;
};

function isMonster(
  data: Monster | Item | Combining | Location | SkillTree
): data is Monster {
  return (data as Monster).unique === "Monster";
}

function isItem(
  data: Monster | Item | Combining | Location | SkillTree
): data is Item {
  return (data as Item).unique === "Item";
}

function isCombining(
  data: Monster | Item | Combining | Location | SkillTree
): data is Combining {
  return (data as Combining).unique === "Combining";
}

function isLocation(
  data: Monster | Item | Combining | Location | SkillTree
): data is Location {
  return (data as Location).unique === "Location";
}

function isSkillTree(
  data: Monster | Item | Combining | Location | SkillTree
): data is SkillTree {
  return (data as SkillTree).unique === "SkillTree";
}

const CListItem: FC<Props> = ({ data }) => {
  let content;

  if (isMonster(data)) {
    content = <ItemMonster data={data} />;
  } else if (isItem(data)) {
    content = <ItemItem data={data} />;
  } else if (isCombining(data)) {
    content = <ItemCombining data={data} />;
  } else if (isLocation(data)) {
    content = <ItemLocation data={data} />;
  } else if (isSkillTree(data)) {
    content = <ItemSkillTree data={data} />;
  }

  return <>{content}</>;
};

export default CListItem;
