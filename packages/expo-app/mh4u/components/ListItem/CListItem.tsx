import { FC } from "react";
import { Monster } from "@/types/types";

type Props = {
  data: any;
};

const CListItem: FC<Props> = ({ data }) => {
  let content;

  switch (data.type) {
    case "Monster":
      content = "Monster";
      break;
  }

  return content;
};

export default CListItem;
