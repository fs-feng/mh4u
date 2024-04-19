export type Monster = {
  unique: "Monster";
  id: number;
  monsterClass: string;
  name: string;
  name_de: string;
  name_fr: string;
  name_es: string;
  name_it: string;
  name_jp: string;
  signature_move: string;
  trait: string;
  icon_name: string;
  sort_name: string;
};

export type Item = {
  unique: "Item";
  id: number;
  name: string;
  name_de: string;
  name_fr: string;
  name_es: string;
  name_it: string;
  name_jp: string;
  type: string;
  sub_type: string;
  rarity: number;
  carry_capacity: number;
  buy: number;
  sell: number;
  description: string;
  icon_name: string;
  armor_dupe_name_fix: string;
};

export type Combining = {
  unique: "Combining";
  id: number;
  created_item: Item;
  item1: Item;
  item2: Item;
  amount_made_min: number;
  amount_made_max: number;
  percentage: number;
};

export type Combination = {};

export type Location = {
  unique: "Location";
  id: number;
  name: string;
  name_de: string;
  name_fr: string;
  name_es: string;
  name_it: string;
  name_jp: string;
  map: string;
};

export type SkillTree = {
  unique: "SkillTree";
  id: number;
  name: string;
  name_de: string;
  name_fr: string;
  name_es: string;
  name_it: string;
  name_jp: string;
};
