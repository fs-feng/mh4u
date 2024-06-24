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

export type Decoration = {
    unique: "Decoration";
    id: number;
    num_slots: number;
    item: Item;
};

export type ItemToSkillTree = {
    unique: "ItemToSkillTree";
    id: number;
    item: Item;
    skill_tree: SkillTree;
    point_value: number;
};

export type Weapon = {
    unique: "Weapon";
    id: number;
    parent_id: number;
    wtype: string;
    creation_cost: number;
    upgrade_cost: number;
    attack: number;
    max_attack: number;
    element: string;
    element_attack: number;
    element_2: string;
    element_2_attack: number;
    awaken: string;
    awaken_attack: number;
    defense: number;
    sharpness: string;
    affinity: string;
    horn_notes: string;
    shelling_type: string;
    phial: string;
    charges: string;
    coatings: string;
    recoil: string;
    reload_speed: string;
    rapid_fire: string;
    deviation: string;
    ammo: string;
    special_ammo: string;
    num_slots: number;
    tree_depth: number;
    final: number;
    item: Item;
};

export type Section = {
    unique: "Section";
    id: number;
    title: string;
    icon: string;
    route: string;
}

export type Quest = {
    unique: "Quest";
    id: number;
    name: string;
    goal: string;
    hub: string;
    type: string;
    stars: number;
    location: Location;
    time_limit: number;
    fee: number;
    reward: number;
    hrp: number;
    sub_goal: string;
    sub_reward: number;
    sub_hrp: number;
};

export type MonsterHabitat = {
    id: number;
    monster: Monster;
    location: Location;
    start_area: number;
    move_area: string;
    rest_area: number;
}

export type Gathering = {
    id: number;
    item: Item;
    location: Location;
    area: string;
    site: string;
    rank: string;
    quantity: number;
    percentage: number;
}

export type Armor = {
    unique: "Armor";
    id: number;
    slot: string;
    defense: number;
    max_defense: number;
    fire_res: number;
    thunder_res: number;
    dragon_res: number;
    water_res: number;
    ice_es: number;
    gender: string;
    hunter_type: string;
    num_slots: number;
    item: Item;
};

export type QuestReward = {
    id: number;
    quest: Quest;
    item: Item;
    reward_slot: string;
    percentage: number | null;
    stack_size: number | null;
};

export type MonsterAilment = {
    id: number,
    monster: Monster;
    ailment: string;
}


export type MonsterWeakness = {
    id: number;
    monster: Monster;
    state: string;
    fire: number;
    water: number;
    thunder: number;
    ice: number;
    dragon: number;
    poison: number;
    paralysis: number;
    sleep: number;
    pitfall_trap: number;
    shock_trap: number;
    flash_bomb: number;
    sonic_bomb: number;
    dung_bomb: number;
    meat: number;
};

export type Component = {
    id: number;
    created_item: Item;
    component_item: Item;
    quantity: number;
    type: string;
};


export type Skill = {
    id: number;
    skillTree: SkillTree;
    requiredSkillTreePoints: number;
    name: string;
    nameDe: string;
    nameFr: string;
    nameEs: string;
    nameIt: string;
    nameJp: string;
    description: string;
    descriptionDe: string;
    descriptionFr: string;
    descriptionEs: string;
    descriptionIt: string;
    descriptionJp: string;
};