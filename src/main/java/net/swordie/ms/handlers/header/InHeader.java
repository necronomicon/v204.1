package net.swordie.ms.handlers.header;

import java.util.Arrays;
import java.util.List;

public enum InHeader {
    // Redirector Headers
    CLIENT_REQUEST(0x7773),
    SHOW_CLIENT(0x7774),
    WZ_CHECK_RESPONSE(0x7775),
    CUSTOM_ERROR(0x7776),
    LOGIN_BY_TOKEN(0x7778),

    // GMS Headers
    // Login ops
    CONNECT_CHAT(1),
    REDISPLAY_SERVERLIST(7),
    GUILD_CHAT(19),
    FRIEND_CHAT(20),
    GUEST_LOGIN(22),
    TOS(29),
    VIEW_SERVERLIST(33),
    VIEW_REGISTER_PIC(50),
    VIEW_SELECT_PIC(53),
    CLIENT_FAILED(57),
    PART_TIME_JOB(59),
    CHARACTER_CARD(60),
    ENABLE_LV50_CHAR(61),
    CREATE_LV50_CHAR(62),
    ENABLE_SPECIAL_CREATION(62),
    CREATE_SPECIAL_CHAR(65),

    DUMMY_CODE(100),
    BEGIN_SOCKET(101),
    SECURITY_PACKET(102),
    PERMISSION_REQUEST(103),// v202
    LOGIN_BASIC_INFO(104),// v202
    CHECK_LOGIN_AUTH_INFO(105),// v202
    SELECT_WORLD_BUTTON(106),// v202
    SELECT_WORLD(107),// v202
    CHECK_SPW_REQUEST(108),
    CHAR_SELECT(109),
    CHECK_SPW_EXIST_REQUEST(110),
    MIGRATE_IN(111),
    SELECT_CHARACTER(112),
    SELECT_GO_TO_STARPLANET(113),
    SELECT_ACCOUNT(114),
    WORLD_INFO_REQUEST(115),// v202
    WORLD_INFO_FOR_SHINING_REQUEST(-1),
    CHECK_DUPLICATE_ID(117),
    LOGOUT_WORLD(118),
    PERMISSION_REQUEST_FAKE(119),
    CHECK_LOGIN_AUTH_INFO_FAKE(120),
    CREATE_MAPLE_ACCOUNT_FAKE(121),
    SELECT_ACCOUNT_FAKE(122),
    SELECT_WORLD_FAKE(123),
    SELECT_CHARACTER_FAKE(124),
    CREATE_NEW_CHARACTER_FAKE(125),
    CREATE_NEW_CHARACTER(126),
    DELETE_CHARACTER(130),// v200
    RESERVED_DELETE_CHARACTER_CONFIRM(131),
    RESERVED_DELETE_CHARACTER_CANCEL(132),
    RENAME_CHARACTER(133),
    //ALIVE_ACK_FAKE(134),
    EXCEPTION_LOG(134),
    PRIVATE_SERVER_PACKET(135),
    RESET_LOGIN_STATE_ON_CHECK_OTP(-1),
    CHANGE_SPW_REQUEST(136),
    CHECK_SOW_REQUEST_FAKE(137),
    CHECK_OTP_REQUEST(138),
    CHECK_DELETE_CHARACTEr_OTP(139),
    CHECK_OTP_FOR_WEB_LAUNCHING_REQUEST(140),
    CREATE_SECURITY_HANDLE(141),
    ALBA_REQUEST(142),
    UPDATE_CHARACTER_CARD_REQUEST(143),
    AUTH_HEARTBEAT(147),
    PONG(152),// v202
    CLIENT_ERROR(154),
    CLIENT_START(157),// v202
    CLIENT_EXCEPTION_INFO(158),// v202
    SERVERSTATUS_REQUEST(-1), // disconnects upon sending message (no error given)
    WVS_SET_UP_STEP(159),// v202
    WVS_CRASH_CALLBACK(160),
    WORLD_STATUS_REQUEST(-1),
    WORLD_LIST_REQUEST(165),
    WORLD_LIST_REQ(167),
    CHAR_SELECT_NO_PIC(171),
    USE_AUTH_SERVER(176),
    CHANGE_PIC_REQUEST(191),

    B_E_G_I_N__U_S_E_R(196),
    USER_TRANSFER_FIELD_REQUEST(197),
    USER_TRANSFER_CHANNEL_REQUEST(198),
    USER_TRANSFER_TO_HUB_REQUEST(199),
    WORLD_TRANSFER_REQUEST(200),
    WORLD_TRANSFER_SHINNING_STAR_REQUEST(201),
    // 202
    USER_MIGRATE_TO_CASH_SHOP_REQUEST(203),
    USER_MIGRATE_TO_AUCTION_REQUEST(204),
    USER_MIGRATE_TO_PVP_REQUEST(205),
    PARTY_MIGRATE_TO_PVP_REQUEST(206),
    USER_MIGRATE_TO_MONSTER_FARM(207),
    USER_MIGRATE_TO_MONSTER_FARM_BY_INVITE_ITEM(208),
    USER_REQUEST_PV_P_STATUS(209),
    USER_MIGRATE_TO_PVE_REQUEST(210),
    USER_MOVE(211),
    USER_SIT_REQUEST(212),
    USER_PORTABLE_CHAIR_SIT_REQUEST(213),
    USER_EMOTICON_ITEM_USE_REQUEST(214),
    USER_DANCE_STOP_REQUEST(215),
    USER_MELEE_ATTACK(216),
    USER_SHOOT_ATTACK(217),
    USER_MAGIC_ATTACK(218),
    USER_BODY_ATTACK(219),
    USER_AREA_DOT_ATTACK(220),
    USER_MOVING_SHOOT_ATTACK_PREPARE(221),
    USER_ATTACK_USER(222),
    USER_HIT(223),
    USER_CHAT(224),// 202.3
    USER_A_D_BOARD_CLOSE(225),
    UNK226(226),// or is ad board close ?
    USER_EMOTION(227),
    ANDROID_EMOTION(228),
    USER_ACTIVATE_EFFECT_ITEM(229),
    USER_MONKEY_EFFECT_ITEM(230),
    USER_ACTIVATE_NICK_ITEM(231),
    USER_ACTIVATE_DAMAGE_SKIN(232),
    USER_ACTIVATE_DAMAGE_SKIN__PREMIUM(233),
    USER_DAMAGE_SKIN_SAVE_REQUEST(234),
    USER_DEFAULT_WING_ITEM(235),
    USER_KAISER_TRANSFORM_WING(236),
    USER_KAISER_TRANSFORM_TAIL(237),
    USER_UPGRADE_TOMB_EFFECT(238),
    USER_H_P(239),
    PREMIUM(240),
    USER_BAN_MAP_BY_MOB(-1),// should check it in phantom tutorial
    USER_MONSTER_BOOK_SET_COVER(-1),
    USER_SELECT_NPC(241),
    USER_REMOTE_SHOP_OPEN_REQUEST(242),
    USER_SCRIPT_MESSAGE_ANSWER(243),
    USER_SHOP_REQUEST(244),
    USER_TRUNK_REQUEST(245),
    USER_ENTRUSTED_SHOP_REQUEST(246),
    USER_STORE_BANK_REQUEST(247),
    USER_PARCEL_REQUEST(248),
    USER_EFFECT_LOCAL(249),
    USER_SPECIAL_EFFECT_LOCAL(250),
    USER_FINAL_ATTACK_REQUEST(251),
    USER_CREATE_AREA_DOT_REQUEST(252),
    USER_CREATE_HOLIDOM_REQUEST(253),
    REQ_MAKING_SKILL_EFF(254),
    SHOP_SCANNER_REQUEST(255),
    SHOP_LINK_REQUEST(256),
    AUCTION_REQUEST(257),
    AUCTION_REQUEST_2(258),
    ADMIN_SHOP_REQUEST(259),
    USER_GATHER_ITEM_REQUEST(260),
    USER_SORT_ITEM_REQUEST(261),
    USER_CHANGE_SLOT_POSITION_REQUEST(262),
    USER_TEXT_EQUIP_INFO(263),
    USER_POP_OR_PUSH_BAG_ITEM_TO_INVEN(264),
    USER_BAG_TO_BAG_ITEM(265),
    USER_POUR_IN_BAG_TO_BAG(266),
    USER_STAT_CHANGE_ITEM_USE_REQUEST(267),
    USER_STAT_CHANGE_ITEM_CANCEL_REQUEST(268),
    USER_STAT_CHANGE_BY_PORTABLE_CHAIR_REQUEST(269),
    USER_MOB_SUMMON_ITEM_USE_REQUEST(270),
    USER_PET_FOOD_ITEM_USE_REQUEST(271),
    USER_TAMING_MOB_FOOD_ITEM_USE_REQUEST(272),
    USER_SCRIPT_ITEM_USE_REQUEST(273),
    USER_RECIPE_OPEN_ITEM_USE_REQUEST(274),
    USER_CONSUME_CASH_ITEM_USE_REQUEST(275),
    USER_ADDITIONAL_SLOT_EXTEND_ITEM_USE_REQUEST(276),
    USER_CASH_PET_PICK_UP_ON_OFF_REQUEST(277),
    USER_CASH_PET_SKILL_SETTING_REQUEST(278),
    USER_OPTION_CHANGE_REQUEST(279),
    USER_DESTROY_PET_ITEM_REQUEST(280),
    USER_BRIDLE_ITEM_USE_REQUEST(281),
    USER_SKILL_LEARN_ITEM_USE_REQUEST(282),
    USER_SKILL_RESET_ITEM_USE_REQUEST(283),
    USER_ABILITY_RESET_ITEM_USE_REQUEST(284),
    USER_ABILITY_CHANGE_ITEM_USE_REQUEST(285),
    USER_EXP_CONSUME_ITEM_USE_REQUEST(286),
    USER_MONSTER_LIFE_INVITE_ITEM_USE_REQUEST(287),
    USER_EXP_ITEM_GET_REQUEST(288),
    USER_CHAR_SLOT_INC_ITEM_USE_REQUEST(289),
    USER_CHAR_RENAME_ITEM_USE_REQUEST(290),
    USER_KAISER_COLOR_CHANGE_ITEM_USE_REQUEST(291),
    USER_SHOP_SCANNER_ITEM_USE_REQUEST(292),
    USER_MAP_TRANSFER_ITEM_USE_REQUEST(293),
    USER_PORTAL_SCROLL_USE_REQUEST(294),
    USER_FIELD_TRANSFER_REQUEST(295),
    USER_UPGRADE_ITEM_USE_REQUEST(296),
    USER_UPGRADE_ASSIST_ITEM_USE_REQUEST(297),
    USER_HYPER_UPGRADE_ITEM_USE_REQUEST(298),
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // TODO: update them by sniffing
    USER_EX_ITEM_UPGRADE_ITEM_USE_REQUEST(299),
    USER_KARMA_CONSUME_ITEM_USE_REQUEST(300),
    USER_EVENT_UPGRADE_ITEM_USE_REQUEST(301),
    // 302
    // 303
    USER_ITEM_OPTION_UPGRADE_ITEM_USE_REQUEST(304),
    USER_ADDITIONAL_OPT_UPGRADE_ITEM_USE_REQUEST(305),
    USER_ITEM_SLOT_EXTEND_ITEM_USE_REQUEST(306),
    USER_WEAPON_TEMP_ITEM_OPTION_REQUEST(307),
    USER_ITEM_SKILL_SOCKET_UPGRADE_ITEM_USE_REQUEST(308),
    USER_ITEM_SKILL_OPTION_UPGRADE_ITEM_USE_REQUEST(309),
    USER_FREE_MIRACLE_CUBE_ITEM_USE_REQUEST(310),
    USER_EQUIPMENT_ENCHANT_WITH_SINGLE_UI_REQUEST(311),
    USER_UI_OPEN_ITEM_USE_REQUEST(312),
    USER_BAG_ITEM_USE_REQUEST(313),
    USER_ITEM_RELEASE_REQUEST(318),
    USER_MEMORIAL_CUBE_OPTION_REQUEST(319),
    USER_USE_NAVI_FLYING_SKILL_REQUEST(320),
    USER_TOADS_HAMMER_REQUEST(321),
    USER_TOADS_HAMMER_HELP_REQUEST(322),
    // 323
    // 324
    USER_CHANGE_SOUL_COLLECTION_REQUEST(325),
    USER_SELECT_SOUL_SKILL_UP_REQUEST(326),
    USER_ABILITY_UP_REQUEST(327),// 202.3
    USER_ABILITY_MASS_UP_REQUEST(328),
    USER_DOT_HEAL(329),
    USER_CHANGE_STAT_REQUEST(330),
    USER_CHANGE_STAT_REQUEST_BY_ITEM_OPTION(331),
    SET_SON_OF_LINKED_SKILL_REQUEST(332),
    USER_SKILL_UP_REQUEST(335),
    USER_SKILL_USE_REQUEST(336),
    USER_SKILL_CANCEL_REQUEST(337),
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // TODO: update by sniffing
    USER_SKILL_UNKNOWN(338),// sent in 64001009 [int[skillID]] [byte[1]]
    USER_SKILL_PREPARE_REQUEST(339),
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    USER_DROP_MONEY_REQUEST(342),
    USER_GIVE_POPULARITY_REQUEST(343),
    USER_PARTY_REQUEST(344),
    USER_CHARACTER_INFO_REQUEST(345),
    USER_ACTIVATE_PET_REQUEST(346),
    USER_REGISTER_PET_AUTO_BUFF_REQUEST(347),
    USER_TEMPORARY_STAT_UPDATE_REQUEST(348),
    USER_PORTAL_SCRIPT_REQUEST(349),
    USER_PORTAL_TELEPORT_REQUEST(350),
    USER_CALLING_TELEPORT_REQUEST(351),
    USER_MAP_TRANSFER_REQUEST(352),
    USER_ANTI_MACRO_ITEM_USE_REQUEST(353),
    USER_ANTI_MACRO_SKILL_USE_REQUEST(354),
    USER_OLD_ANTI_MACRO_QUESTION_RESULT(355),
    USER_ANTI_MACRO_REFRESH_REQUEST(356),
    USER_CLAIM_REQUEST(357),
    USER_QUEST_REQUEST(358),
    USER_MEDAL_REISSUE_REQUEST(359),
    USER_CALC_DAMAGE_STAT_SET_REQUEST(360),
    USER_B2_BODY_REQUEST(361),
    USER_THROW_GRENADE(362),
    USER_DESTROY_GRENADE(363),
    USER_CREATE_AURA_BY_GRENADE(364),
    USER_SET_MOVE_GRENADE(365),
    USER_MACRO_SYS_DATA_MODIFIED(366),
    USER_SELECT_NPC_ITEM_USE_REQUEST(367),
    USER_LOTTERY_ITEM_USE_REQUEST(368),
    USER_ROULETTE_START_REQUEST(369),
    USER_ROULETTE_RESULT_REQUEST(370),
    USER_ITEM_MAKE_REQUEST(371),
    USER_REPAIR_DURABILITY_ALL(372),
    USER_REPAIR_DURABILITY(373),
    USER_QUEST_RECORD_SET_STATE(374),
    USER_CLIENT_TIMER_END_REQUEST(-1),
    USER_CLIENT_RESOLUTION_RESULT(375),
    USER_FOLLOW_CHARACTER_REQUEST(376),
    USER_FOLLOW_CHARACTER_WITHDRAW(377),
    USER_SELECT_PQ_REWARD(378),
    USER_REQUEST_PQ_REWARD(379),
    SET_PASSENSER_RESULT(380),
    USER_REQUEST_INSTANCE_TABLE(381),
    USER_REQUEST_CREATE_ITEM_POT(-1),
    USER_REQUEST_REMOVE_ITEM_POT(350),
    USER_REQUEST_INC_ITEM_POT_LIFE_SATIETY(351),
    USER_REQUEST_CURE_ITEM_POT_LIFE_SICK(352),
    USER_REQUEST_COMPLATE_TO_ITEM_POT(353),
    USER_REQUEST_RESPAWN(354),
    USER_CONSUME_HAIR_ITEM_USE_REQUEST(355),
    USER_FORCE_ATOM_COLLISION(391),// or it just another packet.
    USER_DEBUFF_OBJ_COLLISION(357),
    USER_UPDATE_LAPIDIFICATION(358),
    USER_REQUEST_CHARACTER_POTENTIAL_SKILL_RAND_SET(359),
    USER_REQUEST_CHARACTER_POTENTIAL_SKILL_RAND_SET_UI(360),
    USER_REQUEST_OCCUMPATION_DATA(-1),
    USER_REQUEST_ASWAN_TIME_TABLE_CLIENT_INIT(362),
    USER_PROTECT_BUFF_DIE_ITEM_REQUEST(363),
    USER_PROTECT_BUFF_DIE_MAPLE_POINT_REQUEST(364),
    USER_PROTECT_EXP_DIE_MAPLE_POINT_REQUEST(365),
    USER_KEY_DOWN_AREA_MOVING(366),
    USER_CHECK_WEDDING_EX_REQUEST(367),
    USER_UNK392(392),
    USER_CATCH_DEBUFF_COLLISION(406),
    USER_AFFECTED_AREA_CREATED(407),
    USER_AFFECTED_AREA_REMOVED(408),
    USER_DAZZLE_HIT(409),
    USER_MESO_EXCHANGE_REQUEST(372),
    ZERO_TAG(373),
    ZERO_SHARE_CASH_EQUIP_PART(374),
    ZERO_LAST_ASSIST_STATE(375),
    USER_SHOOT_ATTACK_IN_FPS(376),
    USER_LUCKY_ITEM_USE_REQUEST(419),
    USER_MOB_MOVE_ABILITY_CHANGE(420),
    USER_DRAGON_ACTION(421),
    USER_DRAGON_BREATH_EARTH_EFFECT(422),
    USER_RENAME_REQUEST(-1),// was 381
    BROADCAST_MSG(425),
    GROUP_MESSAGE(426),
    FIELD_UNIVERSE_MESSAGE(384),
    WHISPER(429),
    MESSENGER(430),
    MINI_ROOM_2(431),
    MINI_ROOM(432),
    UNK433(433),
    PARTY_REQUEST(434),
    PARTY_RESULT(435),
    PARTY_INVITABLE_SET(436),
    EXPEDITION_REQUEST(437),
    PARTY_ADVER_REQUEST(438),
    URUS_PARTY_REQUEST(439),
    GUILD_REQUEST(440),
    GUILD_RESULT(441),
    GUILD_JOIN_REQUEST(442),
    GUILD_JOIN_CANCEL_REQUEST(443),
    GUILD_JOIN_ACCEPT(444),
    GUILD_JOIN_REJECT(445),
    GUILD_CONTENT_RANK_REQUEST(446),
    TOWER_RANK_REQUEST(447),
    ADMIN(448),// v202
    LOG(449),// v202
    FRIEND_REQUEST(450),
    STAR_FRIEND_REQUEST(451),
    STAR_PLANET_POINT_REQUEST(452),
    LOAD_ACCOUNT_ID_OF_CHARACTER_FRIEND_REQUEST(453),
    MEMO_REQUEST(454),
    MEMO_FLAG_REQUEST(455),
    ENTER_TOWN_PORTAL_REQUEST(456),
    ENTER_RANDOM_PORTAL_REQUEST(457),
    ENTER_OPEN_GATE_REQUEST(458),
    SLIDE_REQUEST(459),
    FUNC_KEY_MAPPED_MODIFIED(460),
    R_P_S_GAME(461),
    G_S_R_P_S_GAME(462),
    STAR_PLANET__G_S_R_P_S_GAME(463),
    G_S_R_P_S_FORCE_SELECT(464),
    MARRIAGE_REQUEST(465),
    WEDDING_WISH_LIST_REQUEST(466),
    GUEST_BLESS(467),
    BOOBY_TRAP_ALERT(468),
    STALK_BEGIN(469),
    ALLIANCE_REQUEST(470),
    ALLIANCE_RESULT(471),
    TALK_TO_TUTOR(472),
    TALK_TO_PARTNER(473),
    USER_SWITCH_R_P(474),
    REQUEST_INC_COMBO(475),
    REQUEST_DEC_COMBO(476),
    REQUEST_SET_BLESS_OF_DARKNESS(477),
    REQUEST_SET_HP_BASE_DAMAGE(478),
    UNK479(479),
    UNK480(480),
    UNK481(481),
    MOB_CRC_KEY_CHANGED_REPLY(482),
    MOB_CRC_DATA_RESULT(483),
    MAKING_SKILL_REQUEST(444),
    BROADCAST_EFFECT_TO_SPLIT(445),
    BROADCAST_ONE_TIME_ACTION_TO_SPLIT(446),
    BROADCAST_AFFECTED_EFFECT_TO_SPLIT(447),
    DEBUG_ONLY_COMMAND(448),
    MICRO_BUFF_END_TIME(449),
    REQUEST_SESSIVALUE(450),
    USER_TRANSFER_FREE_MARKET_REQUEST(451),
    USER_REQUEST_SET_STEAL_SKILL_SLOT(452),
    USER_REQUEST_STEAL_SKILL_MEMORY(453),
    USER_REQUEST_STEAL_SKILL_LIST(454),
    USER_REQUEST_STEAL_SKILL(455),
    REWARD_MOB_LIST_REQUEST(456),
    USER_LV_UP_GUIDE_NOTICE(457),
    RESET_CROSS_HUNTER_ALERT(458),
    CROSS_HUNTER_COMPLETE_REQUEST(459),
    CROSS_HUNTER_SHOP_REQUEST(460),
    USER_EQUIP_SLOT_LEVEL_MINUS_ITEM_USE_REQUEST(461),
    BOARD_GAME_REQUEST(462),
    USER_REQUEST_FLYING_SWORD_START(506),
    BINGO_REQUEST(507),
    BINGO_CASSANDRA_REQUEST(508),
    ACTION_BAR_REQUEST(509),
    USER_REQUEST_SET_OFF_TRINITY(510),
    MESO_RANGER_REQUEST(511),
    USER_REQUEST_SET_SMASH_COUNT(512),
    USER_HYPER_SKILL_UP_REQUEST(513),
    USER_HYPER_SKILL_RESET_REQUSET(514),
    USER_HYPER_STAT_SKILL_UP_REQUEST(515),
    USER_HYPER_STAT_SKILL_RESET_REQUEST(516),
    USER_SET_DRESS_CHANGED_REQUEST(517),
    ENTRY_RECORD_REQUEST(518),
    SET_MAX_GAUGE(519),
    USER_RETURN_EFFECT_RESPONSE(520),
    GET_SERVER_TIME(521),
    GET_CHARACTER_POSITION(522),
    USER_REQUEST_CHANGE_MOB_ZONE_STATE(523),
    EVOLVING_REQUEST(524),
    USER_MIXER_REQUEST(525),
    SUMMON_EVENT_REWARD(526),
    MYSTIC_FIELD_MOVE(527),
    YUT_GAME_REQUEST(528),
    USER_JEWEL_CRAFT_REQUEST(529),
    VALUE_PACK_REQUEST(530),
    REQUEST_RELOGIN_COOKIE(531),
    WAIT_QUEUE_REQUEST(532),
    CHECK_TRICK_OR_TREAT_REQUEST(533),
    MONSTER_FARM_MIGRATE_OUT_REQUEST(534),
    HALLOWEEN_CANDY_RANKING_REQUEST(535),
    GET_REWARD_REQUEST(536),
    MAPLE_STYLE_BONUS_REQUEST(537),
    MAPLE_STYLE_ADVICE_REQUEST(538),
    MAPLE_STYLE_SET_SCORE_REQUEST(539),
    MENTORING(540), // start -1
    GET_LOTTERY_RESULT(541),
    ROOTABYSS_ENTER_REQUEST(542),
    USER_SET_ITEM_ACTION(543),
    USER_SET_BITS_CASE(544),
    USER_SET_BITS_SLOT(545),
    USER_ANTI_MACRO_QUESTION_RESULT(546),
    USER_PINKBEAN_ROLLING(547),
    USER_PINKBEAN_YO_YO_STACK(548),
    USER_QUICK_MOVE_SCRIPT(549),
    TIME_GATE_REQUEST(550),
    USER_SELECT_ANDROID(551),
    USER_COMPLETE_NPC_SPEECH(552),
    USER_COMPLETE_ANOTHER_USER_CHECK(553),
    USER_COMPLETE_COMBO_KILL_COUNT_CHECK(554),
    USER_COMPLETE_MULTI_KILL_COUNT_CHECK(555),
    USER_COMPLETE_MULTI_KILL_CHECK(556),
    USER_DAMAGE_FALLING_CHECK(557),
    USER_COMPLETE_PERSONAL_SHOP_BUY_CHECK(558),
    USER_DAILY_COMMITMENT_CHECK(559),
    USER_MOB_DROP_MESO_PICKUP(560),
    USER_BREAK_TIME_FIELD_ENTER(561),
    USER_RUN_ACT_QUEST(562),
    JOURNAL_AVATAR_REQUEST(563),
    REQUEST_EVENT_LIST(564),
    USER_SIGN_REQUEST(565),
    ADD_ATTACK_RESET(566),
    SET_EVENT_NAME_TAG(567),
    UNK568(568),
    UNK569(569),// some thing with CUserLocal::TryDoingFlameBall & CUserLocal::TryDoingForceAtomAttack_NonTarget
    UNK570(570),
    USER_AFFECTED_AREA_REMOVE_BY_TIME(571),
    REQUEST_FREE_CHANGE_JOB(572),
    LIBRARY_START_SCRIPT(573),// v203
    CHANNEL_USER_COUNT_REQUEST(574),
    UN_URUS_SELECTED_SKILL_LIST(575),
    SOUL_DUNGESYS(576),
    USER_COORDINATION_CONTEST_REQUEST(577),
    USER_SOUL_EFFECT_REQUEST(578),
    USER_SPIN_OFF_NEW_MODIFY_REQUEST(579),
    BLACK_LIST(580),// v203.2
    SKILL_HELPER_POPUP(534),
    BLOCKBUSTER(535),
    M_TALK_OFFLINE_ACCOUNT_FRIENDS_NAME_REQUEST(536),
    CHARACTER_BURNING(537),
    UPDATE_CHARACTER_SELECT_LIST(538),
    DIRECT_GO_TO_FIELD(539),
    TRY_REGISTER_TELEPORT(540),
    USER_TOWER_CHAIR_SETTING(541),
    USER_LAST_COLLECT_MONSTER_RESET(542),
    END_OVER_HEAT(543),
    TRADE_KING_SHOP_REQ(544),
    TRADE_KING_SHOP_INFO_REQ(545),
    UPDATE_MATRIX(605),// v202
    SPECTRA_ENERGY_UPDATE(608),


    B_E_G_I_N__P_E_T(625),
    PET_MOVE(626),
    PET_ACTION(627),
    PET_INTERACTION_REQUEST(628),
    PET_DROP_PICK_UP_REQUEST(629),
    PET_STAT_CHANGE_ITEM_USE_REQUEST(630),
    PET_UPDATE_EXCEPTION_LIST_REQUEST(631),
    PET_FOOD_ITEM_USE_REQUEST(632),
    PET_OPEN_SHOP(633),
    E_N_D__P_E_T(634),


    B_E_G_I_N__S_K_I_L_L_P_E_T(635),
    SKILL_PET_MOVE(636),
    SKILL_PET_ACTION(637),
    SKILL_PET_STATE(638),
    SKILL_PET_DROP_PICK_UP_REQUEST(639),
    SKILL_PET_UPDATE_EXCEPTION_LIST_REQUEST(640),
    E_N_D__S_K_I_L_L_P_E_T(641),

    B_E_G_I_N__S_U_M_M_O_N_E_D(642),
    SUMMONED_MOVE(643),
    SUMMONED_ATTACK(644),
    SUMMONED_HIT(566),
    SUMMONED_SKILL(567),
    SUMMONED_REMOVE(568),
    SUMMONED_ATTACK_PV_P(569),
    SUMMONED_ACTION(570),
    SUMMONED_ASSIST_ATTACK_DONE(653),
    E_N_D__S_U_M_M_O_N_E_D(654),


    B_E_G_I_N__D_R_A_G_O_N(659),
    DRAGON_MOVE(660),
    DRAGON_GLIDE(661),
    E_N_D__D_R_A_G_O_N(662),


    B_E_G_I_N__A_N_D_R_O_I_D(663),
    ANDROID_MOVE(664),
    ANDROID_ACTION_SET(665),
    E_N_D__A_N_D_R_O_I_D(666),


    B_E_G_I_N__F_O_X_M_A_N(667),
    FOX_MAN_MOVE(668),
    FOX_MAN_ACTION_SET_USE_REQUEST(669),
    E_N_D__F_O_X_M_A_N(670),

    QUICKSLOT_KEY_MAPPED_MODIFIED(671),
    PASSIVESKILL_INFO_UPDATE(672),
    UPDATE_CLIENT_ENVIRONMENT(673),
    DIRECTION_NODE_COLLISION(676),
    USER_LASER_INFO_FOR_REMOTE(589),
    RETURN_TELEPORT_DEBUFF(590),
    CHECK_PROCESS(591),
    MEMO_IN_GAME_REQUEST(454),
    EGO_EQUIP_GAUGE_COMPLETE_RETURN(680),
    EGO_EQUIP_CREATE_UPGRADE_ITEM(681),// v202.6
    EGO_EQUIP_CREATE_UPGRADE_ITEM_COST_REQUEST(682),
    EGO_EQUIP_TALK_REQUEST(683),
    EGO_EQUIP_CHECK_UPDATE_ITEM_REQUEST(684),
    INHERITANCE_INFO_REQUEST(685),
    INHERITANCE_UPGRADE_REQUEST(686),
    MIRROR_READING_SELECT_BOOK_REQUEST(687),
    LIKE_POINT(688),
    USER10TH_STREAMING_URL_REQUEST(689),
    USER_UPDATE_MAPLE_TV_SHOW_TIME(690),
    REDUCE_DOT_DAMGE_BASE_BUFF_REQUEST(691),
    MIRROR_STUDY_COMPLETE(692),
    REQUEST_ARROW_PLATER_OBJ(693),// was 605
    USER_TIME_EVENT_UI_OPEN_REQUEST(694),
    USER_TIME_EVENT_RESULT_REQUEST(695),
    USER_TIME_EVENT_COMPLETE_REQUEST(696),// was 608
    USER_TIME_EVENT_PASSED_TIME_SET(697),
    INVASION_SETTING_REQUEST(698),
    USER_FIELD_ATTACK_OBJ_REQUEST_BOARDING(699),
    USER_FIELD_ATTACK_OBJ_REQUEST_GET_OFF(700),
    MONSTER_BATTLE(701),
    BOSS_ARENA_MATCH_REQUEST(702),
    BOSS_ARENA_MIGRATE_REQUEST(703),
    MOB_USER_CONTROL_SKILL_Q_PUSH(704),
    MOB_USER_CONTROL_SKILL_Q_POP(705),
    MOB_USER_CONTROL_SKILL_FORCED_Q_POP(706),
    PARTY_QUEST_RANKING_REQUEST(707),
    ATTENDANCE_EVENT(708),
    ATTENDANCE_EVENT_REWARD_REQ(709),
    UI_ATTENDANCE_GHOST_CHANGE_REQ(710),
    EVENT_UI_REQ(711),
    ATTENDANCE_EVENT_SELECT_REWARD(712),
    USER_SET_CUSTOMIZE_EFFECT(713),
    USER_CUSTOMIZE_EFFECT_ITEM_MODIFY(714),
    USER_GROWTH_HELPER_REQUEST(715),
    USER_CONTENTS_MAP_REQUEST(716),
    USER_TIMER_REQ(717),
    USER_MANNEQUIN(718),
    USER_BUFFER_FLY_REQ(719),
    UNK_720(720),
    UNK_721(721),
    UNK_722(722),
    USER_NON_TARGET_FORCE_ATOM_ATTACK(723),
    USER_RUN_SCRIPT(724),
    CHECK_BOSS_PARTY_BY_SCRIPT(725),
    SET_GO_TO_SHINE_CITY_WAIT_FIELD(726),
    SET_STARPLANET_MINI_GAME_CUSTOMIZING_OPTION(727),
    STAR_PLANET_TREND_SHOP_SET_AVATAR(728),
    STAR_PLANET_TREND_SHOP_RESTORE_AVATAR(729),
    STAR_PLANET_REQUEST(730),
    STAR_PLANET_MATCHING_REENTRANCE(731),
    STAR_PLANET_RESULT_UI_EXIT_SCRIPT(732),
    MOVE_TO_URUS_WAITING_FIELD(733),
    MONSTER_COLLECTION_COMPLETE_REWARD_REQ(734),
    MONSTER_COLLECTION_EXPLORE_REQ(735),
    PLAT_FORMAR_ENTER_REQUEST(736),
    UNK_737(737),
    STIGMA_DELEVERY_REQUEST(738),

    B_E_G_I_N__E_V_E_N_T__G_R_O_U_P(743),
    INVITATION_ACCEPT_USER(744), // was IACCEPT
    INVITATION_CANCEL_USER(745), // was CANCLE
    EVENT_GROUP_LEAVE(746),
    B_E_G_I_N__E_V_E_N_T__G_R_O_U_P__P_A_C_K_E_T(652),
    E_N_D__E_V_E_N_T__G_R_O_U_P__P_A_C_K_E_T(653),
    E_N_D__E_V_E_N_T__G_R_O_U_P(654),

    B_E_G_I_N__E_V_E_N_T__R_A_N_K_I_N_G(655),
    EVENT_RANKING_OPEN(656),
    EVENT_RANKING_HELP(657),
    E_N_D__E_V_E_N_T__R_A_N_K_I_N_G(658),

    B_E_G_I_N__A_F_R_E_E_C_A_T_V(659),
    AFREECA_TV_BROAD_START(660),
    AFREECA_TV_BROAD_STOP(661),
    E_N_D__A_F_R_E_E_C_A_T_V(662),

    B_E_G_I_N__S_T_A_R_P_L_A_N_E_T__M_A_T_C_H_I_N_G(663),
    STAR_PLANET_MATCHING__REGISTER_REQ(664),
    STAR_PLANET_MATCHING__UN_REGISTER_REQ(665),
    STAR_PLANET_MATCHING__REGISTER_PARTY_REQ(666),
    STAR_PLANET_MATCHING__JOIN_PARTY_PLAY_REQ(667),
    STAR_PLANET_MATCHING__TRANSFER_ASSENT(668),
    STAR_PLANET_MATCHING__HELP_SCRIPT(669),
    E_N_D__S_T_A_R_P_L_A_N_E_T__M_A_T_C_H_I_N_G(670),

    B_E_G_I_N__S_T_A_R_P_L_A_N_E_T__Q_U_E_U_E(671),
    STAR_PLANET_QUEUE__REGISTER_REQ(672),
    STAR_PLANET_QUEUE__UN_REGISTER_REQ(673),
    E_N_D__S_T_A_R_P_L_A_N_E_T__Q_U_E_U_E(674),


    B_E_G_I_N__S_T_A_R_P_L_A_N_E_T__I_N_V_I_T_A_T_I_O_N(766),
    STAR_PLANET_INVITATION_ACCEPT(767),
    STAR_PLANET_INVITATION_CANCLE(768),
    E_N_D__S_T_A_R_P_L_A_N_E_T__I_N_V_I_T_A_T_I_O_N(769),

    USER_SURVEY_REQUEST(679),
    NPS_INFO(680),
    USER_FLAME_ORB_REQUEST(681),
    USER__SAD_RESULT_UI__CLOSE(682),
    FREE_LOOK_CHANGE_REQUEST(683),
    FREE_LOOK_CHANGE_UI_OPEN_FAILED(684),
    USER_SMART_PHONE_CALL_REQUEST(685),
    USER_JAGUAR_CHANGE_REQUEST(686),
    FPS_LOG(687),
    PACKET_MODIFY_LOG(688),
    BATTLE_USER_AVATAR_SELECT(689),
    BATTLE_USER_ATTACK(690),
    BATTLE_USER_ATTACK_EXPIRE(691),
    BATTLE_USER_ATTACK_POSITION(692),
    BATTLE_USER_HIT(693),
    BATTLE_USER_HIT_BY_MOB(694),
    BATTLE_STAT_CORE_REQUEST(695),
    BATTLE_USER_ALIVE(696),
    USER_CONTENTS_BOOK_REQUEST(697),
    PERFORMANCE_CLIENT_LOGIN(698),
    PERFORMANCE_CLIENT_IN_FIELD(699),
    PING_CHECK_REQUEST__CLIENT_TO_GAME(700),
    PING__CLIENT_TO_GAME(701),
    PLANT_POT_CLICK(702),
    RANDOM_MISSION_REQUEST(703),
    ITEM_COLLECTION_SET_FLAG(704),
    ITEM_COLLECTION_CHECK_COMPLETE(705),
    SELF_STAT_CHANGE_REQUEST(706),
    CASH_BUFF_EVENT_CANCLE(707),
    CREATE_PSYCHIC_LOCK(708),
    RESET_PATH_PSYCHIC_LOCK(709),
    RELEASE_PSYCHIC_LOCK(808),
    RESERVE_DAMAGE_PSYCHIC_LOCK(809),
    CREATE_KINESIS_PSYCHIC_AREA(810),
    DO_ACTIVE_PSYCHIC_AREA(811),
    DEBUFF_PSYCHIC_AREA(812),
    RELEASE_PSYCHIC_AREA(813),
    PSYCHIC_OVER_REQUEST(814),
    DEC_PSYCHIC_POINT_REQUEST(815),
    TOUCH_ME_END_REQUEST(816),
    UNK_817(817),
    BITE_ATTACK_RESPONSE(818),
    SAVE_URUS_SKILL(819),
    GET_SAVED_URUS_SKILL(820),
    URUS_SHOP_REQUEST(722),
    URUS_PARTY_MEMBER_LIST(723),
    USER_KEY_DOWN_STEP_REQUEST(724),
    DAILY_GIFT_REQUEST(725),
    SKILL_COMMAND_LOCK(726),
    BEAST_FORM_WING_OFF(824),// v202.3
    RESET_AIR_HIT_COUNT_REQUEST(728),
    RW_ACTION_CANCEL(729),
    RELEASE_RW_GRAB(730),
    RW_CLEAR_CURRENT_ATTACK_REQUEST(731),
    RW_MULTI_CHARGE_CANCEL_REQUEST(732),
    UNITY_PORTAL_REQUEST(833),
    UNK842(842),// called from CUserLocal::TryDoingMagicAttack
    SPOTLIGHT_STATE_REQUEST(849),
    COMBAT_STATE_STACK_REQUEST(871),
    FUNTION_FOOTHOLD_MAN(733),
    DIVINE_ECHO(873),
    MONSTER_BOOK_MOB_INFO(893),
    GACHAPON_REQUEST(894),
    NEBULITE_INSERT_REQUEST(895),
    SOCKET_CREATE_REQUEST(896),

    FAMILIAR_ADD_REQUEST(906),
    FAMILIAR_SPAWN_REQUEST(907),
    FAMILIAR_RENAME_REQUEST(908),

    FAMILIAR_MOVE(964),
    FAMILIAR_ATTACK(664),
    FAMILIAR_SKILL(665),
    UNK865(865),
    // Beast Tamer
    BEAST_TAMER_REGROUP_REQUEST(790),

    GUILD_BBS(766),

    E_N_D__U_S_E_R(821),

    B_E_G_I_N__F_I_E_L_D(822),
    B_E_G_I_N__L_I_F_E_P_O_O_L(823),


    // v203.2
    B_E_G_I_N__M_O_B(1003),
    MOB_MOVE(1004),
    MOB_APPLY_CTRL(1005),
    MOB_DROP_PICK_UP_REQUEST(1006),
    MOB_HIT_BY_OBSTACLE(1007),
    MOB_HIT_BY_OBSTACLE_ATOM(1008),
    MOB_HIT_BY_MOB(1009),
    MOB_SELF_DESTRUCT(1010),
    MOB_SELF_DESTRUCT_COLLISIGROUP(1011),
    MOB_UNK_1012(1012),
    MOB_ATTACK_MOB(1013),
    MOB_SKILL_DELAY_END(1014),// v203.3
    MOB_TIME_BOMB_END(1015),
    MOB_ESCORT_COLLISION(1016),
    MOB_REQUEST_ESCORT_INFO(1017),
    MOB_ESCORT_STOP_END_REQUEST(1018),
    MOB_AREA_ATTACK_DISEASE(1019),
    MOB_UNK_1020(1020),
    MOB_EXPLOSION_START(1021),
    MOB_LIFTING_END(1022),
    MOB_UPDATE_FIXED_MOVE_DIR(1023),
    MOB_CREATE_FIRE_WALK(1024),
    MOB_AFTER_DEAD_REQUEST(1025),
    MOB_DAMAGE_SHARE_INFO(1026),
    MOB_CREATE_AFFECTED_AREA(1027),
    MOB_DOWN_RESPONSE(1028),// v203.2
    MOB_UNK_1027(1029),
    MOB_UNK_1028(1030),
    MOB_UNK_1030(1031),
    MOB_UNK_1032(1032),
    E_N_D__M_O_B(1033),


    // v203.2
    B_E_G_I_N__N_P_C(1038),
    NPC_MOVE(1039),
    NPC_SPECIAL_ACTION(1040),
    E_N_D__N_P_C(1041),
    E_N_D__L_I_F_E_P_O_O_L(1042),

    // v203.2
    B_E_G_I_N__D_R_O_P_P_O_O_L(1043),
    DROP_PICK_UP_REQUEST(1044),
    E_N_D__D_R_O_P_P_O_O_L(1045),


    B_E_G_I_N__R_E_A_C_T_O_R_P_O_O_L(1046),
    REACTOR_HIT(1047),
    REACTOR_CLICK(1048),
    REACTOR_RECT_IN_MOB(1049),
    REACTOR_KEY(1050),
    E_N_D__R_E_A_C_T_O_R_P_O_O_L(1051),


    // v203.2
    B_E_G_I_N__F_I_S_H_I_N_G_Z_O_N_E_P_O_O_L(1064),
    FISHING_INFO(1063),
    FISHING_END(1064),
    E_N_D__F_I_S_H_I_N_G_Z_O_N_E_P_O_O_L(1065),

    B_E_G_I_N__P_E_R_S_O_N_A_L__O_B_J_E_C_T(867),
    DECOMPOSER_REQUEST(868),
    E_N_D__P_E_R_S_O_N_A_L__O_B_J_E_C_T(869),

    // v203.2
    B_E_G_I_N__E_V_E_N_T__F_I_E_L_D(1074),
    EVENT_START(1075),
    SNOW_BALL_HIT(1076),
    SNOW_BALL_TOUCH(1077),
    COCONUT_HIT(1078),
    TOURNAMENT_MATCH_TABLE(1079),
    PULLEY_HIT(1080),
    E_N_D__E_V_E_N_T__F_I_E_L_D(1081),

    // v203.2
    B_E_G_I_N__M_O_N_S_T_E_R__C_A_R_N_I_V_A_L__F_I_E_L_D(1082),
    M_CARNIVAL_REQUEST(1083),
    E_N_D__M_O_N_S_T_E_R__C_A_R_N_I_V_A_L__F_I_E_L_D(1084),

    // v203.2
    B_E_G_I_N__D_E_F_E_N_S_E__F_I_E_L_D(1085),
    DEFENSE_GAME_REQUEST(1086),
    E_N_D__D_E_F_E_N_S_E__F_I_E_L_D(1087),

    C_O_N_T_I_S_T_A_T_E(1088),

    B_E_G_I_N__P_A_R_T_Y__M_A_T_C_H(1089),
    INVITE_PARTY_MATCH(1090),
    CANCEL_INVITE_PARTY_MATCH(1091),
    PARTY_MEMBER_CANDIDATE_REQUEST(1092),
    URUS_PARTY_MEMBER_CANDIDATE_REQUEST(1093),
    PARTY_CANDIDATE_REQUEST(1094),
    INTRUSION_FRIEND_CANDIDATE_REQUEST(1095),
    INTRUSION_LOBBY_CANDIDATE_REQUEST(1096),
    END_PARTY_MATCH(1097),
    REQUEST_FOOT_HOLD_MOVE(1098),
    GATHER_REQUEST(1099),
    GATHER_END_NOTICE(1100),
    ACT_CHANGE_REACTOR_USE_REQUST(1101),
    USER_ANTI_MACRO_BOMB_REQUEST(1102),
    MAKE_ENTER_FIELD_PACKET_FOR_QUICK_MOVE(1103),
    RUNE_STONE_USE_REQ(1104),
    RUNE_STONE_SKILL_REQ(1105),
    OBTACLE_ATOM_COLLISION(1106),
    TIMER_GAUGE_TIMEOUT(1107),
    FALLING_CATCHER_HACK_CHECK(1108),
    COOK_GAME_REQUEST(1109),
    FPS_MODE_EXIT_REQUEST(1110),
    MAKE_ENTER_FIELD_PACKET_FOR_MIRROR_DUNGEON(1111),
    LEAVE_MIRROR_DUNGEON(1112),
    UNK1113(1113),
    UNK1114(1114),
    UNK1115(1115),
    UNK1116(1116),
    UNK1117(1117),
    UNK1118(1118),
    UNK1119(1119),

    B_E_G_I_N__R_H_Y_T_H_M_G_A_M_E(1121),
    RHYTHM_GAME_HIT_NOTE(1122),
    RHYTHM_GAME_START_REGION(1123),
    RHYTHM_GAME_END_REGION(1124),
    RHYTHM_GAME_END_SPECIAL_ATTACK(1125),
    RHYTHM_GAME_SELECT_MODE(1126),
    RHYTHM_GAME_ATTACK_REQUEST(1127),
    RHYTHM_GAME_NPC_ACTION_REQUEST(1128),
    RHYTHM_GAME_EXIT_GAME(1129),
    E_N_D__R_H_Y_T_H_M_G_A_M_E(1130),


    B_E_G_I_N__M_O_U_N_T_A_I_N_R_I_D_I_N_G(1131),
    MOUNTAIN_RIDING_HP_INFO(1132),
    MOUNTAIN_RIDING_MOB_INFO(1133),
    E_N_D__M_O_U_N_T_A_I_N_R_I_D_I_N_G(1134),


    // v203.2
    B_E_G_I_N__P_I_R_A_N_H_A(1135),
    PIRANHA_INFO(1136),
    PIRANHA_DIE(1137),
    PIRANHA_DAMAGE(1138),
    PIRANHA_PREPARE(1139),
    E_N_D__P_I_R_A_N_H_A(1140),

    // v203.2
    B_E_G_I_N__R_O_B_B_I_N_S(1141),
    ROBBINS__INC_BOMB(1142),
    ROBBINS__DEC_BOMB(1143),
    ROBBINS__TOSS_BOMB(1144),
    E_N_D__R_O_B_B_I_N_S(1145),

    // v203.2
    B_E_G_I_N__F_A_L_L_I_N_G_S_T_O_N_E(1146),
    FALLING_STONE_INFO(1147),
    FALLING_STONE_HP_INFO(1148),
    FALLING_STONE_PREPARE(1149),
    E_N_D__F_A_L_L_I_N_G_S_T_O_N_E(1150),


    B_E_G_I_N__B_A_T_T_L_E_F_I_E_L_D(1146),
    BATTLE_FIELD_DAMAGE(1147),
    BATTLE_FIELD_SHEEP_REVIVAL_REQ(1148),
    BATTLE_FIELD_SHEEP_REVIVE(1149),
    E_N_D__B_A_T_T_L_E_F_I_E_L_D(1150),


    B_E_G_I_N__B_O_S_S_A_R_E_N_A(1151),
    BOSS_ARENA_SELECT_BOSS(1152),
    BOSS_ARENA_SELECT_SKILL(1153),
    BOSS_ARENA_SELECT_DIFFICULTY(1154),
    BOSS_ARENA_SELECT_CONFIRM(1155),
    E_N_D__B_O_S_S_A_R_E_N_A(1156),


    B_E_G_I_N__C_A_T_A_P_U_L_T(1157),
    CATAPULT__UPGRADE_SKILL(1158),
    E_N_D__C_A_T_A_P_U_L_T(1159),

    // v203.2
    FIELD_ATTACK_OBJ_PUSH_ACT(1165),
    FIELD_RESPAWN(1166),

    // v203.2
    B_E_G_I_N__S_O_U_L__D_U_N_G_E_O_N(1167),
    SOUL_ITEM_USE(1168),
    SOUL_ITEM_USE_VOTE(1169),
    SOUL_DUNGE_SUMM_SOUL_BOSS(1170),
    E_N_D__S_O_U_L__D_U_N_G_E_O_N(1171),

    // v203.2
    B_E_G_I_N__S_P_A_C_E_M_O_O_N_R_A_B_B_I_T(1172),
    SPACE_MORABBIT_HIT_EFF(1173),
    SPACE_MORABBIT_DAMAGE(1174),
    E_N_D__S_P_A_C_E_M_O_O_N_R_A_B_B_I_T(1175),

    // v203.2
    B_E_G_I_N__H_U_N_D_R_E_D_B_I_N_G_O(1176),
    H_BINGO_CHECK_NUMBER(1177),
    H_BINGO_CHECK_BINGO(1178),
    E_N_D__H_U_N_D_R_E_D_B_I_N_G_O(1179),

    // v203.2
    B_E_G_I_N__T_Y_P_I_N_G_G_A_M_E(1180),
    TYPING_GAME_CHECK_MSG(1181),
    TYPING_GAME_WORD_MOB_ATTACK(1182),
    TYPING_GAME_LEVEL_SELECT(1183),
    TYPING_GAME_SKILL_ATTACK(1184),
    TYPING_GAME_FIELD_OUT(1185),
    E_N_D__T_Y_P_I_N_G_G_A_M_E(1186),

    // v203.2
    B_E_G_I_N__H_U_N_D_R_E_D_O_X_Q_UI_Z(1187),
    H_OX_QUIZ_SELECTED(1188),
    E_N_D__H_U_N_D_R_E_D_O_X_Q_UI_Z(1189),


    // v203.2
    B_E_G_I_N__S_T_A_R_P_L_A_N_E_T_R_P_S(1190),
    S_P_RPS_GAME_USER_SELECT(1191),
    S_P_RPS_GAME_ANSWER(1192),
    S_P_RPS_GAME_LEAVE(1193),
    E_N_D__S_T_A_R_P_L_A_N_E_T_R_P_S(1194),


    // v203.2
    B_E_G_I_N__S_I_D_E_S_C_R_O_L_L_F_L_Y_S_H_O_O_T_I_N_G(1195),
    SSFS_HIT_USER(1196),
    SSFS_LETHAL_ATTACK(1197),
    SSFS_EXIT(1198),
    E_N_D__S_I_D_E_S_C_R_O_L_L_F_L_Y_S_H_O_O_T_I_N_G(1199),

    B_E_G_I_N__F_I_E_L_D_S_T_A_T_E(1200),
    STAR_PLANET__H_BINGO_CHECK_NUMBER(1201),
    STAR_PLANET__H_BINGO_CHECK_BINGO(1202),
    STAR_PLANET__H_BINGO_SEND_NUMBER(1203),
    STAR_PLANET__H_RPS_SELECTED(1204),
    STAR_PLANET__GROUP_DANCE_SELECTED(1205),
    STAR_PLANET__GROUP_DANCE_CANCEL(1206),
    E_N_D__F_I_E_L_D_S_T_A_T_E(1207),

    B_E_G_I_N__M_O_M_E_N_T_S_W_I_M_A_R_E_A(1208),
    MOMENT_SWIM_AREA__WATER_LEVEL(1209),
    E_N_D__M_O_M_E_N_T_S_W_I_M_A_R_E_A(1210),

    B_E_G_I_N__G_H_O_S_T_P_A_R_K(1211),
    GHOST_PARK_USE_RUNE_REQ(1212),
    GHOST_PARK_RUNE_HEAL_REQ(1213),
    GHOST_PARK_HIT_BULLET(1214),
    E_N_D__G_H_O_S_T_P_A_R_K(1215),

    B_E_G_I_N__F_I_E_L_D__U_R_U_S(1216),
    URUS_SAVE_DEADLY_USER(1217),
    E_N_D__F_I_E_L_D__U_R_U_S(1218),

    FIELD_SKILL_USE_REQUEST(1219),
    FIELD_WEATHER__MSG(1220),
    FIELD_STAT_Q_R_EX_DAY(1221),

    UNK1222(1222),
    UNK1223(1223),
    UNK1224(1224),
    UNK1225(1225),
    UNK1226(1226),
    UNK1227(1227),

    // v203.2
    B_E_G_I_N__P_O_L_O_F_R_I_T_O_B_O_U_N_T_Y_H_U_N_T_I_N_G(1228),
    POLO_FRITO_BOUNTY_HUNTING_REQUEST(1229),
    E_N_D__P_O_L_O_F_R_I_T_O_B_O_U_N_T_Y_H_U_N_T_I_N_G(1230),


    // v203.2
    B_E_G_I_N__P_O_L_O_F_R_I_T_O_T_O_W_N_D_E_F_E_N_S_E(1231),
    POLO_FRITO_TOWN_DEFENSE_REQUEST(1232),
    E_N_D__P_O_L_O_F_R_I_T_O_T_O_W_N_D_E_F_E_N_S_E(1233),


    // v203.2
    B_E_G_I_N__U_N_K_N_O_W_N_1(1234),
    UNK1230(1235),
    UNK1231(1236),
    E_N_D__U_N_K_N_O_W_N_1(1237),


    // v203.2
    B_E_G_I_N__P_O_L_O_F_R_I_T_O_C_O_U_R_T_S_H_I_P_D_A_N_C_E(1238),
    POLO_FRITO_COURTSHIP_DANCE_RESULT(1239),
    E_N_D__P_O_L_O_F_R_I_T_O_C_O_U_R_T_S_H_I_P_D_A_N_C_E(1240),


    // v203.2
    B_E_G_I_N__B_O_S_S__D_E_M_I_A_N__F_L_Y_I_N_G_S_W_O_R_D(1241),
    DEMIAN_OBJECT_MAKE_ENTER_ACK(1242),
    DEMIAN_OBJECT_NODE_END(1243),
    DEMIAN_OBJECT_ERR__RECREATE(1244),
    E_N_D__B_O_S_S__D_E_M_I_A_N__F_L_Y_I_N_G_S_W_O_R_D(1245),

    B_E_G_I_N___B_O_S_S__L_U_C_I_D(1241),
    LUCID_FAIRY_DUST_CHECK(1242),
    LUCID_ACTIVATE_STATUE_REQUEST(1243),
    LUCIDE_WELCOME_BARRAGE_END(1244),
    E_N_D__B_O_S_S__L_U_C_I_D(1245),

    E_N_D__F_I_E_L_D(1246),

    CHECK_S_P_W_CREATE_NEW_CHARACTER(1039),
    SET_S_P_W(1040),

    B_E_G_I_N__C_A_S_H_S_H_O_P(1044),
    CASH_SHOP_CHARGE_PARAM_REQUEST(1045),
    CASH_SHOP_QUERY_CASH_REQUEST(1046),
    CASH_SHOP_CASH_ITEM_REQUEST(1047),
    CASH_SHOP_CHECK_COUPON_REQUEST(1048),
    CASH_SHOP_MEMBER_SHOP_REQUEST(1049),
    CASH_SHOP_GIFT_MATE_INFO_REQUEST(1050),
    CASH_SHOP_SEARCH_LOG(1051),
    CASH_SHOP_COODINATION_REQUEST(1052),
    CASH_SHOP_CHECK_MILEAGE_REQUEST(1053),
    CASH_SHOP_NAVER_USAGE_INFO_REQUEST(1054),
    M_V_P__DAILY_PACK__REQUEST(1055),
    M_V_P__SPECIAL_PACK__REQUEST(1056),
    CASH_SHOP_ACTION(-1),
    E_N_D__C_A_S_H_S_H_O_P(1060),


    B_E_G_I_N__R_A_I_S_E(1041),
    RAISE_REFESH(1042),
    RAISE_UI_STATE(1043),
    RAISE_INC_EXP(1044),
    RAISE_ADD_PIECE(1045),
    E_N_D__R_A_I_S_E(1046),

    SEND_MATE_MAIL(1047),
    REQUEST_GUILD_BOARD_AUTH_KEY(1048),
    REQUEST_CONSULT_AUTH_KEY(1049),
    REQUEST_CLASS_COMPETION_AUTH_KEY(1050),
    REQUEST_WEB_BOARD_AUTH_KEY(1051),
    IRBOX_EVENT(1052),


    B_E_G_I_N__I_T_E_M_U_P_G_R_A_D_E(1381),
    GOLD_HAMMER_REQUEST(1382), // was 1054
    GOLD_HAMMER_COMPLETE(1383), // was 1055
    E_N_D__I_T_E_M_U_P_G_R_A_D_E(1384),

    // v203.2
    B_E_G_I_N__B_A_T_T_L_E_R_E_C_O_R_D(1386),
    BATTLE_RECORD_ON_OFF_REQUEST(1387),
    BATTLE_RECORD_SKILL_DAMAGE_LOG(1388),
    E_N_D__B_A_T_T_L_E_R_E_C_O_R_D(1389),

    B_E_G_I_N__F_A_R_M(1390),
    UNK1391(1391),
    BUY_FARM_OBJECT(1392),
    SEL_FARM_OBJECT(1393),
    FARM_ADMIN_COMMAND(1394),
    REQUEST_QUEST_COMPLETE(1395),
    CHECK_FARM_NAME(1396),
    REQUEST_INTERACT_OBJECT(1397),
    REQUEST_CONSUME_OBJECT(1398),
    REQUEST_CLICK_NPC(1399),
    REQUEST_RANDOM_FARM(1400),
    INSERT_FARM_OBJECT(1401),
    DELETE_FARM_OBJECT(1402),
    INSERT_FARM_TILE(1403),
    DELETE_FARM_TILE(1404),
    TRANSFER_FARM_FIELD(1405),
    MY_HOUSE_UPGRADE(1406),
    REQUEST_FARM_VISIT(1407),// v203.2
    REQUEST_ADD_FARM_FRIEND(1408),// v203.2
    FARM_IN_GAME_FRIEND_REQUEST(1104),
    REQUEST_DELETE_FARM_FRIEND(1105),
    REQUEST_ADD_BLACK_LIST(1106),
    REQUEST_DELETE_BLACK_LIST(1107),
    REQUEST_FARM_INFO_UI(1108),
    CHECK_FARM_NAME_BY_CONSUME(1109),
    REQUEST_AUTO_HARVEST(1110),
    REQUEST_SOUL_RECHARGE(1111),
    REQUEST_TRANFER_FARM_BY_NAME(1112),
    MY_FARM_MONSTER_REQUEST(1113),
    FARM_MONSTER_COMBINE(1114),
    FARM_MONSTER_SET_NAME_REQUEST(1115),
    FARM_MONSTER_CARE(1116),
    FARM_MONSTER_PLAY(1117),
    FARM_MONSTER_RELEASE(1118),
    FARM_MONSTER_SEARCH_REQUEST(1119),
    FARM_MONSTER_POS_RECODE(1427),// v203.2
    FARM_MONSTER_LOCKER_REQUEST(1428),// v203.2
    FARM_MONSTER_LIFE_EXTEND(1429),// v203.2
    PHOTO_UPDATE(1430),// v203.2
    PHOTO_GET_REQUEST(1431),// v203.2
    MY_HOME_SEND_NOTICE_REQUEST(1432),// v203.2
    MY_HOME_LOAD_MAIN_LOG_REQUEST(1433),// v203.2
    MY_HOME_DELETE_LOG_REQUEST(1434),// v203.2
    FARM_WHISPER(1435),// v203.2
    FARM_GROUP_MESSAGE(1436),// v203.2
    REQUEST_FARM_FRIEND_RECOMMEND(1437),// v203.2
    FARM_REQUEST_IN_GAME_INFO_SET(1432),
    FARM_REQUEST_IN_GAME_INFO_MOD(1433),
    REQUEST_FARM_FRIEND_INFO(1434),
    REQUEST_FARM_TODAY(1435),
    REQUEST_FIRST_ENTER_REWARD(1436),
    CHECK_ADMIN_ACCOUNT_LOG(1437),
    E_N_D__F_A_R_M(1437),

    LUCID_SHOOTING(1438),
    CHARACTER_LIST_REQUEST(1439),
    COPY_CHARACTER_TO_TEST_REQUEST(1440),

    HOT_TIME_REWARD_REQUEST(2686),
    NO(2687),
    ;

    private static List<InHeader> spam = Arrays.asList(
            UPDATE_CLIENT_ENVIRONMENT,
            PONG,
            WVS_SET_UP_STEP,
            SECURITY_PACKET,
            PRIVATE_SERVER_PACKET,
            MOB_MOVE,
            USER_MOVE,
            PASSIVESKILL_INFO_UPDATE,
            USER_CHANGE_STAT_REQUEST,
            SUMMONED_MOVE,
            USER_TEMPORARY_STAT_UPDATE_REQUEST,
            USER_CALC_DAMAGE_STAT_SET_REQUEST,
            MOB_APPLY_CTRL,
            USER_REQUEST_INSTANCE_TABLE,
            USER_QUEST_REQUEST,
            CHECK_LOGIN_AUTH_INFO,
            CHECK_SPW_REQUEST,
            NPC_MOVE,
            FAMILIAR_MOVE,
            PET_MOVE,
            AUTH_HEARTBEAT,
            OBTACLE_ATOM_COLLISION,
            USER_HIT,
            USER_EMOTION,
            USER_B2_BODY_REQUEST,
            SPECTRA_ENERGY_UPDATE
    );

    private short value;

    InHeader(int op) {
        this.value = (short) op;
    }

    public short getValue() {
        return value;
    }

    public static InHeader getInHeaderByOp(int op) {
        for (InHeader inHeader : InHeader.values()) {
            if (inHeader.getValue() == op) {
                return inHeader;
            }
        }
        return null;
    }

    public static boolean isSpamHeader(InHeader inHeaderByOp) {
        return spam.contains(inHeaderByOp);
    }
}