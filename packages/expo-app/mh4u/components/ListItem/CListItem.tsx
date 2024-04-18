import { FC } from "react";
import { Monster, Item } from "@/types/types";
import ItemMonster from "./ItemMonster";
import ItemItem from "./ItemItem";

type Props = {
  data: Monster | Item;
};

function isMonster(data: Monster | Item): data is Monster {
  return true;
}

function isItem(data: Monster | Item): data is Item {
  return true;
}

const CListItem: FC<Props> = ({ data }) => {
  let content;

  if (isMonster(data)) {
    content = <ItemMonster data={data} />;
  } else if (isItem(data)) {
    content = <ItemItem data={data} />;
  }

  return <>{content}</>;
};

export default CListItem;
