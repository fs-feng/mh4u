import React, { useEffect, useState } from "react";

import { Monster, Item, Combining, Location, SkillTree } from "@/types/types";
import { fetchItems } from "@/services/itemService";
import { fetchMonsters } from "@/services/monsterService";
import { fetchCombining } from "@/services/combiningService";
import { fetchLocations } from "@/services/locationService";
import { fetchSkillTrees } from "@/services/skillTreeService";

export function setDataList(
  section: string
): (Monster | Item | Combining | Location | SkillTree)[] {
  switch (section) {
    case "Monsters":
      return monsterList();
      break;
    case "Items":
      return itemList();
      break;
    case "Combinations":
      return combinationList();
      break;
    case "Locations":
      return locationList();
      break;
    case "SkillTrees":
      return skillTreeList();
      break;
    default:
      return [];
  }
}

function skillTreeList(): SkillTree[] {
  const [skillTrees, setSkillTrees] = useState<SkillTree[]>([]);

  useEffect(() => {
    const fetchData = async () => {
      const data = await fetchSkillTrees();
      setSkillTrees(data);
    };

    fetchData();
  }, []);

  return skillTrees;
}

function locationList(): Location[] {
  const [locations, setLocations] = useState<Location[]>([]);

  useEffect(() => {
    const fetchData = async () => {
      const data = await fetchLocations();
      setLocations(data);
    };

    fetchData();
  }, []);

  return locations;
}

function monsterList(): Monster[] {
  const [monsters, setMonsters] = useState<Monster[]>([]);

  useEffect(() => {
    const fetchData = async () => {
      const data = await fetchMonsters();
      setMonsters(data);
    };

    fetchData();
  }, []);

  return monsters;
}

function itemList(): Item[] {
  const [items, setItems] = useState<Item[]>([]);

  useEffect(() => {
    const fetchData = async () => {
      const data = await fetchItems();
      setItems(data);
    };

    fetchData();
  }, []);

  return items;
}

function combinationList(): Combining[] {
  const [combining, setCombining] = useState<Combining[]>([]);

  useEffect(() => {
    const fetchData = async () => {
      const data = await fetchCombining();
      setCombining(data);
    };

    fetchData();
  }, []);

  return combining;
}
