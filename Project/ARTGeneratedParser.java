import java.io.FileNotFoundException;
import uk.ac.rhul.cs.csle.art.v3.alg.gll.support.*;
import uk.ac.rhul.cs.csle.art.v3.lex.*;
import uk.ac.rhul.cs.csle.art.v3.manager.*;
import uk.ac.rhul.cs.csle.art.v3.manager.grammar.*;
import uk.ac.rhul.cs.csle.art.v3.manager.mode.*;
import uk.ac.rhul.cs.csle.art.util.*;
import uk.ac.rhul.cs.csle.art.util.text.*;
import uk.ac.rhul.cs.csle.art.v3.value.*;
import uk.ac.rhul.cs.csle.art.term.*;
import uk.ac.rhul.cs.csle.art.value.*;
/*******************************************************************************
*
* ARTGeneratedParser.java
*
*******************************************************************************/

  import java.util.HashMap;

public class ARTGeneratedParser extends ARTGLLParserHashPool {
  private String artInputString; // This is used in the MGLL generated parser instead of artlexer.artinputString
  private static boolean[] ARTSet1;
  private static boolean[] ARTSet2;
  private static boolean[] ARTSet3;
  private static boolean[] ARTSet4;
  private static boolean[] ARTSet5;
  private static boolean[] ARTSet6;
  private static boolean[] ARTSet7;
  private static boolean[] ARTSet8;
  private static boolean[] ARTSet9;
  private static boolean[] ARTSet10;
  private static boolean[] ARTSet11;
  private static boolean[] ARTSet12;
  private static boolean[] ARTSet13;
  private static boolean[] ARTSet14;
  private static boolean[] ARTSet15;
  private static boolean[] ARTSet16;
  private static boolean[] ARTSet17;
  private static boolean[] ARTSet18;
  private static boolean[] ARTSet19;
  private static boolean[] ARTSet20;
  private static boolean[] ARTSet21;
  private static boolean[] ARTSet22;
  private static boolean[] ARTSet23;
  private static boolean[] ARTSet24;
  private static boolean[] ARTSet25;
  private static boolean[] ARTSet26;
  private static boolean[] ARTSet27;
  private static boolean[] ARTSet28;
  private static boolean[] ARTSet29;
  private static boolean[] ARTSet30;
  private static boolean[] ARTSet31;
  private static boolean[] ARTSet32;
  private static boolean[] ARTSet33;
  private static boolean[] ARTSet34;
  private static boolean[] ARTSet35;
  private static boolean[] ARTSet36;
  private static boolean[] ARTSet37;
  private static boolean[] ARTSet38;
  private static boolean[] ARTSet39;
  private static boolean[] ARTSet40;
  private static boolean[] ARTSet41;
  private static boolean[] ARTSet42;
  private static boolean[] ARTSet43;
  private static boolean[] ARTSet44;
  private static boolean[] ARTSet45;
  private static boolean[] ARTSet46;
  private static boolean[] ARTSet47;
  private static boolean[] ARTSet48;
  private static boolean[] ARTSet49;
  private static boolean[] ARTSet50;
  private static boolean[] ARTSet51;
  private static boolean[] ARTSet52;
  private static boolean[] ARTSet53;
  private static boolean[] ARTSet54;
  private static boolean[] ARTSet55;
  private static boolean[] ARTSet56;
  private static boolean[] ARTSet57;
  private static boolean[] ARTSet58;
  private static boolean[] ARTSet59;
  private static boolean[] ARTSet60;
  private static boolean[] ARTSet61;
  private static boolean[] ARTSet62;
  private static boolean[] ARTSet63;
  private static boolean[] ARTSet64;
  private static boolean[] ARTSet65;
  private static boolean[] ARTSet66;
  private static boolean[] ARTSet67;
  private static boolean[] ARTSet68;
  private static boolean[] ARTSet69;
  private static boolean[] ARTSet70;
  private static boolean[] ARTSet71;
  private static boolean[] ARTSet72;
  private static boolean[] ARTSet73;
  private static boolean[] ARTSet74;
  private static boolean[] ARTSet75;
  private static boolean[] ARTSet76;
  private static boolean[] ARTSet77;
  private static boolean[] ARTSet78;
  private static boolean[] ARTSet79;
  private static boolean[] ARTSet80;
  private static boolean[] ARTSet81;
  private static boolean[] ARTSet82;
  private static boolean[] ARTSet83;
  private static boolean[] ARTSet84;
  private static boolean[] ARTSet85;
  private static boolean[] ARTSet86;
  private static boolean[] ARTSet87;
  private static boolean[] ARTSet88;
  private static boolean[] ARTSet89;
  private static boolean[] ARTSet90;
  private static boolean[] ARTSet91;
  private static boolean[] ARTSet92;
  private static boolean[] ARTSet93;
  private static boolean[] ARTSet94;
  private static boolean[] ARTSet95;
  private static boolean[] ARTSet96;
  private static boolean[] ARTSet97;
  private static boolean[] ARTSet98;
  private static boolean[] ARTSet99;
  private static boolean[] ARTSet100;
  private static boolean[] ARTSet101;
  private static boolean[] ARTSet102;
  private static boolean[] ARTSet103;
  private static boolean[] ARTSet104;
  private static boolean[] ARTSet105;
  private static boolean[] ARTSet106;
  private static boolean[] ARTSet107;
  private static boolean[] ARTSet108;

  /* Start of artLabel enumeration */
  public static final int ARTX_EOS = 0;
  public static final int ARTTB_ID = 1;
  public static final int ARTTB_INTEGER = 2;
  public static final int ARTTB_REAL = 3;
  public static final int ARTTB_SIMPLE_WHITESPACE = 4;
  public static final int ARTTB_STRING_DQ = 5;
  public static final int ARTTS__SHREIK_EQUAL = 6;
  public static final int ARTTS__PERCENT = 7;
  public static final int ARTTS__LPAR = 8;
  public static final int ARTTS__RPAR = 9;
  public static final int ARTTS__STAR = 10;
  public static final int ARTTS__STAR_STAR = 11;
  public static final int ARTTS__PLUS = 12;
  public static final int ARTTS__COMMA = 13;
  public static final int ARTTS__MINUS = 14;
  public static final int ARTTS__PERIOD = 15;
  public static final int ARTTS__PERIOD_PERIOD = 16;
  public static final int ARTTS__PERIOD_PERIOD_PERIOD = 17;
  public static final int ARTTS__PERIOD_PERIOD_PERIOD_PERIOD = 18;
  public static final int ARTTS__SLASH = 19;
  public static final int ARTTS__COLON_EQUAL = 20;
  public static final int ARTTS__SEMICOLON = 21;
  public static final int ARTTS__LT = 22;
  public static final int ARTTS__LT_EQUAL = 23;
  public static final int ARTTS__EQUAL_EQUAL = 24;
  public static final int ARTTS__GT = 25;
  public static final int ARTTS__GT_EQUAL = 26;
  public static final int ARTTS_A = 27;
  public static final int ARTTS_A_HASH = 28;
  public static final int ARTTS_Ab = 29;
  public static final int ARTTS_B = 30;
  public static final int ARTTS_Bb = 31;
  public static final int ARTTS_C = 32;
  public static final int ARTTS_C_HASH = 33;
  public static final int ARTTS_D = 34;
  public static final int ARTTS_D_HASH = 35;
  public static final int ARTTS_Db = 36;
  public static final int ARTTS_E = 37;
  public static final int ARTTS_Eb = 38;
  public static final int ARTTS_F = 39;
  public static final int ARTTS_F_HASH = 40;
  public static final int ARTTS_G = 41;
  public static final int ARTTS_G_HASH = 42;
  public static final int ARTTS_Gb = 43;
  public static final int ARTTS_M = 44;
  public static final int ARTTS_M7 = 45;
  public static final int ARTTS__LBRACK = 46;
  public static final int ARTTS__RBRACK = 47;
  public static final int ARTTS_arpeggio = 48;
  public static final int ARTTS_backingtrack = 49;
  public static final int ARTTS_beatRatio = 50;
  public static final int ARTTS_bpm = 51;
  public static final int ARTTS_else = 52;
  public static final int ARTTS_if = 53;
  public static final int ARTTS_instrument = 54;
  public static final int ARTTS_m = 55;
  public static final int ARTTS_m7 = 56;
  public static final int ARTTS_melody = 57;
  public static final int ARTTS_mix = 58;
  public static final int ARTTS_octave = 59;
  public static final int ARTTS_play = 60;
  public static final int ARTTS_print = 61;
  public static final int ARTTS_repeatNote = 62;
  public static final int ARTTS_scale = 63;
  public static final int ARTTS_volume = 64;
  public static final int ARTTS_while = 65;
  public static final int ARTTS__LBRACE = 66;
  public static final int ARTTS__RBRACE = 67;
  public static final int ARTX_EPSILON = 68;
  public static final int ARTL_ART_ID = 69;
  public static final int ARTL_ART_INTEGER = 70;
  public static final int ARTL_ART_REAL = 71;
  public static final int ARTL_ART_STRING_DQ = 72;
  public static final int ARTL_ART_beatRatio = 73;
  public static final int ARTL_ART_bpm = 74;
  public static final int ARTL_ART_chord = 75;
  public static final int ARTL_ART_chordMode = 76;
  public static final int ARTL_ART_instrument = 77;
  public static final int ARTL_ART_note = 78;
  public static final int ARTL_ART_notes = 79;
  public static final int ARTL_ART_octave = 80;
  public static final int ARTL_ART_operand = 81;
  public static final int ARTL_ART_printElements = 82;
  public static final int ARTL_ART_relExpr = 83;
  public static final int ARTL_ART_rest = 84;
  public static final int ARTL_ART_shifters = 85;
  public static final int ARTL_ART_simpleNote = 86;
  public static final int ARTL_ART_simpleNoteLexeme = 87;
  public static final int ARTL_ART_statement = 88;
  public static final int ARTL_ART_statements = 89;
  public static final int ARTL_ART_subExpr = 90;
  public static final int ARTL_ART_volume = 91;
  public static final int ARTL_ART_ID_721 = 92;
  public static final int ARTL_ART_ID_722 = 93;
  public static final int ARTL_ART_ID_723 = 94;
  public static final int ARTL_ART_ID_724 = 95;
  public static final int ARTL_ART_INTEGER_727 = 96;
  public static final int ARTL_ART_INTEGER_728 = 97;
  public static final int ARTL_ART_INTEGER_729 = 98;
  public static final int ARTL_ART_INTEGER_730 = 99;
  public static final int ARTL_ART_REAL_733 = 100;
  public static final int ARTL_ART_REAL_734 = 101;
  public static final int ARTL_ART_REAL_735 = 102;
  public static final int ARTL_ART_REAL_736 = 103;
  public static final int ARTL_ART_STRING_DQ_739 = 104;
  public static final int ARTL_ART_STRING_DQ_740 = 105;
  public static final int ARTL_ART_STRING_DQ_741 = 106;
  public static final int ARTL_ART_STRING_DQ_742 = 107;
  public static final int ARTL_ART_beatRatio_449 = 108;
  public static final int ARTL_ART_beatRatio_450 = 109;
  public static final int ARTL_ART_beatRatio_451 = 110;
  public static final int ARTL_ART_beatRatio_452 = 111;
  public static final int ARTL_ART_beatRatio_453 = 112;
  public static final int ARTL_ART_beatRatio_454 = 113;
  public static final int ARTL_ART_beatRatio_455 = 114;
  public static final int ARTL_ART_beatRatio_456 = 115;
  public static final int ARTL_ART_bpm_363 = 116;
  public static final int ARTL_ART_bpm_364 = 117;
  public static final int ARTL_ART_bpm_365 = 118;
  public static final int ARTL_ART_bpm_366 = 119;
  public static final int ARTL_ART_bpm_367 = 120;
  public static final int ARTL_ART_bpm_368 = 121;
  public static final int ARTL_ART_bpm_369 = 122;
  public static final int ARTL_ART_bpm_370 = 123;
  public static final int ARTL_ART_chord_619 = 124;
  public static final int ARTL_ART_chord_620 = 125;
  public static final int ARTL_ART_chord_621 = 126;
  public static final int ARTL_ART_chord_622 = 127;
  public static final int ARTL_ART_chord_623 = 128;
  public static final int ARTL_ART_chord_624 = 129;
  public static final int ARTL_ART_chord_625 = 130;
  public static final int ARTL_ART_chord_626 = 131;
  public static final int ARTL_ART_chordMode_487 = 132;
  public static final int ARTL_ART_chordMode_488 = 133;
  public static final int ARTL_ART_chordMode_489 = 134;
  public static final int ARTL_ART_chordMode_490 = 135;
  public static final int ARTL_ART_chordMode_493 = 136;
  public static final int ARTL_ART_chordMode_494 = 137;
  public static final int ARTL_ART_chordMode_495 = 138;
  public static final int ARTL_ART_chordMode_496 = 139;
  public static final int ARTL_ART_chordMode_499 = 140;
  public static final int ARTL_ART_chordMode_500 = 141;
  public static final int ARTL_ART_chordMode_501 = 142;
  public static final int ARTL_ART_chordMode_502 = 143;
  public static final int ARTL_ART_chordMode_505 = 144;
  public static final int ARTL_ART_chordMode_506 = 145;
  public static final int ARTL_ART_chordMode_507 = 146;
  public static final int ARTL_ART_chordMode_508 = 147;
  public static final int ARTL_ART_chordMode_511 = 148;
  public static final int ARTL_ART_chordMode_512 = 149;
  public static final int ARTL_ART_chordMode_513 = 150;
  public static final int ARTL_ART_chordMode_514 = 151;
  public static final int ARTL_ART_instrument_383 = 152;
  public static final int ARTL_ART_instrument_384 = 153;
  public static final int ARTL_ART_instrument_385 = 154;
  public static final int ARTL_ART_instrument_386 = 155;
  public static final int ARTL_ART_instrument_387 = 156;
  public static final int ARTL_ART_instrument_388 = 157;
  public static final int ARTL_ART_instrument_389 = 158;
  public static final int ARTL_ART_instrument_390 = 159;
  public static final int ARTL_ART_instrument_391 = 160;
  public static final int ARTL_ART_instrument_392 = 161;
  public static final int ARTL_ART_instrument_393 = 162;
  public static final int ARTL_ART_instrument_394 = 163;
  public static final int ARTL_ART_instrument_395 = 164;
  public static final int ARTL_ART_instrument_396 = 165;
  public static final int ARTL_ART_instrument_397 = 166;
  public static final int ARTL_ART_instrument_398 = 167;
  public static final int ARTL_ART_instrument_401 = 168;
  public static final int ARTL_ART_instrument_402 = 169;
  public static final int ARTL_ART_instrument_403 = 170;
  public static final int ARTL_ART_instrument_404 = 171;
  public static final int ARTL_ART_instrument_405 = 172;
  public static final int ARTL_ART_instrument_406 = 173;
  public static final int ARTL_ART_instrument_407 = 174;
  public static final int ARTL_ART_instrument_408 = 175;
  public static final int ARTL_ART_instrument_409 = 176;
  public static final int ARTL_ART_instrument_410 = 177;
  public static final int ARTL_ART_instrument_411 = 178;
  public static final int ARTL_ART_instrument_412 = 179;
  public static final int ARTL_ART_instrument_413 = 180;
  public static final int ARTL_ART_instrument_414 = 181;
  public static final int ARTL_ART_instrument_415 = 182;
  public static final int ARTL_ART_instrument_416 = 183;
  public static final int ARTL_ART_instrument_419 = 184;
  public static final int ARTL_ART_instrument_420 = 185;
  public static final int ARTL_ART_instrument_421 = 186;
  public static final int ARTL_ART_instrument_422 = 187;
  public static final int ARTL_ART_instrument_423 = 188;
  public static final int ARTL_ART_instrument_424 = 189;
  public static final int ARTL_ART_instrument_425 = 190;
  public static final int ARTL_ART_instrument_426 = 191;
  public static final int ARTL_ART_instrument_429 = 192;
  public static final int ARTL_ART_instrument_430 = 193;
  public static final int ARTL_ART_instrument_431 = 194;
  public static final int ARTL_ART_instrument_432 = 195;
  public static final int ARTL_ART_instrument_433 = 196;
  public static final int ARTL_ART_instrument_434 = 197;
  public static final int ARTL_ART_instrument_435 = 198;
  public static final int ARTL_ART_instrument_436 = 199;
  public static final int ARTL_ART_note_459 = 200;
  public static final int ARTL_ART_note_460 = 201;
  public static final int ARTL_ART_note_461 = 202;
  public static final int ARTL_ART_note_462 = 203;
  public static final int ARTL_ART_note_463 = 204;
  public static final int ARTL_ART_note_464 = 205;
  public static final int ARTL_ART_note_467 = 206;
  public static final int ARTL_ART_note_468 = 207;
  public static final int ARTL_ART_note_469 = 208;
  public static final int ARTL_ART_note_470 = 209;
  public static final int ARTL_ART_note_471 = 210;
  public static final int ARTL_ART_note_472 = 211;
  public static final int ARTL_ART_note_473 = 212;
  public static final int ARTL_ART_note_474 = 213;
  public static final int ARTL_ART_note_477 = 214;
  public static final int ARTL_ART_note_478 = 215;
  public static final int ARTL_ART_note_479 = 216;
  public static final int ARTL_ART_note_480 = 217;
  public static final int ARTL_ART_note_481 = 218;
  public static final int ARTL_ART_note_482 = 219;
  public static final int ARTL_ART_note_483 = 220;
  public static final int ARTL_ART_note_484 = 221;
  public static final int ARTL_ART_notes_627 = 222;
  public static final int ARTL_ART_notes_628 = 223;
  public static final int ARTL_ART_notes_629 = 224;
  public static final int ARTL_ART_notes_630 = 225;
  public static final int ARTL_ART_notes_631 = 226;
  public static final int ARTL_ART_notes_632 = 227;
  public static final int ARTL_ART_notes_633 = 228;
  public static final int ARTL_ART_notes_634 = 229;
  public static final int ARTL_ART_notes_635 = 230;
  public static final int ARTL_ART_notes_636 = 231;
  public static final int ARTL_ART_octave_439 = 232;
  public static final int ARTL_ART_octave_440 = 233;
  public static final int ARTL_ART_octave_441 = 234;
  public static final int ARTL_ART_octave_442 = 235;
  public static final int ARTL_ART_octave_443 = 236;
  public static final int ARTL_ART_octave_444 = 237;
  public static final int ARTL_ART_octave_445 = 238;
  public static final int ARTL_ART_octave_446 = 239;
  public static final int ARTL_ART_operand_699 = 240;
  public static final int ARTL_ART_operand_700 = 241;
  public static final int ARTL_ART_operand_701 = 242;
  public static final int ARTL_ART_operand_702 = 243;
  public static final int ARTL_ART_operand_705 = 244;
  public static final int ARTL_ART_operand_706 = 245;
  public static final int ARTL_ART_operand_707 = 246;
  public static final int ARTL_ART_operand_708 = 247;
  public static final int ARTL_ART_operand_711 = 248;
  public static final int ARTL_ART_operand_712 = 249;
  public static final int ARTL_ART_operand_713 = 250;
  public static final int ARTL_ART_operand_714 = 251;
  public static final int ARTL_ART_operand_715 = 252;
  public static final int ARTL_ART_operand_716 = 253;
  public static final int ARTL_ART_operand_717 = 254;
  public static final int ARTL_ART_operand_718 = 255;
  public static final int ARTL_ART_printElements_661 = 256;
  public static final int ARTL_ART_printElements_662 = 257;
  public static final int ARTL_ART_printElements_663 = 258;
  public static final int ARTL_ART_printElements_664 = 259;
  public static final int ARTL_ART_printElements_667 = 260;
  public static final int ARTL_ART_printElements_668 = 261;
  public static final int ARTL_ART_printElements_669 = 262;
  public static final int ARTL_ART_printElements_670 = 263;
  public static final int ARTL_ART_printElements_673 = 264;
  public static final int ARTL_ART_printElements_674 = 265;
  public static final int ARTL_ART_printElements_675 = 266;
  public static final int ARTL_ART_printElements_676 = 267;
  public static final int ARTL_ART_printElements_677 = 268;
  public static final int ARTL_ART_printElements_678 = 269;
  public static final int ARTL_ART_printElements_679 = 270;
  public static final int ARTL_ART_printElements_680 = 271;
  public static final int ARTL_ART_printElements_683 = 272;
  public static final int ARTL_ART_printElements_684 = 273;
  public static final int ARTL_ART_printElements_685 = 274;
  public static final int ARTL_ART_printElements_686 = 275;
  public static final int ARTL_ART_printElements_689 = 276;
  public static final int ARTL_ART_printElements_690 = 277;
  public static final int ARTL_ART_printElements_691 = 278;
  public static final int ARTL_ART_printElements_692 = 279;
  public static final int ARTL_ART_printElements_693 = 280;
  public static final int ARTL_ART_printElements_694 = 281;
  public static final int ARTL_ART_printElements_695 = 282;
  public static final int ARTL_ART_printElements_696 = 283;
  public static final int ARTL_ART_relExpr_223 = 284;
  public static final int ARTL_ART_relExpr_224 = 285;
  public static final int ARTL_ART_relExpr_225 = 286;
  public static final int ARTL_ART_relExpr_226 = 287;
  public static final int ARTL_ART_relExpr_229 = 288;
  public static final int ARTL_ART_relExpr_230 = 289;
  public static final int ARTL_ART_relExpr_231 = 290;
  public static final int ARTL_ART_relExpr_232 = 291;
  public static final int ARTL_ART_relExpr_233 = 292;
  public static final int ARTL_ART_relExpr_234 = 293;
  public static final int ARTL_ART_relExpr_235 = 294;
  public static final int ARTL_ART_relExpr_236 = 295;
  public static final int ARTL_ART_relExpr_239 = 296;
  public static final int ARTL_ART_relExpr_240 = 297;
  public static final int ARTL_ART_relExpr_241 = 298;
  public static final int ARTL_ART_relExpr_242 = 299;
  public static final int ARTL_ART_relExpr_243 = 300;
  public static final int ARTL_ART_relExpr_244 = 301;
  public static final int ARTL_ART_relExpr_245 = 302;
  public static final int ARTL_ART_relExpr_246 = 303;
  public static final int ARTL_ART_relExpr_249 = 304;
  public static final int ARTL_ART_relExpr_250 = 305;
  public static final int ARTL_ART_relExpr_251 = 306;
  public static final int ARTL_ART_relExpr_252 = 307;
  public static final int ARTL_ART_relExpr_253 = 308;
  public static final int ARTL_ART_relExpr_254 = 309;
  public static final int ARTL_ART_relExpr_255 = 310;
  public static final int ARTL_ART_relExpr_256 = 311;
  public static final int ARTL_ART_relExpr_259 = 312;
  public static final int ARTL_ART_relExpr_260 = 313;
  public static final int ARTL_ART_relExpr_261 = 314;
  public static final int ARTL_ART_relExpr_262 = 315;
  public static final int ARTL_ART_relExpr_263 = 316;
  public static final int ARTL_ART_relExpr_264 = 317;
  public static final int ARTL_ART_relExpr_265 = 318;
  public static final int ARTL_ART_relExpr_266 = 319;
  public static final int ARTL_ART_relExpr_269 = 320;
  public static final int ARTL_ART_relExpr_270 = 321;
  public static final int ARTL_ART_relExpr_271 = 322;
  public static final int ARTL_ART_relExpr_272 = 323;
  public static final int ARTL_ART_relExpr_273 = 324;
  public static final int ARTL_ART_relExpr_274 = 325;
  public static final int ARTL_ART_relExpr_275 = 326;
  public static final int ARTL_ART_relExpr_276 = 327;
  public static final int ARTL_ART_relExpr_279 = 328;
  public static final int ARTL_ART_relExpr_280 = 329;
  public static final int ARTL_ART_relExpr_281 = 330;
  public static final int ARTL_ART_relExpr_282 = 331;
  public static final int ARTL_ART_relExpr_283 = 332;
  public static final int ARTL_ART_relExpr_284 = 333;
  public static final int ARTL_ART_relExpr_285 = 334;
  public static final int ARTL_ART_relExpr_286 = 335;
  public static final int ARTL_ART_rest_637 = 336;
  public static final int ARTL_ART_rest_638 = 337;
  public static final int ARTL_ART_rest_639 = 338;
  public static final int ARTL_ART_rest_640 = 339;
  public static final int ARTL_ART_rest_643 = 340;
  public static final int ARTL_ART_rest_644 = 341;
  public static final int ARTL_ART_rest_645 = 342;
  public static final int ARTL_ART_rest_646 = 343;
  public static final int ARTL_ART_rest_649 = 344;
  public static final int ARTL_ART_rest_650 = 345;
  public static final int ARTL_ART_rest_651 = 346;
  public static final int ARTL_ART_rest_652 = 347;
  public static final int ARTL_ART_rest_655 = 348;
  public static final int ARTL_ART_rest_656 = 349;
  public static final int ARTL_ART_rest_657 = 350;
  public static final int ARTL_ART_rest_658 = 351;
  public static final int ARTL_ART_shifters_591 = 352;
  public static final int ARTL_ART_shifters_592 = 353;
  public static final int ARTL_ART_shifters_593 = 354;
  public static final int ARTL_ART_shifters_594 = 355;
  public static final int ARTL_ART_shifters_597 = 356;
  public static final int ARTL_ART_shifters_598 = 357;
  public static final int ARTL_ART_shifters_599 = 358;
  public static final int ARTL_ART_shifters_600 = 359;
  public static final int ARTL_ART_shifters_603 = 360;
  public static final int ARTL_ART_shifters_604 = 361;
  public static final int ARTL_ART_shifters_605 = 362;
  public static final int ARTL_ART_shifters_606 = 363;
  public static final int ARTL_ART_shifters_607 = 364;
  public static final int ARTL_ART_shifters_608 = 365;
  public static final int ARTL_ART_shifters_611 = 366;
  public static final int ARTL_ART_shifters_612 = 367;
  public static final int ARTL_ART_shifters_613 = 368;
  public static final int ARTL_ART_shifters_614 = 369;
  public static final int ARTL_ART_shifters_615 = 370;
  public static final int ARTL_ART_shifters_616 = 371;
  public static final int ARTL_ART_simpleNote_517 = 372;
  public static final int ARTL_ART_simpleNote_518 = 373;
  public static final int ARTL_ART_simpleNote_519 = 374;
  public static final int ARTL_ART_simpleNote_520 = 375;
  public static final int ARTL_ART_simpleNoteLexeme_523 = 376;
  public static final int ARTL_ART_simpleNoteLexeme_524 = 377;
  public static final int ARTL_ART_simpleNoteLexeme_525 = 378;
  public static final int ARTL_ART_simpleNoteLexeme_526 = 379;
  public static final int ARTL_ART_simpleNoteLexeme_527 = 380;
  public static final int ARTL_ART_simpleNoteLexeme_528 = 381;
  public static final int ARTL_ART_simpleNoteLexeme_529 = 382;
  public static final int ARTL_ART_simpleNoteLexeme_530 = 383;
  public static final int ARTL_ART_simpleNoteLexeme_531 = 384;
  public static final int ARTL_ART_simpleNoteLexeme_532 = 385;
  public static final int ARTL_ART_simpleNoteLexeme_533 = 386;
  public static final int ARTL_ART_simpleNoteLexeme_534 = 387;
  public static final int ARTL_ART_simpleNoteLexeme_535 = 388;
  public static final int ARTL_ART_simpleNoteLexeme_536 = 389;
  public static final int ARTL_ART_simpleNoteLexeme_537 = 390;
  public static final int ARTL_ART_simpleNoteLexeme_538 = 391;
  public static final int ARTL_ART_simpleNoteLexeme_539 = 392;
  public static final int ARTL_ART_simpleNoteLexeme_540 = 393;
  public static final int ARTL_ART_simpleNoteLexeme_541 = 394;
  public static final int ARTL_ART_simpleNoteLexeme_542 = 395;
  public static final int ARTL_ART_simpleNoteLexeme_543 = 396;
  public static final int ARTL_ART_simpleNoteLexeme_544 = 397;
  public static final int ARTL_ART_simpleNoteLexeme_545 = 398;
  public static final int ARTL_ART_simpleNoteLexeme_546 = 399;
  public static final int ARTL_ART_simpleNoteLexeme_547 = 400;
  public static final int ARTL_ART_simpleNoteLexeme_548 = 401;
  public static final int ARTL_ART_simpleNoteLexeme_549 = 402;
  public static final int ARTL_ART_simpleNoteLexeme_550 = 403;
  public static final int ARTL_ART_simpleNoteLexeme_551 = 404;
  public static final int ARTL_ART_simpleNoteLexeme_552 = 405;
  public static final int ARTL_ART_simpleNoteLexeme_553 = 406;
  public static final int ARTL_ART_simpleNoteLexeme_554 = 407;
  public static final int ARTL_ART_simpleNoteLexeme_555 = 408;
  public static final int ARTL_ART_simpleNoteLexeme_556 = 409;
  public static final int ARTL_ART_simpleNoteLexeme_557 = 410;
  public static final int ARTL_ART_simpleNoteLexeme_558 = 411;
  public static final int ARTL_ART_simpleNoteLexeme_559 = 412;
  public static final int ARTL_ART_simpleNoteLexeme_560 = 413;
  public static final int ARTL_ART_simpleNoteLexeme_561 = 414;
  public static final int ARTL_ART_simpleNoteLexeme_562 = 415;
  public static final int ARTL_ART_simpleNoteLexeme_563 = 416;
  public static final int ARTL_ART_simpleNoteLexeme_564 = 417;
  public static final int ARTL_ART_simpleNoteLexeme_565 = 418;
  public static final int ARTL_ART_simpleNoteLexeme_566 = 419;
  public static final int ARTL_ART_simpleNoteLexeme_567 = 420;
  public static final int ARTL_ART_simpleNoteLexeme_568 = 421;
  public static final int ARTL_ART_simpleNoteLexeme_569 = 422;
  public static final int ARTL_ART_simpleNoteLexeme_570 = 423;
  public static final int ARTL_ART_simpleNoteLexeme_571 = 424;
  public static final int ARTL_ART_simpleNoteLexeme_572 = 425;
  public static final int ARTL_ART_simpleNoteLexeme_573 = 426;
  public static final int ARTL_ART_simpleNoteLexeme_574 = 427;
  public static final int ARTL_ART_simpleNoteLexeme_575 = 428;
  public static final int ARTL_ART_simpleNoteLexeme_576 = 429;
  public static final int ARTL_ART_simpleNoteLexeme_577 = 430;
  public static final int ARTL_ART_simpleNoteLexeme_578 = 431;
  public static final int ARTL_ART_simpleNoteLexeme_579 = 432;
  public static final int ARTL_ART_simpleNoteLexeme_580 = 433;
  public static final int ARTL_ART_simpleNoteLexeme_581 = 434;
  public static final int ARTL_ART_simpleNoteLexeme_582 = 435;
  public static final int ARTL_ART_simpleNoteLexeme_583 = 436;
  public static final int ARTL_ART_simpleNoteLexeme_584 = 437;
  public static final int ARTL_ART_simpleNoteLexeme_585 = 438;
  public static final int ARTL_ART_simpleNoteLexeme_586 = 439;
  public static final int ARTL_ART_simpleNoteLexeme_587 = 440;
  public static final int ARTL_ART_simpleNoteLexeme_588 = 441;
  public static final int ARTL_ART_simpleNoteLexeme_589 = 442;
  public static final int ARTL_ART_simpleNoteLexeme_590 = 443;
  public static final int ARTL_ART_statement_13 = 444;
  public static final int ARTL_ART_statement_14 = 445;
  public static final int ARTL_ART_statement_15 = 446;
  public static final int ARTL_ART_statement_16 = 447;
  public static final int ARTL_ART_statement_17 = 448;
  public static final int ARTL_ART_statement_18 = 449;
  public static final int ARTL_ART_statement_19 = 450;
  public static final int ARTL_ART_statement_20 = 451;
  public static final int ARTL_ART_statement_21 = 452;
  public static final int ARTL_ART_statement_22 = 453;
  public static final int ARTL_ART_statement_25 = 454;
  public static final int ARTL_ART_statement_26 = 455;
  public static final int ARTL_ART_statement_27 = 456;
  public static final int ARTL_ART_statement_28 = 457;
  public static final int ARTL_ART_statement_29 = 458;
  public static final int ARTL_ART_statement_30 = 459;
  public static final int ARTL_ART_statement_31 = 460;
  public static final int ARTL_ART_statement_32 = 461;
  public static final int ARTL_ART_statement_33 = 462;
  public static final int ARTL_ART_statement_34 = 463;
  public static final int ARTL_ART_statement_35 = 464;
  public static final int ARTL_ART_statement_36 = 465;
  public static final int ARTL_ART_statement_39 = 466;
  public static final int ARTL_ART_statement_40 = 467;
  public static final int ARTL_ART_statement_41 = 468;
  public static final int ARTL_ART_statement_42 = 469;
  public static final int ARTL_ART_statement_43 = 470;
  public static final int ARTL_ART_statement_44 = 471;
  public static final int ARTL_ART_statement_45 = 472;
  public static final int ARTL_ART_statement_46 = 473;
  public static final int ARTL_ART_statement_49 = 474;
  public static final int ARTL_ART_statement_50 = 475;
  public static final int ARTL_ART_statement_51 = 476;
  public static final int ARTL_ART_statement_52 = 477;
  public static final int ARTL_ART_statement_53 = 478;
  public static final int ARTL_ART_statement_54 = 479;
  public static final int ARTL_ART_statement_55 = 480;
  public static final int ARTL_ART_statement_56 = 481;
  public static final int ARTL_ART_statement_57 = 482;
  public static final int ARTL_ART_statement_58 = 483;
  public static final int ARTL_ART_statement_59 = 484;
  public static final int ARTL_ART_statement_60 = 485;
  public static final int ARTL_ART_statement_63 = 486;
  public static final int ARTL_ART_statement_64 = 487;
  public static final int ARTL_ART_statement_65 = 488;
  public static final int ARTL_ART_statement_66 = 489;
  public static final int ARTL_ART_statement_67 = 490;
  public static final int ARTL_ART_statement_68 = 491;
  public static final int ARTL_ART_statement_69 = 492;
  public static final int ARTL_ART_statement_70 = 493;
  public static final int ARTL_ART_statement_71 = 494;
  public static final int ARTL_ART_statement_72 = 495;
  public static final int ARTL_ART_statement_73 = 496;
  public static final int ARTL_ART_statement_74 = 497;
  public static final int ARTL_ART_statement_75 = 498;
  public static final int ARTL_ART_statement_76 = 499;
  public static final int ARTL_ART_statement_77 = 500;
  public static final int ARTL_ART_statement_78 = 501;
  public static final int ARTL_ART_statement_81 = 502;
  public static final int ARTL_ART_statement_82 = 503;
  public static final int ARTL_ART_statement_83 = 504;
  public static final int ARTL_ART_statement_84 = 505;
  public static final int ARTL_ART_statement_85 = 506;
  public static final int ARTL_ART_statement_86 = 507;
  public static final int ARTL_ART_statement_87 = 508;
  public static final int ARTL_ART_statement_88 = 509;
  public static final int ARTL_ART_statement_91 = 510;
  public static final int ARTL_ART_statement_92 = 511;
  public static final int ARTL_ART_statement_93 = 512;
  public static final int ARTL_ART_statement_94 = 513;
  public static final int ARTL_ART_statement_95 = 514;
  public static final int ARTL_ART_statement_96 = 515;
  public static final int ARTL_ART_statement_97 = 516;
  public static final int ARTL_ART_statement_98 = 517;
  public static final int ARTL_ART_statement_99 = 518;
  public static final int ARTL_ART_statement_100 = 519;
  public static final int ARTL_ART_statement_101 = 520;
  public static final int ARTL_ART_statement_102 = 521;
  public static final int ARTL_ART_statement_103 = 522;
  public static final int ARTL_ART_statement_104 = 523;
  public static final int ARTL_ART_statement_105 = 524;
  public static final int ARTL_ART_statement_106 = 525;
  public static final int ARTL_ART_statement_107 = 526;
  public static final int ARTL_ART_statement_108 = 527;
  public static final int ARTL_ART_statement_109 = 528;
  public static final int ARTL_ART_statement_110 = 529;
  public static final int ARTL_ART_statement_111 = 530;
  public static final int ARTL_ART_statement_112 = 531;
  public static final int ARTL_ART_statement_113 = 532;
  public static final int ARTL_ART_statement_114 = 533;
  public static final int ARTL_ART_statement_117 = 534;
  public static final int ARTL_ART_statement_118 = 535;
  public static final int ARTL_ART_statement_119 = 536;
  public static final int ARTL_ART_statement_120 = 537;
  public static final int ARTL_ART_statement_121 = 538;
  public static final int ARTL_ART_statement_122 = 539;
  public static final int ARTL_ART_statement_123 = 540;
  public static final int ARTL_ART_statement_124 = 541;
  public static final int ARTL_ART_statement_125 = 542;
  public static final int ARTL_ART_statement_126 = 543;
  public static final int ARTL_ART_statement_127 = 544;
  public static final int ARTL_ART_statement_128 = 545;
  public static final int ARTL_ART_statement_129 = 546;
  public static final int ARTL_ART_statement_130 = 547;
  public static final int ARTL_ART_statement_131 = 548;
  public static final int ARTL_ART_statement_132 = 549;
  public static final int ARTL_ART_statement_133 = 550;
  public static final int ARTL_ART_statement_134 = 551;
  public static final int ARTL_ART_statement_135 = 552;
  public static final int ARTL_ART_statement_136 = 553;
  public static final int ARTL_ART_statement_137 = 554;
  public static final int ARTL_ART_statement_138 = 555;
  public static final int ARTL_ART_statement_139 = 556;
  public static final int ARTL_ART_statement_140 = 557;
  public static final int ARTL_ART_statement_143 = 558;
  public static final int ARTL_ART_statement_144 = 559;
  public static final int ARTL_ART_statement_145 = 560;
  public static final int ARTL_ART_statement_146 = 561;
  public static final int ARTL_ART_statement_147 = 562;
  public static final int ARTL_ART_statement_148 = 563;
  public static final int ARTL_ART_statement_149 = 564;
  public static final int ARTL_ART_statement_150 = 565;
  public static final int ARTL_ART_statement_151 = 566;
  public static final int ARTL_ART_statement_152 = 567;
  public static final int ARTL_ART_statement_153 = 568;
  public static final int ARTL_ART_statement_154 = 569;
  public static final int ARTL_ART_statement_155 = 570;
  public static final int ARTL_ART_statement_156 = 571;
  public static final int ARTL_ART_statement_157 = 572;
  public static final int ARTL_ART_statement_158 = 573;
  public static final int ARTL_ART_statement_161 = 574;
  public static final int ARTL_ART_statement_162 = 575;
  public static final int ARTL_ART_statement_163 = 576;
  public static final int ARTL_ART_statement_164 = 577;
  public static final int ARTL_ART_statement_165 = 578;
  public static final int ARTL_ART_statement_166 = 579;
  public static final int ARTL_ART_statement_167 = 580;
  public static final int ARTL_ART_statement_168 = 581;
  public static final int ARTL_ART_statement_169 = 582;
  public static final int ARTL_ART_statement_170 = 583;
  public static final int ARTL_ART_statement_171 = 584;
  public static final int ARTL_ART_statement_172 = 585;
  public static final int ARTL_ART_statement_173 = 586;
  public static final int ARTL_ART_statement_174 = 587;
  public static final int ARTL_ART_statement_175 = 588;
  public static final int ARTL_ART_statement_176 = 589;
  public static final int ARTL_ART_statement_179 = 590;
  public static final int ARTL_ART_statement_180 = 591;
  public static final int ARTL_ART_statement_181 = 592;
  public static final int ARTL_ART_statement_182 = 593;
  public static final int ARTL_ART_statement_183 = 594;
  public static final int ARTL_ART_statement_184 = 595;
  public static final int ARTL_ART_statement_185 = 596;
  public static final int ARTL_ART_statement_186 = 597;
  public static final int ARTL_ART_statement_187 = 598;
  public static final int ARTL_ART_statement_188 = 599;
  public static final int ARTL_ART_statement_189 = 600;
  public static final int ARTL_ART_statement_190 = 601;
  public static final int ARTL_ART_statement_191 = 602;
  public static final int ARTL_ART_statement_192 = 603;
  public static final int ARTL_ART_statement_193 = 604;
  public static final int ARTL_ART_statement_194 = 605;
  public static final int ARTL_ART_statement_195 = 606;
  public static final int ARTL_ART_statement_196 = 607;
  public static final int ARTL_ART_statement_197 = 608;
  public static final int ARTL_ART_statement_198 = 609;
  public static final int ARTL_ART_statement_199 = 610;
  public static final int ARTL_ART_statement_200 = 611;
  public static final int ARTL_ART_statement_201 = 612;
  public static final int ARTL_ART_statement_202 = 613;
  public static final int ARTL_ART_statement_203 = 614;
  public static final int ARTL_ART_statement_204 = 615;
  public static final int ARTL_ART_statement_205 = 616;
  public static final int ARTL_ART_statement_206 = 617;
  public static final int ARTL_ART_statement_207 = 618;
  public static final int ARTL_ART_statement_208 = 619;
  public static final int ARTL_ART_statement_209 = 620;
  public static final int ARTL_ART_statement_210 = 621;
  public static final int ARTL_ART_statement_211 = 622;
  public static final int ARTL_ART_statement_212 = 623;
  public static final int ARTL_ART_statement_213 = 624;
  public static final int ARTL_ART_statement_214 = 625;
  public static final int ARTL_ART_statement_215 = 626;
  public static final int ARTL_ART_statement_216 = 627;
  public static final int ARTL_ART_statement_217 = 628;
  public static final int ARTL_ART_statement_218 = 629;
  public static final int ARTL_ART_statement_219 = 630;
  public static final int ARTL_ART_statement_220 = 631;
  public static final int ARTL_ART_statement_221 = 632;
  public static final int ARTL_ART_statement_222 = 633;
  public static final int ARTL_ART_statements_1 = 634;
  public static final int ARTL_ART_statements_2 = 635;
  public static final int ARTL_ART_statements_3 = 636;
  public static final int ARTL_ART_statements_4 = 637;
  public static final int ARTL_ART_statements_7 = 638;
  public static final int ARTL_ART_statements_8 = 639;
  public static final int ARTL_ART_statements_9 = 640;
  public static final int ARTL_ART_statements_10 = 641;
  public static final int ARTL_ART_statements_11 = 642;
  public static final int ARTL_ART_statements_12 = 643;
  public static final int ARTL_ART_subExpr_289 = 644;
  public static final int ARTL_ART_subExpr_290 = 645;
  public static final int ARTL_ART_subExpr_291 = 646;
  public static final int ARTL_ART_subExpr_292 = 647;
  public static final int ARTL_ART_subExpr_295 = 648;
  public static final int ARTL_ART_subExpr_296 = 649;
  public static final int ARTL_ART_subExpr_297 = 650;
  public static final int ARTL_ART_subExpr_298 = 651;
  public static final int ARTL_ART_subExpr_299 = 652;
  public static final int ARTL_ART_subExpr_300 = 653;
  public static final int ARTL_ART_subExpr_301 = 654;
  public static final int ARTL_ART_subExpr_302 = 655;
  public static final int ARTL_ART_subExpr_305 = 656;
  public static final int ARTL_ART_subExpr_306 = 657;
  public static final int ARTL_ART_subExpr_307 = 658;
  public static final int ARTL_ART_subExpr_308 = 659;
  public static final int ARTL_ART_subExpr_309 = 660;
  public static final int ARTL_ART_subExpr_310 = 661;
  public static final int ARTL_ART_subExpr_311 = 662;
  public static final int ARTL_ART_subExpr_312 = 663;
  public static final int ARTL_ART_subExpr_315 = 664;
  public static final int ARTL_ART_subExpr_316 = 665;
  public static final int ARTL_ART_subExpr_317 = 666;
  public static final int ARTL_ART_subExpr_318 = 667;
  public static final int ARTL_ART_subExpr_319 = 668;
  public static final int ARTL_ART_subExpr_320 = 669;
  public static final int ARTL_ART_subExpr_321 = 670;
  public static final int ARTL_ART_subExpr_322 = 671;
  public static final int ARTL_ART_subExpr_325 = 672;
  public static final int ARTL_ART_subExpr_326 = 673;
  public static final int ARTL_ART_subExpr_327 = 674;
  public static final int ARTL_ART_subExpr_328 = 675;
  public static final int ARTL_ART_subExpr_329 = 676;
  public static final int ARTL_ART_subExpr_330 = 677;
  public static final int ARTL_ART_subExpr_331 = 678;
  public static final int ARTL_ART_subExpr_332 = 679;
  public static final int ARTL_ART_subExpr_335 = 680;
  public static final int ARTL_ART_subExpr_336 = 681;
  public static final int ARTL_ART_subExpr_337 = 682;
  public static final int ARTL_ART_subExpr_338 = 683;
  public static final int ARTL_ART_subExpr_339 = 684;
  public static final int ARTL_ART_subExpr_340 = 685;
  public static final int ARTL_ART_subExpr_341 = 686;
  public static final int ARTL_ART_subExpr_342 = 687;
  public static final int ARTL_ART_subExpr_345 = 688;
  public static final int ARTL_ART_subExpr_346 = 689;
  public static final int ARTL_ART_subExpr_347 = 690;
  public static final int ARTL_ART_subExpr_348 = 691;
  public static final int ARTL_ART_subExpr_349 = 692;
  public static final int ARTL_ART_subExpr_350 = 693;
  public static final int ARTL_ART_subExpr_353 = 694;
  public static final int ARTL_ART_subExpr_354 = 695;
  public static final int ARTL_ART_subExpr_355 = 696;
  public static final int ARTL_ART_subExpr_356 = 697;
  public static final int ARTL_ART_subExpr_357 = 698;
  public static final int ARTL_ART_subExpr_358 = 699;
  public static final int ARTL_ART_subExpr_359 = 700;
  public static final int ARTL_ART_subExpr_360 = 701;
  public static final int ARTL_ART_volume_373 = 702;
  public static final int ARTL_ART_volume_374 = 703;
  public static final int ARTL_ART_volume_375 = 704;
  public static final int ARTL_ART_volume_376 = 705;
  public static final int ARTL_ART_volume_377 = 706;
  public static final int ARTL_ART_volume_378 = 707;
  public static final int ARTL_ART_volume_379 = 708;
  public static final int ARTL_ART_volume_380 = 709;
  public static final int ARTX_DESPATCH = 710;
  public static final int ARTX_DUMMY = 711;
  public static final int ARTX_LABEL_EXTENT = 712;
  /* End of artLabel enumeration */

  /* Start of artName enumeration */
  public static final int ARTNAME_NONE = 0;
  public static final int ARTNAME_EXTENT = 1;
  /* End of artName enumeration */
  public void ARTPF_ART_ID() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal ID production descriptor loads*/
      case ARTL_ART_ID: 
        if (ARTSet2[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ID_722, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ID: match production*/
      case ARTL_ART_ID_722: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_ID, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ID_724, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet3[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_INTEGER() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal INTEGER production descriptor loads*/
      case ARTL_ART_INTEGER: 
        if (ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_INTEGER_728, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal INTEGER: match production*/
      case ARTL_ART_INTEGER_728: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_INTEGER, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_INTEGER_730, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_REAL() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal REAL production descriptor loads*/
      case ARTL_ART_REAL: 
        if (ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_REAL_734, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal REAL: match production*/
      case ARTL_ART_REAL_734: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_REAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_REAL_736, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_STRING_DQ() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal STRING_DQ production descriptor loads*/
      case ARTL_ART_STRING_DQ: 
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_STRING_DQ_740, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal STRING_DQ: match production*/
      case ARTL_ART_STRING_DQ_740: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_STRING_DQ, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_STRING_DQ_742, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_beatRatio() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal beatRatio production descriptor loads*/
      case ARTL_ART_beatRatio: 
        if (ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_beatRatio_450, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal beatRatio: match production*/
      case ARTL_ART_beatRatio_450: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_beatRatio, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_beatRatio_452, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_beatRatio_454, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_REAL; return; }
      case ARTL_ART_beatRatio_454: 
        /* Nonterminal template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_beatRatio_456, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_bpm() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal bpm production descriptor loads*/
      case ARTL_ART_bpm: 
        if (ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_bpm_364, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal bpm: match production*/
      case ARTL_ART_bpm_364: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_bpm, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_bpm_366, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_bpm_368, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_bpm_368: 
        /* Nonterminal template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_bpm_370, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_chord() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal chord production descriptor loads*/
      case ARTL_ART_chord: 
        if (ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_chord_620, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal chord: match production*/
      case ARTL_ART_chord_620: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LBRACK, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_chord_622, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_chord_624, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_notes; return; }
      case ARTL_ART_chord_624: 
        /* Nonterminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RBRACK, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_chord_626, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_chordMode() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal chordMode production descriptor loads*/
      case ARTL_ART_chordMode: 
        if (ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_chordMode_488, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_chordMode_494, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_chordMode_500, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_chordMode_506, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_chordMode_512, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal chordMode: match production*/
      case ARTL_ART_chordMode_488: 
        /* Cat/unary template start */
        /* Epsilon template start */
        artCurrentSPPFRightChildNode = artFindSPPFEpsilon(artCurrentInputPairIndex);
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_chordMode_490, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Epsilon template end */
        /* Cat/unary template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal chordMode: match production*/
      case ARTL_ART_chordMode_494: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_m, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_chordMode_496, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal chordMode: match production*/
      case ARTL_ART_chordMode_500: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_m7, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_chordMode_502, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal chordMode: match production*/
      case ARTL_ART_chordMode_506: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_M, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_chordMode_508, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal chordMode: match production*/
      case ARTL_ART_chordMode_512: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_M7, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_chordMode_514, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_instrument() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal instrument production descriptor loads*/
      case ARTL_ART_instrument: 
        if (ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_instrument_384, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_instrument_402, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_instrument_420, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_instrument_430, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal instrument: match production*/
      case ARTL_ART_instrument_384: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_instrument, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_instrument_386, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_instrument_388, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_instrument_390, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_instrument_390: 
        /* Nonterminal template end */
        if (!ARTSet27[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_instrument_392, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_instrument_394, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_instrument_394: 
        /* Nonterminal template end */
        if (!ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_instrument_396, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_instrument_398, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal instrument: match production*/
      case ARTL_ART_instrument_402: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_instrument, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_instrument_404, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_instrument_406, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_instrument_408, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_STRING_DQ; return; }
      case ARTL_ART_instrument_408: 
        /* Nonterminal template end */
        if (!ARTSet27[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_instrument_410, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_instrument_412, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_instrument_412: 
        /* Nonterminal template end */
        if (!ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_instrument_414, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_instrument_416, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal instrument: match production*/
      case ARTL_ART_instrument_420: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_instrument, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_instrument_422, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_instrument_424, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_STRING_DQ; return; }
      case ARTL_ART_instrument_424: 
        /* Nonterminal template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_instrument_426, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal instrument: match production*/
      case ARTL_ART_instrument_430: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_instrument, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_instrument_432, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_instrument_434, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_instrument_434: 
        /* Nonterminal template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_instrument_436, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_note() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal note production descriptor loads*/
      case ARTL_ART_note: 
        if (ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_note_460, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_note_468, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_note_478, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal note: match production*/
      case ARTL_ART_note_460: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_note_462, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_simpleNote; return; }
      case ARTL_ART_note_462: 
        /* Nonterminal template end */
        if (!ARTSet31[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_note_464, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_chordMode; return; }
      case ARTL_ART_note_464: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal note: match production*/
      case ARTL_ART_note_468: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_note_470, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_simpleNote; return; }
      case ARTL_ART_note_470: 
        /* Nonterminal template end */
        if (!ARTSet33[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_note_472, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_shifters; return; }
      case ARTL_ART_note_472: 
        /* Nonterminal template end */
        if (!ARTSet31[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_note_474, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_chordMode; return; }
      case ARTL_ART_note_474: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal note: match production*/
      case ARTL_ART_note_478: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_note_480, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_simpleNote; return; }
      case ARTL_ART_note_480: 
        /* Nonterminal template end */
        if (!ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_note_482, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_INTEGER; return; }
      case ARTL_ART_note_482: 
        /* Nonterminal template end */
        if (!ARTSet31[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_note_484, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_chordMode; return; }
      case ARTL_ART_note_484: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_notes() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal notes production descriptor loads*/
      case ARTL_ART_notes: 
        if (ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_notes_628, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_notes_632, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal notes: match production*/
      case ARTL_ART_notes_628: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_notes_630, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_note; return; }
      case ARTL_ART_notes_630: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal notes: match production*/
      case ARTL_ART_notes_632: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_notes_634, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_note; return; }
      case ARTL_ART_notes_634: 
        /* Nonterminal template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_notes_636, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_notes; return; }
      case ARTL_ART_notes_636: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_octave() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal octave production descriptor loads*/
      case ARTL_ART_octave: 
        if (ARTSet36[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_octave_440, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal octave: match production*/
      case ARTL_ART_octave_440: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_octave, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_octave_442, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_octave_444, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_INTEGER; return; }
      case ARTL_ART_octave_444: 
        /* Nonterminal template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_octave_446, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_operand() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal operand production descriptor loads*/
      case ARTL_ART_operand: 
        if (ARTSet39[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_700, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_706, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_712, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_700: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_702, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_operand_702: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet38[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_706: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_708, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_INTEGER; return; }
      case ARTL_ART_operand_708: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet38[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_712: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_operand_714, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_716, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_operand_716: 
        /* Nonterminal template end */
        if (!ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_operand_718, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet38[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_printElements() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal printElements production descriptor loads*/
      case ARTL_ART_printElements: 
        if (ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_printElements_662, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_printElements_668, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_printElements_678, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_printElements_684, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet39[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_printElements_694, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal printElements: match production*/
      case ARTL_ART_printElements_662: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_printElements_664, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_STRING_DQ; return; }
      case ARTL_ART_printElements_664: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal printElements: match production*/
      case ARTL_ART_printElements_668: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_printElements_670, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_STRING_DQ; return; }
      case ARTL_ART_printElements_670: 
        /* Nonterminal template end */
        if (!ARTSet27[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_printElements_674, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet41[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_printElements_676, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_printElements; return; }
      case ARTL_ART_printElements_676: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal printElements: match production*/
      case ARTL_ART_printElements_678: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_printElements_680, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_printElements_680: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal printElements: match production*/
      case ARTL_ART_printElements_684: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_printElements_686, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_printElements_686: 
        /* Nonterminal template end */
        if (!ARTSet27[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_printElements_690, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet41[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_printElements_692, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_printElements; return; }
      case ARTL_ART_printElements_692: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal printElements: match production*/
      case ARTL_ART_printElements_694: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_printElements_696, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_printElements_696: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_relExpr() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal relExpr production descriptor loads*/
      case ARTL_ART_relExpr: 
        if (ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_224, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet42[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_230, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet42[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_240, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet42[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_250, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet42[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_260, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet42[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_270, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet42[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_relExpr_280, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_224: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_226, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_relExpr_226: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet43[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_230: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_232, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_relExpr_232: 
        /* Nonterminal template end */
        if (!ARTSet44[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__GT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_relExpr_234, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_236, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_relExpr_236: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet43[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_240: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_242, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_relExpr_242: 
        /* Nonterminal template end */
        if (!ARTSet45[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SHREIK_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_relExpr_244, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_246, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_relExpr_246: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet43[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_250: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_252, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_relExpr_252: 
        /* Nonterminal template end */
        if (!ARTSet46[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_relExpr_254, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_256, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_relExpr_256: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet43[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_260: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_262, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_relExpr_262: 
        /* Nonterminal template end */
        if (!ARTSet47[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__EQUAL_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_relExpr_264, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_266, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_relExpr_266: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet43[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_270: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_272, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_relExpr_272: 
        /* Nonterminal template end */
        if (!ARTSet48[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__GT_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_relExpr_274, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_276, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_relExpr_276: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet43[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal relExpr: match production*/
      case ARTL_ART_relExpr_280: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_282, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_relExpr_282: 
        /* Nonterminal template end */
        if (!ARTSet49[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LT_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_relExpr_284, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_relExpr_286, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_relExpr_286: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet43[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_rest() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal rest production descriptor loads*/
      case ARTL_ART_rest: 
        if (ARTSet51[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_rest_638, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet52[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_rest_644, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet53[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_rest_650, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet54[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_rest_656, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal rest: match production*/
      case ARTL_ART_rest_638: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PERIOD, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_rest_640, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal rest: match production*/
      case ARTL_ART_rest_644: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PERIOD_PERIOD, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_rest_646, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal rest: match production*/
      case ARTL_ART_rest_650: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PERIOD_PERIOD_PERIOD, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_rest_652, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal rest: match production*/
      case ARTL_ART_rest_656: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PERIOD_PERIOD_PERIOD_PERIOD, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_rest_658, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_shifters() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal shifters production descriptor loads*/
      case ARTL_ART_shifters: 
        if (ARTSet56[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_shifters_592, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet57[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_shifters_598, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet56[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_shifters_604, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet57[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_shifters_612, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal shifters: match production*/
      case ARTL_ART_shifters_592: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PLUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_shifters_594, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet31[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal shifters: match production*/
      case ARTL_ART_shifters_598: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_shifters_600, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet31[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal shifters: match production*/
      case ARTL_ART_shifters_604: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PLUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_shifters_606, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet33[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_shifters_608, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_shifters; return; }
      case ARTL_ART_shifters_608: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet31[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal shifters: match production*/
      case ARTL_ART_shifters_612: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_shifters_614, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet33[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_shifters_616, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_shifters; return; }
      case ARTL_ART_shifters_616: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet31[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_simpleNote() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal simpleNote production descriptor loads*/
      case ARTL_ART_simpleNote: 
        if (ARTSet58[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNote_518, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal simpleNote: match production*/
      case ARTL_ART_simpleNote_518: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_simpleNote_520, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_simpleNoteLexeme; return; }
      case ARTL_ART_simpleNote_520: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet59[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_simpleNoteLexeme() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal simpleNoteLexeme production descriptor loads*/
      case ARTL_ART_simpleNoteLexeme: 
        if (ARTSet61[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_524, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet62[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_528, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet63[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_532, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet64[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_536, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet65[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_540, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet66[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_544, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet67[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_548, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet68[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_552, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet69[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_556, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet70[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_560, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet71[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_564, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet72[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_568, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet73[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_572, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet74[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_576, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet75[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_580, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet76[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_584, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet77[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_simpleNoteLexeme_588, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_524: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Ab, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_526, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet59[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_528: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_A, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_530, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet59[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_532: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_A_HASH, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_534, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet59[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_536: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Bb, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_538, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet59[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_540: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_B, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_542, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet59[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_544: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_C, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_546, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet59[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_548: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_C_HASH, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_550, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet59[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_552: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Db, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_554, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet59[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_556: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_D, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_558, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet59[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_560: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_D_HASH, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_562, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet59[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_564: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Eb, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_566, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet59[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_568: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_E, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_570, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet59[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_572: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_F, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_574, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet59[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_576: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_F_HASH, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_578, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet59[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_580: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Gb, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_582, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet59[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_584: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_G, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_586, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet59[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal simpleNoteLexeme: match production*/
      case ARTL_ART_simpleNoteLexeme_588: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_G_HASH, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_simpleNoteLexeme_590, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet59[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_statement() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal statement production descriptor loads*/
      case ARTL_ART_statement: 
        if (ARTSet39[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_14, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet80[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_26, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet83[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_40, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet84[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_50, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet87[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_64, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet88[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_82, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet85[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_92, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet90[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_100, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet39[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_118, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet91[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_126, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet92[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_144, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet93[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_162, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet94[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_180, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet95[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_192, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet96[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_196, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_200, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet97[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_204, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet98[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_208, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet99[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_212, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet100[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_216, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet101[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_220, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_14: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_16, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_statement_16: 
        /* Nonterminal template end */
        if (!ARTSet79[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COLON_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_18, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_20, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_statement_20: 
        /* Nonterminal template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_22, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_26: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_if, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_28, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet42[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_30, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_statement_30: 
        /* Nonterminal template end */
        if (!ARTSet81[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_32, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_statement_32: 
        /* Nonterminal template end */
        if (!ARTSet82[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_else, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_34, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet81[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_36, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_statement_36: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_40: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_while, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_42, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet42[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_44, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_relExpr; return; }
      case ARTL_ART_statement_44: 
        /* Nonterminal template end */
        if (!ARTSet81[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_46, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_statement_46: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_50: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_melody, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_52, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet39[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_54, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_statement_54: 
        /* Nonterminal template end */
        if (!ARTSet85[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_56, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_58, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_STRING_DQ; return; }
      case ARTL_ART_statement_58: 
        /* Nonterminal template end */
        if (!ARTSet86[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_60, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_64: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_repeatNote, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_66, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_68, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_70, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_STRING_DQ; return; }
      case ARTL_ART_statement_70: 
        /* Nonterminal template end */
        if (!ARTSet27[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_72, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_74, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_statement_74: 
        /* Nonterminal template end */
        if (!ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_76, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_78, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_82: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_play, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_84, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet39[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_86, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_statement_86: 
        /* Nonterminal template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_88, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_92: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_94, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet89[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_96, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statements; return; }
      case ARTL_ART_statement_96: 
        /* Nonterminal template end */
        if (!ARTSet86[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_98, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_100: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_mix, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_102, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_104, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet39[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_106, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_statement_106: 
        /* Nonterminal template end */
        if (!ARTSet27[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_108, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet39[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_110, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_statement_110: 
        /* Nonterminal template end */
        if (!ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_112, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_114, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_118: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_120, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_statement_120: 
        /* Nonterminal template end */
        if (!ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_122, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_STRING_DQ; return; }
      case ARTL_ART_statement_122: 
        /* Nonterminal template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_124, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_126: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_backingtrack, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_128, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_130, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet39[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_132, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_statement_132: 
        /* Nonterminal template end */
        if (!ARTSet27[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_134, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_136, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_statement_136: 
        /* Nonterminal template end */
        if (!ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_138, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_140, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_144: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_scale, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_146, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_148, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_150, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_STRING_DQ; return; }
      case ARTL_ART_statement_150: 
        /* Nonterminal template end */
        if (!ARTSet27[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_152, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_154, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_STRING_DQ; return; }
      case ARTL_ART_statement_154: 
        /* Nonterminal template end */
        if (!ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_156, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_158, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_162: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_arpeggio, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_164, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_166, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_168, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_STRING_DQ; return; }
      case ARTL_ART_statement_168: 
        /* Nonterminal template end */
        if (!ARTSet27[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_170, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_172, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_STRING_DQ; return; }
      case ARTL_ART_statement_172: 
        /* Nonterminal template end */
        if (!ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_174, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_176, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_180: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_print, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_182, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_184, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet41[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_186, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_printElements; return; }
      case ARTL_ART_statement_186: 
        /* Nonterminal template end */
        if (!ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_188, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_190, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_192: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_194, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_bpm; return; }
      case ARTL_ART_statement_194: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_196: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_198, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_octave; return; }
      case ARTL_ART_statement_198: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_200: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_202, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_note; return; }
      case ARTL_ART_statement_202: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_204: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_206, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_chord; return; }
      case ARTL_ART_statement_206: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_208: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_210, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_rest; return; }
      case ARTL_ART_statement_210: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_212: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_214, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_instrument; return; }
      case ARTL_ART_statement_214: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_216: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_218, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_volume; return; }
      case ARTL_ART_statement_218: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_220: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_222, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_beatRatio; return; }
      case ARTL_ART_statement_222: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_statements() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal statements production descriptor loads*/
      case ARTL_ART_statements: 
        if (ARTSet81[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statements_2, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet81[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statements_8, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal statements: match production*/
      case ARTL_ART_statements_2: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statements_4, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_statements_4: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet102[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statements: match production*/
      case ARTL_ART_statements_8: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statements_10, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_statements_10: 
        /* Nonterminal template end */
        if (!ARTSet89[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statements_12, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statements; return; }
      case ARTL_ART_statements_12: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet102[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_subExpr() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal subExpr production descriptor loads*/
      case ARTL_ART_subExpr: 
        if (ARTSet103[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_290, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_296, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_306, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_316, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_326, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_336, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet57[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_346, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subExpr_354, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_290: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_292, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_subExpr_292: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet38[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_296: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_298, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_subExpr_298: 
        /* Nonterminal template end */
        if (!ARTSet57[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_subExpr_300, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet103[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_302, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_subExpr_302: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet38[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_306: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_308, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_subExpr_308: 
        /* Nonterminal template end */
        if (!ARTSet56[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PLUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_subExpr_310, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet103[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_312, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_subExpr_312: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet38[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_316: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_318, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_subExpr_318: 
        /* Nonterminal template end */
        if (!ARTSet104[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__STAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_subExpr_320, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet103[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_322, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_subExpr_322: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet38[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_326: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_328, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_subExpr_328: 
        /* Nonterminal template end */
        if (!ARTSet105[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SLASH, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_subExpr_330, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet103[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_332, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_subExpr_332: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet38[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_336: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_338, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_subExpr_338: 
        /* Nonterminal template end */
        if (!ARTSet106[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PERCENT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_subExpr_340, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet103[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_342, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_subExpr_342: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet38[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_346: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_subExpr_348, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_350, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_subExpr_350: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet38[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal subExpr: match production*/
      case ARTL_ART_subExpr_354: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_356, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_subExpr_356: 
        /* Nonterminal template end */
        if (!ARTSet107[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__STAR_STAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_subExpr_358, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet103[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subExpr_360, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_subExpr_360: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet38[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_volume() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal volume production descriptor loads*/
      case ARTL_ART_volume: 
        if (ARTSet108[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_volume_374, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal volume: match production*/
      case ARTL_ART_volume_374: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_volume, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_volume_376, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_volume_378, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subExpr; return; }
      case ARTL_ART_volume_378: 
        /* Nonterminal template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_volume_380, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void artParseBody(String artInputString, int artStartLabel) throws ARTException {
    this.artInputString = artInputString;
    artSetupCompleteTime = artReadClock();
    artStartSymbolLabel = artStartLabel;
    artIsInLanguage = false;
    artTokenExtent = 92;
    artLexicaliseForV3GLL(artInputString, null);
    artLexCompleteTime = artReadClock();
    artDummySPPFNode = artFindSPPFInitial(ARTL_DUMMY, 0, 0);
    artCurrentSPPFNode = artDummySPPFNode;
    artRootGSSNode = artFindGSS(ARTL_EOS, 0, 0, 0);
    artCurrentGSSNode = artRootGSSNode;
    artCurrentRestartLabel = artStartSymbolLabel;
    artCurrentInputPairIndex = 0;
    artCurrentInputPairReference = 0;
    while (true)
      switch (artlhsL[artCurrentRestartLabel]) {
        case ARTL_ART_ID: 
          ARTPF_ART_ID();
          break;
        case ARTL_ART_INTEGER: 
          ARTPF_ART_INTEGER();
          break;
        case ARTL_ART_REAL: 
          ARTPF_ART_REAL();
          break;
        case ARTL_ART_STRING_DQ: 
          ARTPF_ART_STRING_DQ();
          break;
        case ARTL_ART_beatRatio: 
          ARTPF_ART_beatRatio();
          break;
        case ARTL_ART_bpm: 
          ARTPF_ART_bpm();
          break;
        case ARTL_ART_chord: 
          ARTPF_ART_chord();
          break;
        case ARTL_ART_chordMode: 
          ARTPF_ART_chordMode();
          break;
        case ARTL_ART_instrument: 
          ARTPF_ART_instrument();
          break;
        case ARTL_ART_note: 
          ARTPF_ART_note();
          break;
        case ARTL_ART_notes: 
          ARTPF_ART_notes();
          break;
        case ARTL_ART_octave: 
          ARTPF_ART_octave();
          break;
        case ARTL_ART_operand: 
          ARTPF_ART_operand();
          break;
        case ARTL_ART_printElements: 
          ARTPF_ART_printElements();
          break;
        case ARTL_ART_relExpr: 
          ARTPF_ART_relExpr();
          break;
        case ARTL_ART_rest: 
          ARTPF_ART_rest();
          break;
        case ARTL_ART_shifters: 
          ARTPF_ART_shifters();
          break;
        case ARTL_ART_simpleNote: 
          ARTPF_ART_simpleNote();
          break;
        case ARTL_ART_simpleNoteLexeme: 
          ARTPF_ART_simpleNoteLexeme();
          break;
        case ARTL_ART_statement: 
          ARTPF_ART_statement();
          break;
        case ARTL_ART_statements: 
          ARTPF_ART_statements();
          break;
        case ARTL_ART_subExpr: 
          ARTPF_ART_subExpr();
          break;
        case ARTL_ART_volume: 
          ARTPF_ART_volume();
          break;
        case ARTX_DESPATCH: 
          if (artNoDescriptors()) { 
            artCheckAcceptance();
            artParseCompleteTime = artReadClock();
            return;
           }
          artUnloadDescriptor();
      }
  }

  public void ARTSet1initialise() {
    ARTSet1 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet1, 0, artSetExtent, false);
  }

  public void ARTSet58initialise() {
    ARTSet58 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet58, 0, artSetExtent, false);
    ARTSet58[ARTTS_A] = true;
    ARTSet58[ARTTS_A_HASH] = true;
    ARTSet58[ARTTS_Ab] = true;
    ARTSet58[ARTTS_B] = true;
    ARTSet58[ARTTS_Bb] = true;
    ARTSet58[ARTTS_C] = true;
    ARTSet58[ARTTS_C_HASH] = true;
    ARTSet58[ARTTS_D] = true;
    ARTSet58[ARTTS_D_HASH] = true;
    ARTSet58[ARTTS_Db] = true;
    ARTSet58[ARTTS_E] = true;
    ARTSet58[ARTTS_Eb] = true;
    ARTSet58[ARTTS_F] = true;
    ARTSet58[ARTTS_F_HASH] = true;
    ARTSet58[ARTTS_G] = true;
    ARTSet58[ARTTS_G_HASH] = true;
    ARTSet58[ARTTS_Gb] = true;
    ARTSet58[ARTL_ART_simpleNoteLexeme] = true;
  }

  public void ARTSet24initialise() {
    ARTSet24 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet24, 0, artSetExtent, false);
    ARTSet24[ARTTS_M7] = true;
  }

  public void ARTSet60initialise() {
    ARTSet60 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet60, 0, artSetExtent, false);
    ARTSet60[ARTTS_A] = true;
    ARTSet60[ARTTS_A_HASH] = true;
    ARTSet60[ARTTS_Ab] = true;
    ARTSet60[ARTTS_B] = true;
    ARTSet60[ARTTS_Bb] = true;
    ARTSet60[ARTTS_C] = true;
    ARTSet60[ARTTS_C_HASH] = true;
    ARTSet60[ARTTS_D] = true;
    ARTSet60[ARTTS_D_HASH] = true;
    ARTSet60[ARTTS_Db] = true;
    ARTSet60[ARTTS_E] = true;
    ARTSet60[ARTTS_Eb] = true;
    ARTSet60[ARTTS_F] = true;
    ARTSet60[ARTTS_F_HASH] = true;
    ARTSet60[ARTTS_G] = true;
    ARTSet60[ARTTS_G_HASH] = true;
    ARTSet60[ARTTS_Gb] = true;
  }

  public void ARTSet41initialise() {
    ARTSet41 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet41, 0, artSetExtent, false);
    ARTSet41[ARTTB_ID] = true;
    ARTSet41[ARTTB_INTEGER] = true;
    ARTSet41[ARTTB_STRING_DQ] = true;
    ARTSet41[ARTTS__LPAR] = true;
    ARTSet41[ARTTS__MINUS] = true;
    ARTSet41[ARTL_ART_ID] = true;
    ARTSet41[ARTL_ART_INTEGER] = true;
    ARTSet41[ARTL_ART_STRING_DQ] = true;
    ARTSet41[ARTL_ART_operand] = true;
    ARTSet41[ARTL_ART_printElements] = true;
    ARTSet41[ARTL_ART_subExpr] = true;
  }

  public void ARTSet83initialise() {
    ARTSet83 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet83, 0, artSetExtent, false);
    ARTSet83[ARTTS_while] = true;
  }

  public void ARTSet74initialise() {
    ARTSet74 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet74, 0, artSetExtent, false);
    ARTSet74[ARTTS_F_HASH] = true;
  }

  public void ARTSet68initialise() {
    ARTSet68 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet68, 0, artSetExtent, false);
    ARTSet68[ARTTS_Db] = true;
  }

  public void ARTSet47initialise() {
    ARTSet47 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet47, 0, artSetExtent, false);
    ARTSet47[ARTTS__EQUAL_EQUAL] = true;
  }

  public void ARTSet95initialise() {
    ARTSet95 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet95, 0, artSetExtent, false);
    ARTSet95[ARTTS_bpm] = true;
    ARTSet95[ARTL_ART_bpm] = true;
  }

  public void ARTSet42initialise() {
    ARTSet42 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet42, 0, artSetExtent, false);
    ARTSet42[ARTTB_ID] = true;
    ARTSet42[ARTTB_INTEGER] = true;
    ARTSet42[ARTTS__LPAR] = true;
    ARTSet42[ARTTS__MINUS] = true;
    ARTSet42[ARTL_ART_ID] = true;
    ARTSet42[ARTL_ART_INTEGER] = true;
    ARTSet42[ARTL_ART_operand] = true;
    ARTSet42[ARTL_ART_relExpr] = true;
    ARTSet42[ARTL_ART_subExpr] = true;
  }

  public void ARTSet77initialise() {
    ARTSet77 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet77, 0, artSetExtent, false);
    ARTSet77[ARTTS_G_HASH] = true;
  }

  public void ARTSet100initialise() {
    ARTSet100 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet100, 0, artSetExtent, false);
    ARTSet100[ARTTS_volume] = true;
    ARTSet100[ARTL_ART_volume] = true;
  }

  public void ARTSet71initialise() {
    ARTSet71 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet71, 0, artSetExtent, false);
    ARTSet71[ARTTS_Eb] = true;
  }

  public void ARTSet48initialise() {
    ARTSet48 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet48, 0, artSetExtent, false);
    ARTSet48[ARTTS__GT_EQUAL] = true;
  }

  public void ARTSet52initialise() {
    ARTSet52 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet52, 0, artSetExtent, false);
    ARTSet52[ARTTS__PERIOD_PERIOD] = true;
  }

  public void ARTSet102initialise() {
    ARTSet102 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet102, 0, artSetExtent, false);
    ARTSet102[ARTX_EOS] = true;
    ARTSet102[ARTTS__RBRACE] = true;
  }

  public void ARTSet108initialise() {
    ARTSet108 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet108, 0, artSetExtent, false);
    ARTSet108[ARTTS_volume] = true;
  }

  public void ARTSet36initialise() {
    ARTSet36 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet36, 0, artSetExtent, false);
    ARTSet36[ARTTS_octave] = true;
  }

  public void ARTSet91initialise() {
    ARTSet91 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet91, 0, artSetExtent, false);
    ARTSet91[ARTTS_backingtrack] = true;
  }

  public void ARTSet39initialise() {
    ARTSet39 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet39, 0, artSetExtent, false);
    ARTSet39[ARTTB_ID] = true;
    ARTSet39[ARTL_ART_ID] = true;
  }

  public void ARTSet92initialise() {
    ARTSet92 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet92, 0, artSetExtent, false);
    ARTSet92[ARTTS_scale] = true;
  }

  public void ARTSet78initialise() {
    ARTSet78 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet78, 0, artSetExtent, false);
    ARTSet78[ARTTB_ID] = true;
    ARTSet78[ARTTS__PERIOD] = true;
    ARTSet78[ARTTS__PERIOD_PERIOD] = true;
    ARTSet78[ARTTS__PERIOD_PERIOD_PERIOD] = true;
    ARTSet78[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = true;
    ARTSet78[ARTTS_A] = true;
    ARTSet78[ARTTS_A_HASH] = true;
    ARTSet78[ARTTS_Ab] = true;
    ARTSet78[ARTTS_B] = true;
    ARTSet78[ARTTS_Bb] = true;
    ARTSet78[ARTTS_C] = true;
    ARTSet78[ARTTS_C_HASH] = true;
    ARTSet78[ARTTS_D] = true;
    ARTSet78[ARTTS_D_HASH] = true;
    ARTSet78[ARTTS_Db] = true;
    ARTSet78[ARTTS_E] = true;
    ARTSet78[ARTTS_Eb] = true;
    ARTSet78[ARTTS_F] = true;
    ARTSet78[ARTTS_F_HASH] = true;
    ARTSet78[ARTTS_G] = true;
    ARTSet78[ARTTS_G_HASH] = true;
    ARTSet78[ARTTS_Gb] = true;
    ARTSet78[ARTTS__LBRACK] = true;
    ARTSet78[ARTTS_arpeggio] = true;
    ARTSet78[ARTTS_backingtrack] = true;
    ARTSet78[ARTTS_beatRatio] = true;
    ARTSet78[ARTTS_bpm] = true;
    ARTSet78[ARTTS_if] = true;
    ARTSet78[ARTTS_instrument] = true;
    ARTSet78[ARTTS_melody] = true;
    ARTSet78[ARTTS_mix] = true;
    ARTSet78[ARTTS_octave] = true;
    ARTSet78[ARTTS_play] = true;
    ARTSet78[ARTTS_print] = true;
    ARTSet78[ARTTS_repeatNote] = true;
    ARTSet78[ARTTS_scale] = true;
    ARTSet78[ARTTS_volume] = true;
    ARTSet78[ARTTS_while] = true;
    ARTSet78[ARTTS__LBRACE] = true;
    ARTSet78[ARTL_ART_ID] = true;
    ARTSet78[ARTL_ART_beatRatio] = true;
    ARTSet78[ARTL_ART_bpm] = true;
    ARTSet78[ARTL_ART_chord] = true;
    ARTSet78[ARTL_ART_instrument] = true;
    ARTSet78[ARTL_ART_note] = true;
    ARTSet78[ARTL_ART_octave] = true;
    ARTSet78[ARTL_ART_rest] = true;
    ARTSet78[ARTL_ART_simpleNote] = true;
    ARTSet78[ARTL_ART_simpleNoteLexeme] = true;
    ARTSet78[ARTL_ART_volume] = true;
  }

  public void ARTSet29initialise() {
    ARTSet29 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet29, 0, artSetExtent, false);
    ARTSet29[ARTTB_STRING_DQ] = true;
    ARTSet29[ARTL_ART_STRING_DQ] = true;
  }

  public void ARTSet96initialise() {
    ARTSet96 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet96, 0, artSetExtent, false);
    ARTSet96[ARTTS_octave] = true;
    ARTSet96[ARTL_ART_octave] = true;
  }

  public void ARTSet25initialise() {
    ARTSet25 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet25, 0, artSetExtent, false);
    ARTSet25[ARTTS_instrument] = true;
  }

  public void ARTSet55initialise() {
    ARTSet55 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet55, 0, artSetExtent, false);
    ARTSet55[ARTTS__PLUS] = true;
    ARTSet55[ARTTS__MINUS] = true;
  }

  public void ARTSet19initialise() {
    ARTSet19 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet19, 0, artSetExtent, false);
    ARTSet19[ARTTS_M] = true;
    ARTSet19[ARTTS_M7] = true;
    ARTSet19[ARTTS_m] = true;
    ARTSet19[ARTTS_m7] = true;
  }

  public void ARTSet2initialise() {
    ARTSet2 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet2, 0, artSetExtent, false);
    ARTSet2[ARTTB_ID] = true;
  }

  public void ARTSet14initialise() {
    ARTSet14 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet14, 0, artSetExtent, false);
    ARTSet14[ARTTS_bpm] = true;
  }

  public void ARTSet81initialise() {
    ARTSet81 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet81, 0, artSetExtent, false);
    ARTSet81[ARTTB_ID] = true;
    ARTSet81[ARTTS__PERIOD] = true;
    ARTSet81[ARTTS__PERIOD_PERIOD] = true;
    ARTSet81[ARTTS__PERIOD_PERIOD_PERIOD] = true;
    ARTSet81[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = true;
    ARTSet81[ARTTS_A] = true;
    ARTSet81[ARTTS_A_HASH] = true;
    ARTSet81[ARTTS_Ab] = true;
    ARTSet81[ARTTS_B] = true;
    ARTSet81[ARTTS_Bb] = true;
    ARTSet81[ARTTS_C] = true;
    ARTSet81[ARTTS_C_HASH] = true;
    ARTSet81[ARTTS_D] = true;
    ARTSet81[ARTTS_D_HASH] = true;
    ARTSet81[ARTTS_Db] = true;
    ARTSet81[ARTTS_E] = true;
    ARTSet81[ARTTS_Eb] = true;
    ARTSet81[ARTTS_F] = true;
    ARTSet81[ARTTS_F_HASH] = true;
    ARTSet81[ARTTS_G] = true;
    ARTSet81[ARTTS_G_HASH] = true;
    ARTSet81[ARTTS_Gb] = true;
    ARTSet81[ARTTS__LBRACK] = true;
    ARTSet81[ARTTS_arpeggio] = true;
    ARTSet81[ARTTS_backingtrack] = true;
    ARTSet81[ARTTS_beatRatio] = true;
    ARTSet81[ARTTS_bpm] = true;
    ARTSet81[ARTTS_if] = true;
    ARTSet81[ARTTS_instrument] = true;
    ARTSet81[ARTTS_melody] = true;
    ARTSet81[ARTTS_mix] = true;
    ARTSet81[ARTTS_octave] = true;
    ARTSet81[ARTTS_play] = true;
    ARTSet81[ARTTS_print] = true;
    ARTSet81[ARTTS_repeatNote] = true;
    ARTSet81[ARTTS_scale] = true;
    ARTSet81[ARTTS_volume] = true;
    ARTSet81[ARTTS_while] = true;
    ARTSet81[ARTTS__LBRACE] = true;
    ARTSet81[ARTL_ART_ID] = true;
    ARTSet81[ARTL_ART_beatRatio] = true;
    ARTSet81[ARTL_ART_bpm] = true;
    ARTSet81[ARTL_ART_chord] = true;
    ARTSet81[ARTL_ART_instrument] = true;
    ARTSet81[ARTL_ART_note] = true;
    ARTSet81[ARTL_ART_octave] = true;
    ARTSet81[ARTL_ART_rest] = true;
    ARTSet81[ARTL_ART_simpleNote] = true;
    ARTSet81[ARTL_ART_simpleNoteLexeme] = true;
    ARTSet81[ARTL_ART_statement] = true;
    ARTSet81[ARTL_ART_volume] = true;
  }

  public void ARTSet89initialise() {
    ARTSet89 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet89, 0, artSetExtent, false);
    ARTSet89[ARTTB_ID] = true;
    ARTSet89[ARTTS__PERIOD] = true;
    ARTSet89[ARTTS__PERIOD_PERIOD] = true;
    ARTSet89[ARTTS__PERIOD_PERIOD_PERIOD] = true;
    ARTSet89[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = true;
    ARTSet89[ARTTS_A] = true;
    ARTSet89[ARTTS_A_HASH] = true;
    ARTSet89[ARTTS_Ab] = true;
    ARTSet89[ARTTS_B] = true;
    ARTSet89[ARTTS_Bb] = true;
    ARTSet89[ARTTS_C] = true;
    ARTSet89[ARTTS_C_HASH] = true;
    ARTSet89[ARTTS_D] = true;
    ARTSet89[ARTTS_D_HASH] = true;
    ARTSet89[ARTTS_Db] = true;
    ARTSet89[ARTTS_E] = true;
    ARTSet89[ARTTS_Eb] = true;
    ARTSet89[ARTTS_F] = true;
    ARTSet89[ARTTS_F_HASH] = true;
    ARTSet89[ARTTS_G] = true;
    ARTSet89[ARTTS_G_HASH] = true;
    ARTSet89[ARTTS_Gb] = true;
    ARTSet89[ARTTS__LBRACK] = true;
    ARTSet89[ARTTS_arpeggio] = true;
    ARTSet89[ARTTS_backingtrack] = true;
    ARTSet89[ARTTS_beatRatio] = true;
    ARTSet89[ARTTS_bpm] = true;
    ARTSet89[ARTTS_if] = true;
    ARTSet89[ARTTS_instrument] = true;
    ARTSet89[ARTTS_melody] = true;
    ARTSet89[ARTTS_mix] = true;
    ARTSet89[ARTTS_octave] = true;
    ARTSet89[ARTTS_play] = true;
    ARTSet89[ARTTS_print] = true;
    ARTSet89[ARTTS_repeatNote] = true;
    ARTSet89[ARTTS_scale] = true;
    ARTSet89[ARTTS_volume] = true;
    ARTSet89[ARTTS_while] = true;
    ARTSet89[ARTTS__LBRACE] = true;
    ARTSet89[ARTL_ART_ID] = true;
    ARTSet89[ARTL_ART_beatRatio] = true;
    ARTSet89[ARTL_ART_bpm] = true;
    ARTSet89[ARTL_ART_chord] = true;
    ARTSet89[ARTL_ART_instrument] = true;
    ARTSet89[ARTL_ART_note] = true;
    ARTSet89[ARTL_ART_octave] = true;
    ARTSet89[ARTL_ART_rest] = true;
    ARTSet89[ARTL_ART_simpleNote] = true;
    ARTSet89[ARTL_ART_simpleNoteLexeme] = true;
    ARTSet89[ARTL_ART_statement] = true;
    ARTSet89[ARTL_ART_statements] = true;
    ARTSet89[ARTL_ART_volume] = true;
  }

  public void ARTSet30initialise() {
    ARTSet30 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet30, 0, artSetExtent, false);
    ARTSet30[ARTTS_A] = true;
    ARTSet30[ARTTS_A_HASH] = true;
    ARTSet30[ARTTS_Ab] = true;
    ARTSet30[ARTTS_B] = true;
    ARTSet30[ARTTS_Bb] = true;
    ARTSet30[ARTTS_C] = true;
    ARTSet30[ARTTS_C_HASH] = true;
    ARTSet30[ARTTS_D] = true;
    ARTSet30[ARTTS_D_HASH] = true;
    ARTSet30[ARTTS_Db] = true;
    ARTSet30[ARTTS_E] = true;
    ARTSet30[ARTTS_Eb] = true;
    ARTSet30[ARTTS_F] = true;
    ARTSet30[ARTTS_F_HASH] = true;
    ARTSet30[ARTTS_G] = true;
    ARTSet30[ARTTS_G_HASH] = true;
    ARTSet30[ARTTS_Gb] = true;
    ARTSet30[ARTL_ART_simpleNote] = true;
    ARTSet30[ARTL_ART_simpleNoteLexeme] = true;
  }

  public void ARTSet12initialise() {
    ARTSet12 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet12, 0, artSetExtent, false);
    ARTSet12[ARTX_EOS] = true;
    ARTSet12[ARTTB_ID] = true;
    ARTSet12[ARTTS__PERIOD] = true;
    ARTSet12[ARTTS__PERIOD_PERIOD] = true;
    ARTSet12[ARTTS__PERIOD_PERIOD_PERIOD] = true;
    ARTSet12[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = true;
    ARTSet12[ARTTS_A] = true;
    ARTSet12[ARTTS_A_HASH] = true;
    ARTSet12[ARTTS_Ab] = true;
    ARTSet12[ARTTS_B] = true;
    ARTSet12[ARTTS_Bb] = true;
    ARTSet12[ARTTS_C] = true;
    ARTSet12[ARTTS_C_HASH] = true;
    ARTSet12[ARTTS_D] = true;
    ARTSet12[ARTTS_D_HASH] = true;
    ARTSet12[ARTTS_Db] = true;
    ARTSet12[ARTTS_E] = true;
    ARTSet12[ARTTS_Eb] = true;
    ARTSet12[ARTTS_F] = true;
    ARTSet12[ARTTS_F_HASH] = true;
    ARTSet12[ARTTS_G] = true;
    ARTSet12[ARTTS_G_HASH] = true;
    ARTSet12[ARTTS_Gb] = true;
    ARTSet12[ARTTS__LBRACK] = true;
    ARTSet12[ARTTS_arpeggio] = true;
    ARTSet12[ARTTS_backingtrack] = true;
    ARTSet12[ARTTS_beatRatio] = true;
    ARTSet12[ARTTS_bpm] = true;
    ARTSet12[ARTTS_else] = true;
    ARTSet12[ARTTS_if] = true;
    ARTSet12[ARTTS_instrument] = true;
    ARTSet12[ARTTS_melody] = true;
    ARTSet12[ARTTS_mix] = true;
    ARTSet12[ARTTS_octave] = true;
    ARTSet12[ARTTS_play] = true;
    ARTSet12[ARTTS_print] = true;
    ARTSet12[ARTTS_repeatNote] = true;
    ARTSet12[ARTTS_scale] = true;
    ARTSet12[ARTTS_volume] = true;
    ARTSet12[ARTTS_while] = true;
    ARTSet12[ARTTS__LBRACE] = true;
    ARTSet12[ARTTS__RBRACE] = true;
    ARTSet12[ARTL_ART_ID] = true;
    ARTSet12[ARTL_ART_beatRatio] = true;
    ARTSet12[ARTL_ART_bpm] = true;
    ARTSet12[ARTL_ART_chord] = true;
    ARTSet12[ARTL_ART_instrument] = true;
    ARTSet12[ARTL_ART_note] = true;
    ARTSet12[ARTL_ART_octave] = true;
    ARTSet12[ARTL_ART_rest] = true;
    ARTSet12[ARTL_ART_simpleNote] = true;
    ARTSet12[ARTL_ART_simpleNoteLexeme] = true;
    ARTSet12[ARTL_ART_statement] = true;
    ARTSet12[ARTL_ART_statements] = true;
    ARTSet12[ARTL_ART_volume] = true;
  }

  public void ARTSet9initialise() {
    ARTSet9 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet9, 0, artSetExtent, false);
    ARTSet9[ARTTB_STRING_DQ] = true;
  }

  public void ARTSet13initialise() {
    ARTSet13 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet13, 0, artSetExtent, false);
    ARTSet13[ARTTB_REAL] = true;
    ARTSet13[ARTL_ART_REAL] = true;
  }

  public void ARTSet6initialise() {
    ARTSet6 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet6, 0, artSetExtent, false);
    ARTSet6[ARTX_EOS] = true;
    ARTSet6[ARTTB_ID] = true;
    ARTSet6[ARTTS__SHREIK_EQUAL] = true;
    ARTSet6[ARTTS__PERCENT] = true;
    ARTSet6[ARTTS__RPAR] = true;
    ARTSet6[ARTTS__STAR] = true;
    ARTSet6[ARTTS__STAR_STAR] = true;
    ARTSet6[ARTTS__PLUS] = true;
    ARTSet6[ARTTS__COMMA] = true;
    ARTSet6[ARTTS__MINUS] = true;
    ARTSet6[ARTTS__PERIOD] = true;
    ARTSet6[ARTTS__PERIOD_PERIOD] = true;
    ARTSet6[ARTTS__PERIOD_PERIOD_PERIOD] = true;
    ARTSet6[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = true;
    ARTSet6[ARTTS__SLASH] = true;
    ARTSet6[ARTTS__SEMICOLON] = true;
    ARTSet6[ARTTS__LT] = true;
    ARTSet6[ARTTS__LT_EQUAL] = true;
    ARTSet6[ARTTS__EQUAL_EQUAL] = true;
    ARTSet6[ARTTS__GT] = true;
    ARTSet6[ARTTS__GT_EQUAL] = true;
    ARTSet6[ARTTS_A] = true;
    ARTSet6[ARTTS_A_HASH] = true;
    ARTSet6[ARTTS_Ab] = true;
    ARTSet6[ARTTS_B] = true;
    ARTSet6[ARTTS_Bb] = true;
    ARTSet6[ARTTS_C] = true;
    ARTSet6[ARTTS_C_HASH] = true;
    ARTSet6[ARTTS_D] = true;
    ARTSet6[ARTTS_D_HASH] = true;
    ARTSet6[ARTTS_Db] = true;
    ARTSet6[ARTTS_E] = true;
    ARTSet6[ARTTS_Eb] = true;
    ARTSet6[ARTTS_F] = true;
    ARTSet6[ARTTS_F_HASH] = true;
    ARTSet6[ARTTS_G] = true;
    ARTSet6[ARTTS_G_HASH] = true;
    ARTSet6[ARTTS_Gb] = true;
    ARTSet6[ARTTS_M] = true;
    ARTSet6[ARTTS_M7] = true;
    ARTSet6[ARTTS__LBRACK] = true;
    ARTSet6[ARTTS__RBRACK] = true;
    ARTSet6[ARTTS_arpeggio] = true;
    ARTSet6[ARTTS_backingtrack] = true;
    ARTSet6[ARTTS_beatRatio] = true;
    ARTSet6[ARTTS_bpm] = true;
    ARTSet6[ARTTS_else] = true;
    ARTSet6[ARTTS_if] = true;
    ARTSet6[ARTTS_instrument] = true;
    ARTSet6[ARTTS_m] = true;
    ARTSet6[ARTTS_m7] = true;
    ARTSet6[ARTTS_melody] = true;
    ARTSet6[ARTTS_mix] = true;
    ARTSet6[ARTTS_octave] = true;
    ARTSet6[ARTTS_play] = true;
    ARTSet6[ARTTS_print] = true;
    ARTSet6[ARTTS_repeatNote] = true;
    ARTSet6[ARTTS_scale] = true;
    ARTSet6[ARTTS_volume] = true;
    ARTSet6[ARTTS_while] = true;
    ARTSet6[ARTTS__LBRACE] = true;
    ARTSet6[ARTTS__RBRACE] = true;
    ARTSet6[ARTL_ART_ID] = true;
    ARTSet6[ARTL_ART_beatRatio] = true;
    ARTSet6[ARTL_ART_bpm] = true;
    ARTSet6[ARTL_ART_chord] = true;
    ARTSet6[ARTL_ART_chordMode] = true;
    ARTSet6[ARTL_ART_instrument] = true;
    ARTSet6[ARTL_ART_note] = true;
    ARTSet6[ARTL_ART_notes] = true;
    ARTSet6[ARTL_ART_octave] = true;
    ARTSet6[ARTL_ART_rest] = true;
    ARTSet6[ARTL_ART_simpleNote] = true;
    ARTSet6[ARTL_ART_simpleNoteLexeme] = true;
    ARTSet6[ARTL_ART_statement] = true;
    ARTSet6[ARTL_ART_statements] = true;
    ARTSet6[ARTL_ART_volume] = true;
  }

  public void ARTSet94initialise() {
    ARTSet94 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet94, 0, artSetExtent, false);
    ARTSet94[ARTTS_print] = true;
  }

  public void ARTSet75initialise() {
    ARTSet75 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet75, 0, artSetExtent, false);
    ARTSet75[ARTTS_Gb] = true;
  }

  public void ARTSet97initialise() {
    ARTSet97 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet97, 0, artSetExtent, false);
    ARTSet97[ARTTS__LBRACK] = true;
    ARTSet97[ARTL_ART_chord] = true;
  }

  public void ARTSet20initialise() {
    ARTSet20 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet20, 0, artSetExtent, false);
    ARTSet20[ARTX_EOS] = true;
    ARTSet20[ARTTB_ID] = true;
    ARTSet20[ARTTS__PERIOD] = true;
    ARTSet20[ARTTS__PERIOD_PERIOD] = true;
    ARTSet20[ARTTS__PERIOD_PERIOD_PERIOD] = true;
    ARTSet20[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = true;
    ARTSet20[ARTTS_A] = true;
    ARTSet20[ARTTS_A_HASH] = true;
    ARTSet20[ARTTS_Ab] = true;
    ARTSet20[ARTTS_B] = true;
    ARTSet20[ARTTS_Bb] = true;
    ARTSet20[ARTTS_C] = true;
    ARTSet20[ARTTS_C_HASH] = true;
    ARTSet20[ARTTS_D] = true;
    ARTSet20[ARTTS_D_HASH] = true;
    ARTSet20[ARTTS_Db] = true;
    ARTSet20[ARTTS_E] = true;
    ARTSet20[ARTTS_Eb] = true;
    ARTSet20[ARTTS_F] = true;
    ARTSet20[ARTTS_F_HASH] = true;
    ARTSet20[ARTTS_G] = true;
    ARTSet20[ARTTS_G_HASH] = true;
    ARTSet20[ARTTS_Gb] = true;
    ARTSet20[ARTTS__LBRACK] = true;
    ARTSet20[ARTTS__RBRACK] = true;
    ARTSet20[ARTTS_arpeggio] = true;
    ARTSet20[ARTTS_backingtrack] = true;
    ARTSet20[ARTTS_beatRatio] = true;
    ARTSet20[ARTTS_bpm] = true;
    ARTSet20[ARTTS_else] = true;
    ARTSet20[ARTTS_if] = true;
    ARTSet20[ARTTS_instrument] = true;
    ARTSet20[ARTTS_melody] = true;
    ARTSet20[ARTTS_mix] = true;
    ARTSet20[ARTTS_octave] = true;
    ARTSet20[ARTTS_play] = true;
    ARTSet20[ARTTS_print] = true;
    ARTSet20[ARTTS_repeatNote] = true;
    ARTSet20[ARTTS_scale] = true;
    ARTSet20[ARTTS_volume] = true;
    ARTSet20[ARTTS_while] = true;
    ARTSet20[ARTTS__LBRACE] = true;
    ARTSet20[ARTTS__RBRACE] = true;
    ARTSet20[ARTL_ART_ID] = true;
    ARTSet20[ARTL_ART_beatRatio] = true;
    ARTSet20[ARTL_ART_bpm] = true;
    ARTSet20[ARTL_ART_chord] = true;
    ARTSet20[ARTL_ART_instrument] = true;
    ARTSet20[ARTL_ART_note] = true;
    ARTSet20[ARTL_ART_notes] = true;
    ARTSet20[ARTL_ART_octave] = true;
    ARTSet20[ARTL_ART_rest] = true;
    ARTSet20[ARTL_ART_simpleNote] = true;
    ARTSet20[ARTL_ART_simpleNoteLexeme] = true;
    ARTSet20[ARTL_ART_statement] = true;
    ARTSet20[ARTL_ART_statements] = true;
    ARTSet20[ARTL_ART_volume] = true;
  }

  public void ARTSet63initialise() {
    ARTSet63 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet63, 0, artSetExtent, false);
    ARTSet63[ARTTS_A_HASH] = true;
  }

  public void ARTSet88initialise() {
    ARTSet88 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet88, 0, artSetExtent, false);
    ARTSet88[ARTTS_play] = true;
  }

  public void ARTSet34initialise() {
    ARTSet34 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet34, 0, artSetExtent, false);
    ARTSet34[ARTTB_INTEGER] = true;
    ARTSet34[ARTL_ART_INTEGER] = true;
  }

  public void ARTSet40initialise() {
    ARTSet40 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet40, 0, artSetExtent, false);
    ARTSet40[ARTTB_ID] = true;
    ARTSet40[ARTTB_INTEGER] = true;
    ARTSet40[ARTTB_STRING_DQ] = true;
    ARTSet40[ARTTS__LPAR] = true;
    ARTSet40[ARTTS__MINUS] = true;
    ARTSet40[ARTL_ART_ID] = true;
    ARTSet40[ARTL_ART_INTEGER] = true;
    ARTSet40[ARTL_ART_STRING_DQ] = true;
    ARTSet40[ARTL_ART_operand] = true;
    ARTSet40[ARTL_ART_subExpr] = true;
  }

  public void ARTSet11initialise() {
    ARTSet11 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet11, 0, artSetExtent, false);
    ARTSet11[ARTTS_beatRatio] = true;
  }

  public void ARTSet80initialise() {
    ARTSet80 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet80, 0, artSetExtent, false);
    ARTSet80[ARTTS_if] = true;
  }

  public void ARTSet82initialise() {
    ARTSet82 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet82, 0, artSetExtent, false);
    ARTSet82[ARTTS_else] = true;
  }

  public void ARTSet33initialise() {
    ARTSet33 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet33, 0, artSetExtent, false);
    ARTSet33[ARTTS__PLUS] = true;
    ARTSet33[ARTTS__MINUS] = true;
    ARTSet33[ARTL_ART_shifters] = true;
  }

  public void ARTSet106initialise() {
    ARTSet106 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet106, 0, artSetExtent, false);
    ARTSet106[ARTTS__PERCENT] = true;
  }

  public void ARTSet26initialise() {
    ARTSet26 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet26, 0, artSetExtent, false);
    ARTSet26[ARTTS__LPAR] = true;
  }

  public void ARTSet28initialise() {
    ARTSet28 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet28, 0, artSetExtent, false);
    ARTSet28[ARTTS__RPAR] = true;
  }

  public void ARTSet104initialise() {
    ARTSet104 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet104, 0, artSetExtent, false);
    ARTSet104[ARTTS__STAR] = true;
  }

  public void ARTSet56initialise() {
    ARTSet56 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet56, 0, artSetExtent, false);
    ARTSet56[ARTTS__PLUS] = true;
  }

  public void ARTSet17initialise() {
    ARTSet17 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet17, 0, artSetExtent, false);
    ARTSet17[ARTTS_A] = true;
    ARTSet17[ARTTS_A_HASH] = true;
    ARTSet17[ARTTS_Ab] = true;
    ARTSet17[ARTTS_B] = true;
    ARTSet17[ARTTS_Bb] = true;
    ARTSet17[ARTTS_C] = true;
    ARTSet17[ARTTS_C_HASH] = true;
    ARTSet17[ARTTS_D] = true;
    ARTSet17[ARTTS_D_HASH] = true;
    ARTSet17[ARTTS_Db] = true;
    ARTSet17[ARTTS_E] = true;
    ARTSet17[ARTTS_Eb] = true;
    ARTSet17[ARTTS_F] = true;
    ARTSet17[ARTTS_F_HASH] = true;
    ARTSet17[ARTTS_G] = true;
    ARTSet17[ARTTS_G_HASH] = true;
    ARTSet17[ARTTS_Gb] = true;
    ARTSet17[ARTL_ART_note] = true;
    ARTSet17[ARTL_ART_notes] = true;
    ARTSet17[ARTL_ART_simpleNote] = true;
    ARTSet17[ARTL_ART_simpleNoteLexeme] = true;
  }

  public void ARTSet27initialise() {
    ARTSet27 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet27, 0, artSetExtent, false);
    ARTSet27[ARTTS__COMMA] = true;
  }

  public void ARTSet99initialise() {
    ARTSet99 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet99, 0, artSetExtent, false);
    ARTSet99[ARTTS_instrument] = true;
    ARTSet99[ARTL_ART_instrument] = true;
  }

  public void ARTSet57initialise() {
    ARTSet57 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet57, 0, artSetExtent, false);
    ARTSet57[ARTTS__MINUS] = true;
  }

  public void ARTSet51initialise() {
    ARTSet51 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet51, 0, artSetExtent, false);
    ARTSet51[ARTTS__PERIOD] = true;
  }

  public void ARTSet105initialise() {
    ARTSet105 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet105, 0, artSetExtent, false);
    ARTSet105[ARTTS__SLASH] = true;
  }

  public void ARTSet98initialise() {
    ARTSet98 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet98, 0, artSetExtent, false);
    ARTSet98[ARTTS__PERIOD] = true;
    ARTSet98[ARTTS__PERIOD_PERIOD] = true;
    ARTSet98[ARTTS__PERIOD_PERIOD_PERIOD] = true;
    ARTSet98[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = true;
    ARTSet98[ARTL_ART_rest] = true;
  }

  public void ARTSet84initialise() {
    ARTSet84 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet84, 0, artSetExtent, false);
    ARTSet84[ARTTS_melody] = true;
  }

  public void ARTSet3initialise() {
    ARTSet3 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet3, 0, artSetExtent, false);
    ARTSet3[ARTTB_ID] = true;
    ARTSet3[ARTTB_STRING_DQ] = true;
    ARTSet3[ARTTS__SHREIK_EQUAL] = true;
    ARTSet3[ARTTS__PERCENT] = true;
    ARTSet3[ARTTS__RPAR] = true;
    ARTSet3[ARTTS__STAR] = true;
    ARTSet3[ARTTS__STAR_STAR] = true;
    ARTSet3[ARTTS__PLUS] = true;
    ARTSet3[ARTTS__COMMA] = true;
    ARTSet3[ARTTS__MINUS] = true;
    ARTSet3[ARTTS__PERIOD] = true;
    ARTSet3[ARTTS__PERIOD_PERIOD] = true;
    ARTSet3[ARTTS__PERIOD_PERIOD_PERIOD] = true;
    ARTSet3[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = true;
    ARTSet3[ARTTS__SLASH] = true;
    ARTSet3[ARTTS__COLON_EQUAL] = true;
    ARTSet3[ARTTS__SEMICOLON] = true;
    ARTSet3[ARTTS__LT] = true;
    ARTSet3[ARTTS__LT_EQUAL] = true;
    ARTSet3[ARTTS__EQUAL_EQUAL] = true;
    ARTSet3[ARTTS__GT] = true;
    ARTSet3[ARTTS__GT_EQUAL] = true;
    ARTSet3[ARTTS_A] = true;
    ARTSet3[ARTTS_A_HASH] = true;
    ARTSet3[ARTTS_Ab] = true;
    ARTSet3[ARTTS_B] = true;
    ARTSet3[ARTTS_Bb] = true;
    ARTSet3[ARTTS_C] = true;
    ARTSet3[ARTTS_C_HASH] = true;
    ARTSet3[ARTTS_D] = true;
    ARTSet3[ARTTS_D_HASH] = true;
    ARTSet3[ARTTS_Db] = true;
    ARTSet3[ARTTS_E] = true;
    ARTSet3[ARTTS_Eb] = true;
    ARTSet3[ARTTS_F] = true;
    ARTSet3[ARTTS_F_HASH] = true;
    ARTSet3[ARTTS_G] = true;
    ARTSet3[ARTTS_G_HASH] = true;
    ARTSet3[ARTTS_Gb] = true;
    ARTSet3[ARTTS__LBRACK] = true;
    ARTSet3[ARTTS_arpeggio] = true;
    ARTSet3[ARTTS_backingtrack] = true;
    ARTSet3[ARTTS_beatRatio] = true;
    ARTSet3[ARTTS_bpm] = true;
    ARTSet3[ARTTS_if] = true;
    ARTSet3[ARTTS_instrument] = true;
    ARTSet3[ARTTS_melody] = true;
    ARTSet3[ARTTS_mix] = true;
    ARTSet3[ARTTS_octave] = true;
    ARTSet3[ARTTS_play] = true;
    ARTSet3[ARTTS_print] = true;
    ARTSet3[ARTTS_repeatNote] = true;
    ARTSet3[ARTTS_scale] = true;
    ARTSet3[ARTTS_volume] = true;
    ARTSet3[ARTTS_while] = true;
    ARTSet3[ARTTS__LBRACE] = true;
    ARTSet3[ARTL_ART_ID] = true;
    ARTSet3[ARTL_ART_STRING_DQ] = true;
    ARTSet3[ARTL_ART_beatRatio] = true;
    ARTSet3[ARTL_ART_bpm] = true;
    ARTSet3[ARTL_ART_chord] = true;
    ARTSet3[ARTL_ART_instrument] = true;
    ARTSet3[ARTL_ART_note] = true;
    ARTSet3[ARTL_ART_octave] = true;
    ARTSet3[ARTL_ART_rest] = true;
    ARTSet3[ARTL_ART_simpleNote] = true;
    ARTSet3[ARTL_ART_simpleNoteLexeme] = true;
    ARTSet3[ARTL_ART_statement] = true;
    ARTSet3[ARTL_ART_volume] = true;
  }

  public void ARTSet32initialise() {
    ARTSet32 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet32, 0, artSetExtent, false);
    ARTSet32[ARTTS_M] = true;
    ARTSet32[ARTTS_M7] = true;
    ARTSet32[ARTTS_m] = true;
    ARTSet32[ARTTS_m7] = true;
    ARTSet32[ARTL_ART_chordMode] = true;
  }

  public void ARTSet87initialise() {
    ARTSet87 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet87, 0, artSetExtent, false);
    ARTSet87[ARTTS_repeatNote] = true;
  }

  public void ARTSet37initialise() {
    ARTSet37 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet37, 0, artSetExtent, false);
    ARTSet37[ARTTB_ID] = true;
    ARTSet37[ARTTB_INTEGER] = true;
    ARTSet37[ARTTS__LPAR] = true;
    ARTSet37[ARTL_ART_ID] = true;
    ARTSet37[ARTL_ART_INTEGER] = true;
  }

  public void ARTSet8initialise() {
    ARTSet8 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet8, 0, artSetExtent, false);
    ARTSet8[ARTTS__SEMICOLON] = true;
  }

  public void ARTSet45initialise() {
    ARTSet45 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet45, 0, artSetExtent, false);
    ARTSet45[ARTTS__SHREIK_EQUAL] = true;
  }

  public void ARTSet46initialise() {
    ARTSet46 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet46, 0, artSetExtent, false);
    ARTSet46[ARTTS__LT] = true;
  }

  public void ARTSet4initialise() {
    ARTSet4 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet4, 0, artSetExtent, false);
  }

  public void ARTSet44initialise() {
    ARTSet44 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet44, 0, artSetExtent, false);
    ARTSet44[ARTTS__GT] = true;
  }

  public void ARTSet67initialise() {
    ARTSet67 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet67, 0, artSetExtent, false);
    ARTSet67[ARTTS_C_HASH] = true;
  }

  public void ARTSet107initialise() {
    ARTSet107 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet107, 0, artSetExtent, false);
    ARTSet107[ARTTS__STAR_STAR] = true;
  }

  public void ARTSet61initialise() {
    ARTSet61 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet61, 0, artSetExtent, false);
    ARTSet61[ARTTS_Ab] = true;
  }

  public void ARTSet62initialise() {
    ARTSet62 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet62, 0, artSetExtent, false);
    ARTSet62[ARTTS_A] = true;
  }

  public void ARTSet65initialise() {
    ARTSet65 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet65, 0, artSetExtent, false);
    ARTSet65[ARTTS_B] = true;
  }

  public void ARTSet35initialise() {
    ARTSet35 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet35, 0, artSetExtent, false);
    ARTSet35[ARTTS_A] = true;
    ARTSet35[ARTTS_A_HASH] = true;
    ARTSet35[ARTTS_Ab] = true;
    ARTSet35[ARTTS_B] = true;
    ARTSet35[ARTTS_Bb] = true;
    ARTSet35[ARTTS_C] = true;
    ARTSet35[ARTTS_C_HASH] = true;
    ARTSet35[ARTTS_D] = true;
    ARTSet35[ARTTS_D_HASH] = true;
    ARTSet35[ARTTS_Db] = true;
    ARTSet35[ARTTS_E] = true;
    ARTSet35[ARTTS_Eb] = true;
    ARTSet35[ARTTS_F] = true;
    ARTSet35[ARTTS_F_HASH] = true;
    ARTSet35[ARTTS_G] = true;
    ARTSet35[ARTTS_G_HASH] = true;
    ARTSet35[ARTTS_Gb] = true;
    ARTSet35[ARTL_ART_note] = true;
    ARTSet35[ARTL_ART_simpleNote] = true;
    ARTSet35[ARTL_ART_simpleNoteLexeme] = true;
  }

  public void ARTSet66initialise() {
    ARTSet66 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet66, 0, artSetExtent, false);
    ARTSet66[ARTTS_C] = true;
  }

  public void ARTSet79initialise() {
    ARTSet79 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet79, 0, artSetExtent, false);
    ARTSet79[ARTTS__COLON_EQUAL] = true;
  }

  public void ARTSet69initialise() {
    ARTSet69 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet69, 0, artSetExtent, false);
    ARTSet69[ARTTS_D] = true;
  }

  public void ARTSet72initialise() {
    ARTSet72 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet72, 0, artSetExtent, false);
    ARTSet72[ARTTS_E] = true;
  }

  public void ARTSet73initialise() {
    ARTSet73 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet73, 0, artSetExtent, false);
    ARTSet73[ARTTS_F] = true;
  }

  public void ARTSet103initialise() {
    ARTSet103 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet103, 0, artSetExtent, false);
    ARTSet103[ARTTB_ID] = true;
    ARTSet103[ARTTB_INTEGER] = true;
    ARTSet103[ARTTS__LPAR] = true;
    ARTSet103[ARTL_ART_ID] = true;
    ARTSet103[ARTL_ART_INTEGER] = true;
    ARTSet103[ARTL_ART_operand] = true;
  }

  public void ARTSet76initialise() {
    ARTSet76 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet76, 0, artSetExtent, false);
    ARTSet76[ARTTS_G] = true;
  }

  public void ARTSet23initialise() {
    ARTSet23 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet23, 0, artSetExtent, false);
    ARTSet23[ARTTS_M] = true;
  }

  public void ARTSet43initialise() {
    ARTSet43 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet43, 0, artSetExtent, false);
    ARTSet43[ARTTB_ID] = true;
    ARTSet43[ARTTS__SHREIK_EQUAL] = true;
    ARTSet43[ARTTS__PERIOD] = true;
    ARTSet43[ARTTS__PERIOD_PERIOD] = true;
    ARTSet43[ARTTS__PERIOD_PERIOD_PERIOD] = true;
    ARTSet43[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = true;
    ARTSet43[ARTTS__LT] = true;
    ARTSet43[ARTTS__LT_EQUAL] = true;
    ARTSet43[ARTTS__EQUAL_EQUAL] = true;
    ARTSet43[ARTTS__GT] = true;
    ARTSet43[ARTTS__GT_EQUAL] = true;
    ARTSet43[ARTTS_A] = true;
    ARTSet43[ARTTS_A_HASH] = true;
    ARTSet43[ARTTS_Ab] = true;
    ARTSet43[ARTTS_B] = true;
    ARTSet43[ARTTS_Bb] = true;
    ARTSet43[ARTTS_C] = true;
    ARTSet43[ARTTS_C_HASH] = true;
    ARTSet43[ARTTS_D] = true;
    ARTSet43[ARTTS_D_HASH] = true;
    ARTSet43[ARTTS_Db] = true;
    ARTSet43[ARTTS_E] = true;
    ARTSet43[ARTTS_Eb] = true;
    ARTSet43[ARTTS_F] = true;
    ARTSet43[ARTTS_F_HASH] = true;
    ARTSet43[ARTTS_G] = true;
    ARTSet43[ARTTS_G_HASH] = true;
    ARTSet43[ARTTS_Gb] = true;
    ARTSet43[ARTTS__LBRACK] = true;
    ARTSet43[ARTTS_arpeggio] = true;
    ARTSet43[ARTTS_backingtrack] = true;
    ARTSet43[ARTTS_beatRatio] = true;
    ARTSet43[ARTTS_bpm] = true;
    ARTSet43[ARTTS_if] = true;
    ARTSet43[ARTTS_instrument] = true;
    ARTSet43[ARTTS_melody] = true;
    ARTSet43[ARTTS_mix] = true;
    ARTSet43[ARTTS_octave] = true;
    ARTSet43[ARTTS_play] = true;
    ARTSet43[ARTTS_print] = true;
    ARTSet43[ARTTS_repeatNote] = true;
    ARTSet43[ARTTS_scale] = true;
    ARTSet43[ARTTS_volume] = true;
    ARTSet43[ARTTS_while] = true;
    ARTSet43[ARTTS__LBRACE] = true;
    ARTSet43[ARTL_ART_ID] = true;
    ARTSet43[ARTL_ART_beatRatio] = true;
    ARTSet43[ARTL_ART_bpm] = true;
    ARTSet43[ARTL_ART_chord] = true;
    ARTSet43[ARTL_ART_instrument] = true;
    ARTSet43[ARTL_ART_note] = true;
    ARTSet43[ARTL_ART_octave] = true;
    ARTSet43[ARTL_ART_rest] = true;
    ARTSet43[ARTL_ART_simpleNote] = true;
    ARTSet43[ARTL_ART_simpleNoteLexeme] = true;
    ARTSet43[ARTL_ART_statement] = true;
    ARTSet43[ARTL_ART_volume] = true;
  }

  public void ARTSet16initialise() {
    ARTSet16 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet16, 0, artSetExtent, false);
    ARTSet16[ARTTS__LBRACK] = true;
  }

  public void ARTSet18initialise() {
    ARTSet18 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet18, 0, artSetExtent, false);
    ARTSet18[ARTTS__RBRACK] = true;
  }

  public void ARTSet90initialise() {
    ARTSet90 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet90, 0, artSetExtent, false);
    ARTSet90[ARTTS_mix] = true;
  }

  public void ARTSet50initialise() {
    ARTSet50 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet50, 0, artSetExtent, false);
    ARTSet50[ARTTS__PERIOD] = true;
    ARTSet50[ARTTS__PERIOD_PERIOD] = true;
    ARTSet50[ARTTS__PERIOD_PERIOD_PERIOD] = true;
    ARTSet50[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = true;
  }

  public void ARTSet70initialise() {
    ARTSet70 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet70, 0, artSetExtent, false);
    ARTSet70[ARTTS_D_HASH] = true;
  }

  public void ARTSet64initialise() {
    ARTSet64 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet64, 0, artSetExtent, false);
    ARTSet64[ARTTS_Bb] = true;
  }

  public void ARTSet5initialise() {
    ARTSet5 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet5, 0, artSetExtent, false);
    ARTSet5[ARTTB_INTEGER] = true;
  }

  public void ARTSet38initialise() {
    ARTSet38 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet38, 0, artSetExtent, false);
    ARTSet38[ARTTB_ID] = true;
    ARTSet38[ARTTS__SHREIK_EQUAL] = true;
    ARTSet38[ARTTS__PERCENT] = true;
    ARTSet38[ARTTS__RPAR] = true;
    ARTSet38[ARTTS__STAR] = true;
    ARTSet38[ARTTS__STAR_STAR] = true;
    ARTSet38[ARTTS__PLUS] = true;
    ARTSet38[ARTTS__COMMA] = true;
    ARTSet38[ARTTS__MINUS] = true;
    ARTSet38[ARTTS__PERIOD] = true;
    ARTSet38[ARTTS__PERIOD_PERIOD] = true;
    ARTSet38[ARTTS__PERIOD_PERIOD_PERIOD] = true;
    ARTSet38[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = true;
    ARTSet38[ARTTS__SLASH] = true;
    ARTSet38[ARTTS__SEMICOLON] = true;
    ARTSet38[ARTTS__LT] = true;
    ARTSet38[ARTTS__LT_EQUAL] = true;
    ARTSet38[ARTTS__EQUAL_EQUAL] = true;
    ARTSet38[ARTTS__GT] = true;
    ARTSet38[ARTTS__GT_EQUAL] = true;
    ARTSet38[ARTTS_A] = true;
    ARTSet38[ARTTS_A_HASH] = true;
    ARTSet38[ARTTS_Ab] = true;
    ARTSet38[ARTTS_B] = true;
    ARTSet38[ARTTS_Bb] = true;
    ARTSet38[ARTTS_C] = true;
    ARTSet38[ARTTS_C_HASH] = true;
    ARTSet38[ARTTS_D] = true;
    ARTSet38[ARTTS_D_HASH] = true;
    ARTSet38[ARTTS_Db] = true;
    ARTSet38[ARTTS_E] = true;
    ARTSet38[ARTTS_Eb] = true;
    ARTSet38[ARTTS_F] = true;
    ARTSet38[ARTTS_F_HASH] = true;
    ARTSet38[ARTTS_G] = true;
    ARTSet38[ARTTS_G_HASH] = true;
    ARTSet38[ARTTS_Gb] = true;
    ARTSet38[ARTTS__LBRACK] = true;
    ARTSet38[ARTTS_arpeggio] = true;
    ARTSet38[ARTTS_backingtrack] = true;
    ARTSet38[ARTTS_beatRatio] = true;
    ARTSet38[ARTTS_bpm] = true;
    ARTSet38[ARTTS_if] = true;
    ARTSet38[ARTTS_instrument] = true;
    ARTSet38[ARTTS_melody] = true;
    ARTSet38[ARTTS_mix] = true;
    ARTSet38[ARTTS_octave] = true;
    ARTSet38[ARTTS_play] = true;
    ARTSet38[ARTTS_print] = true;
    ARTSet38[ARTTS_repeatNote] = true;
    ARTSet38[ARTTS_scale] = true;
    ARTSet38[ARTTS_volume] = true;
    ARTSet38[ARTTS_while] = true;
    ARTSet38[ARTTS__LBRACE] = true;
    ARTSet38[ARTL_ART_ID] = true;
    ARTSet38[ARTL_ART_beatRatio] = true;
    ARTSet38[ARTL_ART_bpm] = true;
    ARTSet38[ARTL_ART_chord] = true;
    ARTSet38[ARTL_ART_instrument] = true;
    ARTSet38[ARTL_ART_note] = true;
    ARTSet38[ARTL_ART_octave] = true;
    ARTSet38[ARTL_ART_rest] = true;
    ARTSet38[ARTL_ART_simpleNote] = true;
    ARTSet38[ARTL_ART_simpleNoteLexeme] = true;
    ARTSet38[ARTL_ART_statement] = true;
    ARTSet38[ARTL_ART_volume] = true;
  }

  public void ARTSet93initialise() {
    ARTSet93 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet93, 0, artSetExtent, false);
    ARTSet93[ARTTS_arpeggio] = true;
  }

  public void ARTSet15initialise() {
    ARTSet15 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet15, 0, artSetExtent, false);
    ARTSet15[ARTTB_ID] = true;
    ARTSet15[ARTTB_INTEGER] = true;
    ARTSet15[ARTTS__LPAR] = true;
    ARTSet15[ARTTS__MINUS] = true;
    ARTSet15[ARTL_ART_ID] = true;
    ARTSet15[ARTL_ART_INTEGER] = true;
    ARTSet15[ARTL_ART_operand] = true;
    ARTSet15[ARTL_ART_subExpr] = true;
  }

  public void ARTSet59initialise() {
    ARTSet59 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet59, 0, artSetExtent, false);
    ARTSet59[ARTX_EOS] = true;
    ARTSet59[ARTTB_ID] = true;
    ARTSet59[ARTTB_INTEGER] = true;
    ARTSet59[ARTTS__PLUS] = true;
    ARTSet59[ARTTS__MINUS] = true;
    ARTSet59[ARTTS__PERIOD] = true;
    ARTSet59[ARTTS__PERIOD_PERIOD] = true;
    ARTSet59[ARTTS__PERIOD_PERIOD_PERIOD] = true;
    ARTSet59[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = true;
    ARTSet59[ARTTS_A] = true;
    ARTSet59[ARTTS_A_HASH] = true;
    ARTSet59[ARTTS_Ab] = true;
    ARTSet59[ARTTS_B] = true;
    ARTSet59[ARTTS_Bb] = true;
    ARTSet59[ARTTS_C] = true;
    ARTSet59[ARTTS_C_HASH] = true;
    ARTSet59[ARTTS_D] = true;
    ARTSet59[ARTTS_D_HASH] = true;
    ARTSet59[ARTTS_Db] = true;
    ARTSet59[ARTTS_E] = true;
    ARTSet59[ARTTS_Eb] = true;
    ARTSet59[ARTTS_F] = true;
    ARTSet59[ARTTS_F_HASH] = true;
    ARTSet59[ARTTS_G] = true;
    ARTSet59[ARTTS_G_HASH] = true;
    ARTSet59[ARTTS_Gb] = true;
    ARTSet59[ARTTS_M] = true;
    ARTSet59[ARTTS_M7] = true;
    ARTSet59[ARTTS__LBRACK] = true;
    ARTSet59[ARTTS__RBRACK] = true;
    ARTSet59[ARTTS_arpeggio] = true;
    ARTSet59[ARTTS_backingtrack] = true;
    ARTSet59[ARTTS_beatRatio] = true;
    ARTSet59[ARTTS_bpm] = true;
    ARTSet59[ARTTS_else] = true;
    ARTSet59[ARTTS_if] = true;
    ARTSet59[ARTTS_instrument] = true;
    ARTSet59[ARTTS_m] = true;
    ARTSet59[ARTTS_m7] = true;
    ARTSet59[ARTTS_melody] = true;
    ARTSet59[ARTTS_mix] = true;
    ARTSet59[ARTTS_octave] = true;
    ARTSet59[ARTTS_play] = true;
    ARTSet59[ARTTS_print] = true;
    ARTSet59[ARTTS_repeatNote] = true;
    ARTSet59[ARTTS_scale] = true;
    ARTSet59[ARTTS_volume] = true;
    ARTSet59[ARTTS_while] = true;
    ARTSet59[ARTTS__LBRACE] = true;
    ARTSet59[ARTTS__RBRACE] = true;
    ARTSet59[ARTL_ART_ID] = true;
    ARTSet59[ARTL_ART_INTEGER] = true;
    ARTSet59[ARTL_ART_beatRatio] = true;
    ARTSet59[ARTL_ART_bpm] = true;
    ARTSet59[ARTL_ART_chord] = true;
    ARTSet59[ARTL_ART_chordMode] = true;
    ARTSet59[ARTL_ART_instrument] = true;
    ARTSet59[ARTL_ART_note] = true;
    ARTSet59[ARTL_ART_notes] = true;
    ARTSet59[ARTL_ART_octave] = true;
    ARTSet59[ARTL_ART_rest] = true;
    ARTSet59[ARTL_ART_shifters] = true;
    ARTSet59[ARTL_ART_simpleNote] = true;
    ARTSet59[ARTL_ART_simpleNoteLexeme] = true;
    ARTSet59[ARTL_ART_statement] = true;
    ARTSet59[ARTL_ART_statements] = true;
    ARTSet59[ARTL_ART_volume] = true;
  }

  public void ARTSet101initialise() {
    ARTSet101 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet101, 0, artSetExtent, false);
    ARTSet101[ARTTS_beatRatio] = true;
    ARTSet101[ARTL_ART_beatRatio] = true;
  }

  public void ARTSet22initialise() {
    ARTSet22 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet22, 0, artSetExtent, false);
    ARTSet22[ARTTS_m7] = true;
  }

  public void ARTSet21initialise() {
    ARTSet21 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet21, 0, artSetExtent, false);
    ARTSet21[ARTTS_m] = true;
  }

  public void ARTSet54initialise() {
    ARTSet54 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet54, 0, artSetExtent, false);
    ARTSet54[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = true;
  }

  public void ARTSet53initialise() {
    ARTSet53 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet53, 0, artSetExtent, false);
    ARTSet53[ARTTS__PERIOD_PERIOD_PERIOD] = true;
  }

  public void ARTSet31initialise() {
    ARTSet31 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet31, 0, artSetExtent, false);
    ARTSet31[ARTX_EOS] = true;
    ARTSet31[ARTTB_ID] = true;
    ARTSet31[ARTTS__PERIOD] = true;
    ARTSet31[ARTTS__PERIOD_PERIOD] = true;
    ARTSet31[ARTTS__PERIOD_PERIOD_PERIOD] = true;
    ARTSet31[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = true;
    ARTSet31[ARTTS_A] = true;
    ARTSet31[ARTTS_A_HASH] = true;
    ARTSet31[ARTTS_Ab] = true;
    ARTSet31[ARTTS_B] = true;
    ARTSet31[ARTTS_Bb] = true;
    ARTSet31[ARTTS_C] = true;
    ARTSet31[ARTTS_C_HASH] = true;
    ARTSet31[ARTTS_D] = true;
    ARTSet31[ARTTS_D_HASH] = true;
    ARTSet31[ARTTS_Db] = true;
    ARTSet31[ARTTS_E] = true;
    ARTSet31[ARTTS_Eb] = true;
    ARTSet31[ARTTS_F] = true;
    ARTSet31[ARTTS_F_HASH] = true;
    ARTSet31[ARTTS_G] = true;
    ARTSet31[ARTTS_G_HASH] = true;
    ARTSet31[ARTTS_Gb] = true;
    ARTSet31[ARTTS_M] = true;
    ARTSet31[ARTTS_M7] = true;
    ARTSet31[ARTTS__LBRACK] = true;
    ARTSet31[ARTTS__RBRACK] = true;
    ARTSet31[ARTTS_arpeggio] = true;
    ARTSet31[ARTTS_backingtrack] = true;
    ARTSet31[ARTTS_beatRatio] = true;
    ARTSet31[ARTTS_bpm] = true;
    ARTSet31[ARTTS_else] = true;
    ARTSet31[ARTTS_if] = true;
    ARTSet31[ARTTS_instrument] = true;
    ARTSet31[ARTTS_m] = true;
    ARTSet31[ARTTS_m7] = true;
    ARTSet31[ARTTS_melody] = true;
    ARTSet31[ARTTS_mix] = true;
    ARTSet31[ARTTS_octave] = true;
    ARTSet31[ARTTS_play] = true;
    ARTSet31[ARTTS_print] = true;
    ARTSet31[ARTTS_repeatNote] = true;
    ARTSet31[ARTTS_scale] = true;
    ARTSet31[ARTTS_volume] = true;
    ARTSet31[ARTTS_while] = true;
    ARTSet31[ARTTS__LBRACE] = true;
    ARTSet31[ARTTS__RBRACE] = true;
    ARTSet31[ARTL_ART_ID] = true;
    ARTSet31[ARTL_ART_beatRatio] = true;
    ARTSet31[ARTL_ART_bpm] = true;
    ARTSet31[ARTL_ART_chord] = true;
    ARTSet31[ARTL_ART_chordMode] = true;
    ARTSet31[ARTL_ART_instrument] = true;
    ARTSet31[ARTL_ART_note] = true;
    ARTSet31[ARTL_ART_notes] = true;
    ARTSet31[ARTL_ART_octave] = true;
    ARTSet31[ARTL_ART_rest] = true;
    ARTSet31[ARTL_ART_simpleNote] = true;
    ARTSet31[ARTL_ART_simpleNoteLexeme] = true;
    ARTSet31[ARTL_ART_statement] = true;
    ARTSet31[ARTL_ART_statements] = true;
    ARTSet31[ARTL_ART_volume] = true;
  }

  public void ARTSet85initialise() {
    ARTSet85 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet85, 0, artSetExtent, false);
    ARTSet85[ARTTS__LBRACE] = true;
  }

  public void ARTSet86initialise() {
    ARTSet86 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet86, 0, artSetExtent, false);
    ARTSet86[ARTTS__RBRACE] = true;
  }

  public void ARTSet7initialise() {
    ARTSet7 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet7, 0, artSetExtent, false);
    ARTSet7[ARTTB_REAL] = true;
  }

  public void ARTSet10initialise() {
    ARTSet10 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet10, 0, artSetExtent, false);
    ARTSet10[ARTTS__RPAR] = true;
    ARTSet10[ARTTS__COMMA] = true;
    ARTSet10[ARTTS__SEMICOLON] = true;
    ARTSet10[ARTTS__RBRACE] = true;
  }

  public void ARTSet49initialise() {
    ARTSet49 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet49, 0, artSetExtent, false);
    ARTSet49[ARTTS__LT_EQUAL] = true;
  }

  public void artSetInitialise() {
    ARTSet1initialise();
    ARTSet58initialise();
    ARTSet24initialise();
    ARTSet60initialise();
    ARTSet41initialise();
    ARTSet83initialise();
    ARTSet74initialise();
    ARTSet68initialise();
    ARTSet47initialise();
    ARTSet95initialise();
    ARTSet42initialise();
    ARTSet77initialise();
    ARTSet100initialise();
    ARTSet71initialise();
    ARTSet48initialise();
    ARTSet52initialise();
    ARTSet102initialise();
    ARTSet108initialise();
    ARTSet36initialise();
    ARTSet91initialise();
    ARTSet39initialise();
    ARTSet92initialise();
    ARTSet78initialise();
    ARTSet29initialise();
    ARTSet96initialise();
    ARTSet25initialise();
    ARTSet55initialise();
    ARTSet19initialise();
    ARTSet2initialise();
    ARTSet14initialise();
    ARTSet81initialise();
    ARTSet89initialise();
    ARTSet30initialise();
    ARTSet12initialise();
    ARTSet9initialise();
    ARTSet13initialise();
    ARTSet6initialise();
    ARTSet94initialise();
    ARTSet75initialise();
    ARTSet97initialise();
    ARTSet20initialise();
    ARTSet63initialise();
    ARTSet88initialise();
    ARTSet34initialise();
    ARTSet40initialise();
    ARTSet11initialise();
    ARTSet80initialise();
    ARTSet82initialise();
    ARTSet33initialise();
    ARTSet106initialise();
    ARTSet26initialise();
    ARTSet28initialise();
    ARTSet104initialise();
    ARTSet56initialise();
    ARTSet17initialise();
    ARTSet27initialise();
    ARTSet99initialise();
    ARTSet57initialise();
    ARTSet51initialise();
    ARTSet105initialise();
    ARTSet98initialise();
    ARTSet84initialise();
    ARTSet3initialise();
    ARTSet32initialise();
    ARTSet87initialise();
    ARTSet37initialise();
    ARTSet8initialise();
    ARTSet45initialise();
    ARTSet46initialise();
    ARTSet4initialise();
    ARTSet44initialise();
    ARTSet67initialise();
    ARTSet107initialise();
    ARTSet61initialise();
    ARTSet62initialise();
    ARTSet65initialise();
    ARTSet35initialise();
    ARTSet66initialise();
    ARTSet79initialise();
    ARTSet69initialise();
    ARTSet72initialise();
    ARTSet73initialise();
    ARTSet103initialise();
    ARTSet76initialise();
    ARTSet23initialise();
    ARTSet43initialise();
    ARTSet16initialise();
    ARTSet18initialise();
    ARTSet90initialise();
    ARTSet50initialise();
    ARTSet70initialise();
    ARTSet64initialise();
    ARTSet5initialise();
    ARTSet38initialise();
    ARTSet93initialise();
    ARTSet15initialise();
    ARTSet59initialise();
    ARTSet101initialise();
    ARTSet22initialise();
    ARTSet21initialise();
    ARTSet54initialise();
    ARTSet53initialise();
    ARTSet31initialise();
    ARTSet85initialise();
    ARTSet86initialise();
    ARTSet7initialise();
    ARTSet10initialise();
    ARTSet49initialise();
  }

  public void artTableInitialiser_ART_ID() {
    artLabelInternalStrings[ARTL_ART_ID] = "ID";
    artLabelStrings[ARTL_ART_ID] = "ID";
    artKindOfs[ARTL_ART_ID] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ID_722] = "ID ::= . &ID  ";
    artLabelStrings[ARTL_ART_ID_722] = "";
    artlhsL[ARTL_ART_ID_722] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_ID_722] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_ID_722] = true;
    artLabelInternalStrings[ARTL_ART_ID_723] = "ID ::= &ID  ";
    artLabelStrings[ARTL_ART_ID_723] = "";
    artlhsL[ARTL_ART_ID_723] = ARTL_ART_ID;
    artPopD[ARTL_ART_ID_723] = true;
    artLabelInternalStrings[ARTL_ART_ID_724] = "ID ::= &ID  .";
    artLabelStrings[ARTL_ART_ID_724] = "";
    artlhsL[ARTL_ART_ID_724] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_ID_724] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ID_724] = true;
    arteoR_pL[ARTL_ART_ID_724] = true;
    artPopD[ARTL_ART_ID_724] = true;
  }

  public void artTableInitialiser_ART_INTEGER() {
    artLabelInternalStrings[ARTL_ART_INTEGER] = "INTEGER";
    artLabelStrings[ARTL_ART_INTEGER] = "INTEGER";
    artKindOfs[ARTL_ART_INTEGER] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_INTEGER_728] = "INTEGER ::= . &INTEGER  ";
    artLabelStrings[ARTL_ART_INTEGER_728] = "";
    artlhsL[ARTL_ART_INTEGER_728] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_INTEGER_728] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_INTEGER_728] = true;
    artLabelInternalStrings[ARTL_ART_INTEGER_729] = "INTEGER ::= &INTEGER  ";
    artLabelStrings[ARTL_ART_INTEGER_729] = "";
    artlhsL[ARTL_ART_INTEGER_729] = ARTL_ART_INTEGER;
    artPopD[ARTL_ART_INTEGER_729] = true;
    artLabelInternalStrings[ARTL_ART_INTEGER_730] = "INTEGER ::= &INTEGER  .";
    artLabelStrings[ARTL_ART_INTEGER_730] = "";
    artlhsL[ARTL_ART_INTEGER_730] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_INTEGER_730] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_INTEGER_730] = true;
    arteoR_pL[ARTL_ART_INTEGER_730] = true;
    artPopD[ARTL_ART_INTEGER_730] = true;
  }

  public void artTableInitialiser_ART_REAL() {
    artLabelInternalStrings[ARTL_ART_REAL] = "REAL";
    artLabelStrings[ARTL_ART_REAL] = "REAL";
    artKindOfs[ARTL_ART_REAL] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_REAL_734] = "REAL ::= . &REAL  ";
    artLabelStrings[ARTL_ART_REAL_734] = "";
    artlhsL[ARTL_ART_REAL_734] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_REAL_734] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_REAL_734] = true;
    artLabelInternalStrings[ARTL_ART_REAL_735] = "REAL ::= &REAL  ";
    artLabelStrings[ARTL_ART_REAL_735] = "";
    artlhsL[ARTL_ART_REAL_735] = ARTL_ART_REAL;
    artPopD[ARTL_ART_REAL_735] = true;
    artLabelInternalStrings[ARTL_ART_REAL_736] = "REAL ::= &REAL  .";
    artLabelStrings[ARTL_ART_REAL_736] = "";
    artlhsL[ARTL_ART_REAL_736] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_REAL_736] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_REAL_736] = true;
    arteoR_pL[ARTL_ART_REAL_736] = true;
    artPopD[ARTL_ART_REAL_736] = true;
  }

  public void artTableInitialiser_ART_STRING_DQ() {
    artLabelInternalStrings[ARTL_ART_STRING_DQ] = "STRING_DQ";
    artLabelStrings[ARTL_ART_STRING_DQ] = "STRING_DQ";
    artKindOfs[ARTL_ART_STRING_DQ] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_STRING_DQ_740] = "STRING_DQ ::= . &STRING_DQ  ";
    artLabelStrings[ARTL_ART_STRING_DQ_740] = "";
    artlhsL[ARTL_ART_STRING_DQ_740] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_STRING_DQ_740] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_STRING_DQ_740] = true;
    artLabelInternalStrings[ARTL_ART_STRING_DQ_741] = "STRING_DQ ::= &STRING_DQ  ";
    artLabelStrings[ARTL_ART_STRING_DQ_741] = "";
    artlhsL[ARTL_ART_STRING_DQ_741] = ARTL_ART_STRING_DQ;
    artPopD[ARTL_ART_STRING_DQ_741] = true;
    artLabelInternalStrings[ARTL_ART_STRING_DQ_742] = "STRING_DQ ::= &STRING_DQ  .";
    artLabelStrings[ARTL_ART_STRING_DQ_742] = "";
    artlhsL[ARTL_ART_STRING_DQ_742] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_STRING_DQ_742] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_STRING_DQ_742] = true;
    arteoR_pL[ARTL_ART_STRING_DQ_742] = true;
    artPopD[ARTL_ART_STRING_DQ_742] = true;
  }

  public void artTableInitialiser_ART_beatRatio() {
    artLabelInternalStrings[ARTL_ART_beatRatio] = "beatRatio";
    artLabelStrings[ARTL_ART_beatRatio] = "beatRatio";
    artKindOfs[ARTL_ART_beatRatio] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_beatRatio_450] = "beatRatio ::= . 'beatRatio'  REAL ';'  ";
    artLabelStrings[ARTL_ART_beatRatio_450] = "";
    artlhsL[ARTL_ART_beatRatio_450] = ARTL_ART_beatRatio;
    artKindOfs[ARTL_ART_beatRatio_450] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_beatRatio_451] = "beatRatio ::= 'beatRatio'  REAL ';'  ";
    artLabelStrings[ARTL_ART_beatRatio_451] = "";
    artlhsL[ARTL_ART_beatRatio_451] = ARTL_ART_beatRatio;
    artLabelInternalStrings[ARTL_ART_beatRatio_452] = "beatRatio ::= 'beatRatio'  . REAL ';'  ";
    artLabelStrings[ARTL_ART_beatRatio_452] = "";
    artlhsL[ARTL_ART_beatRatio_452] = ARTL_ART_beatRatio;
    artKindOfs[ARTL_ART_beatRatio_452] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_beatRatio_452] = true;
    artLabelInternalStrings[ARTL_ART_beatRatio_454] = "beatRatio ::= 'beatRatio'  REAL . ';'  ";
    artLabelStrings[ARTL_ART_beatRatio_454] = "";
    artlhsL[ARTL_ART_beatRatio_454] = ARTL_ART_beatRatio;
    artSlotInstanceOfs[ARTL_ART_beatRatio_454] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_beatRatio_454] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_beatRatio_454] = true;
    artLabelInternalStrings[ARTL_ART_beatRatio_455] = "beatRatio ::= 'beatRatio'  REAL ';'  ";
    artLabelStrings[ARTL_ART_beatRatio_455] = "";
    artlhsL[ARTL_ART_beatRatio_455] = ARTL_ART_beatRatio;
    artPopD[ARTL_ART_beatRatio_455] = true;
    artLabelInternalStrings[ARTL_ART_beatRatio_456] = "beatRatio ::= 'beatRatio'  REAL ';'  .";
    artLabelStrings[ARTL_ART_beatRatio_456] = "";
    artlhsL[ARTL_ART_beatRatio_456] = ARTL_ART_beatRatio;
    artKindOfs[ARTL_ART_beatRatio_456] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_beatRatio_456] = true;
    arteoR_pL[ARTL_ART_beatRatio_456] = true;
    artPopD[ARTL_ART_beatRatio_456] = true;
  }

  public void artTableInitialiser_ART_bpm() {
    artLabelInternalStrings[ARTL_ART_bpm] = "bpm";
    artLabelStrings[ARTL_ART_bpm] = "bpm";
    artKindOfs[ARTL_ART_bpm] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_bpm_364] = "bpm ::= . 'bpm'  subExpr ';'  ";
    artLabelStrings[ARTL_ART_bpm_364] = "";
    artlhsL[ARTL_ART_bpm_364] = ARTL_ART_bpm;
    artKindOfs[ARTL_ART_bpm_364] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_bpm_365] = "bpm ::= 'bpm'  subExpr ';'  ";
    artLabelStrings[ARTL_ART_bpm_365] = "";
    artlhsL[ARTL_ART_bpm_365] = ARTL_ART_bpm;
    artLabelInternalStrings[ARTL_ART_bpm_366] = "bpm ::= 'bpm'  . subExpr ';'  ";
    artLabelStrings[ARTL_ART_bpm_366] = "";
    artlhsL[ARTL_ART_bpm_366] = ARTL_ART_bpm;
    artKindOfs[ARTL_ART_bpm_366] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_bpm_366] = true;
    artLabelInternalStrings[ARTL_ART_bpm_368] = "bpm ::= 'bpm'  subExpr . ';'  ";
    artLabelStrings[ARTL_ART_bpm_368] = "";
    artlhsL[ARTL_ART_bpm_368] = ARTL_ART_bpm;
    artSlotInstanceOfs[ARTL_ART_bpm_368] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_bpm_368] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_bpm_368] = true;
    artLabelInternalStrings[ARTL_ART_bpm_369] = "bpm ::= 'bpm'  subExpr ';'  ";
    artLabelStrings[ARTL_ART_bpm_369] = "";
    artlhsL[ARTL_ART_bpm_369] = ARTL_ART_bpm;
    artPopD[ARTL_ART_bpm_369] = true;
    artLabelInternalStrings[ARTL_ART_bpm_370] = "bpm ::= 'bpm'  subExpr ';'  .";
    artLabelStrings[ARTL_ART_bpm_370] = "";
    artlhsL[ARTL_ART_bpm_370] = ARTL_ART_bpm;
    artKindOfs[ARTL_ART_bpm_370] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_bpm_370] = true;
    arteoR_pL[ARTL_ART_bpm_370] = true;
    artPopD[ARTL_ART_bpm_370] = true;
  }

  public void artTableInitialiser_ART_chord() {
    artLabelInternalStrings[ARTL_ART_chord] = "chord";
    artLabelStrings[ARTL_ART_chord] = "chord";
    artKindOfs[ARTL_ART_chord] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_chord_620] = "chord ::= . '['  notes ']'  ";
    artLabelStrings[ARTL_ART_chord_620] = "";
    artlhsL[ARTL_ART_chord_620] = ARTL_ART_chord;
    artKindOfs[ARTL_ART_chord_620] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_chord_621] = "chord ::= '['  notes ']'  ";
    artLabelStrings[ARTL_ART_chord_621] = "";
    artlhsL[ARTL_ART_chord_621] = ARTL_ART_chord;
    artLabelInternalStrings[ARTL_ART_chord_622] = "chord ::= '['  . notes ']'  ";
    artLabelStrings[ARTL_ART_chord_622] = "";
    artlhsL[ARTL_ART_chord_622] = ARTL_ART_chord;
    artKindOfs[ARTL_ART_chord_622] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_chord_622] = true;
    artLabelInternalStrings[ARTL_ART_chord_624] = "chord ::= '['  notes . ']'  ";
    artLabelStrings[ARTL_ART_chord_624] = "";
    artlhsL[ARTL_ART_chord_624] = ARTL_ART_chord;
    artSlotInstanceOfs[ARTL_ART_chord_624] = ARTL_ART_notes;
    artKindOfs[ARTL_ART_chord_624] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_chord_624] = true;
    artLabelInternalStrings[ARTL_ART_chord_625] = "chord ::= '['  notes ']'  ";
    artLabelStrings[ARTL_ART_chord_625] = "";
    artlhsL[ARTL_ART_chord_625] = ARTL_ART_chord;
    artPopD[ARTL_ART_chord_625] = true;
    artLabelInternalStrings[ARTL_ART_chord_626] = "chord ::= '['  notes ']'  .";
    artLabelStrings[ARTL_ART_chord_626] = "";
    artlhsL[ARTL_ART_chord_626] = ARTL_ART_chord;
    artKindOfs[ARTL_ART_chord_626] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_chord_626] = true;
    arteoR_pL[ARTL_ART_chord_626] = true;
    artPopD[ARTL_ART_chord_626] = true;
  }

  public void artTableInitialiser_ART_chordMode() {
    artLabelInternalStrings[ARTL_ART_chordMode] = "chordMode";
    artLabelStrings[ARTL_ART_chordMode] = "chordMode";
    artKindOfs[ARTL_ART_chordMode] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_chordMode_488] = "chordMode ::= . # ";
    artLabelStrings[ARTL_ART_chordMode_488] = "";
    artlhsL[ARTL_ART_chordMode_488] = ARTL_ART_chordMode;
    artKindOfs[ARTL_ART_chordMode_488] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_chordMode_488] = true;
    artLabelInternalStrings[ARTL_ART_chordMode_490] = "chordMode ::= # .";
    artLabelStrings[ARTL_ART_chordMode_490] = "";
    artlhsL[ARTL_ART_chordMode_490] = ARTL_ART_chordMode;
    artKindOfs[ARTL_ART_chordMode_490] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_chordMode_490] = true;
    arteoR_pL[ARTL_ART_chordMode_490] = true;
    artPopD[ARTL_ART_chordMode_490] = true;
    artLabelInternalStrings[ARTL_ART_chordMode_494] = "chordMode ::= . 'm'  ";
    artLabelStrings[ARTL_ART_chordMode_494] = "";
    artlhsL[ARTL_ART_chordMode_494] = ARTL_ART_chordMode;
    artKindOfs[ARTL_ART_chordMode_494] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_chordMode_494] = true;
    artLabelInternalStrings[ARTL_ART_chordMode_495] = "chordMode ::= 'm'  ";
    artLabelStrings[ARTL_ART_chordMode_495] = "";
    artlhsL[ARTL_ART_chordMode_495] = ARTL_ART_chordMode;
    artPopD[ARTL_ART_chordMode_495] = true;
    artLabelInternalStrings[ARTL_ART_chordMode_496] = "chordMode ::= 'm'  .";
    artLabelStrings[ARTL_ART_chordMode_496] = "";
    artlhsL[ARTL_ART_chordMode_496] = ARTL_ART_chordMode;
    artKindOfs[ARTL_ART_chordMode_496] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_chordMode_496] = true;
    arteoR_pL[ARTL_ART_chordMode_496] = true;
    artPopD[ARTL_ART_chordMode_496] = true;
    artLabelInternalStrings[ARTL_ART_chordMode_500] = "chordMode ::= . 'm7'  ";
    artLabelStrings[ARTL_ART_chordMode_500] = "";
    artlhsL[ARTL_ART_chordMode_500] = ARTL_ART_chordMode;
    artKindOfs[ARTL_ART_chordMode_500] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_chordMode_500] = true;
    artLabelInternalStrings[ARTL_ART_chordMode_501] = "chordMode ::= 'm7'  ";
    artLabelStrings[ARTL_ART_chordMode_501] = "";
    artlhsL[ARTL_ART_chordMode_501] = ARTL_ART_chordMode;
    artPopD[ARTL_ART_chordMode_501] = true;
    artLabelInternalStrings[ARTL_ART_chordMode_502] = "chordMode ::= 'm7'  .";
    artLabelStrings[ARTL_ART_chordMode_502] = "";
    artlhsL[ARTL_ART_chordMode_502] = ARTL_ART_chordMode;
    artKindOfs[ARTL_ART_chordMode_502] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_chordMode_502] = true;
    arteoR_pL[ARTL_ART_chordMode_502] = true;
    artPopD[ARTL_ART_chordMode_502] = true;
    artLabelInternalStrings[ARTL_ART_chordMode_506] = "chordMode ::= . 'M'  ";
    artLabelStrings[ARTL_ART_chordMode_506] = "";
    artlhsL[ARTL_ART_chordMode_506] = ARTL_ART_chordMode;
    artKindOfs[ARTL_ART_chordMode_506] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_chordMode_506] = true;
    artLabelInternalStrings[ARTL_ART_chordMode_507] = "chordMode ::= 'M'  ";
    artLabelStrings[ARTL_ART_chordMode_507] = "";
    artlhsL[ARTL_ART_chordMode_507] = ARTL_ART_chordMode;
    artPopD[ARTL_ART_chordMode_507] = true;
    artLabelInternalStrings[ARTL_ART_chordMode_508] = "chordMode ::= 'M'  .";
    artLabelStrings[ARTL_ART_chordMode_508] = "";
    artlhsL[ARTL_ART_chordMode_508] = ARTL_ART_chordMode;
    artKindOfs[ARTL_ART_chordMode_508] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_chordMode_508] = true;
    arteoR_pL[ARTL_ART_chordMode_508] = true;
    artPopD[ARTL_ART_chordMode_508] = true;
    artLabelInternalStrings[ARTL_ART_chordMode_512] = "chordMode ::= . 'M7'  ";
    artLabelStrings[ARTL_ART_chordMode_512] = "";
    artlhsL[ARTL_ART_chordMode_512] = ARTL_ART_chordMode;
    artKindOfs[ARTL_ART_chordMode_512] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_chordMode_512] = true;
    artLabelInternalStrings[ARTL_ART_chordMode_513] = "chordMode ::= 'M7'  ";
    artLabelStrings[ARTL_ART_chordMode_513] = "";
    artlhsL[ARTL_ART_chordMode_513] = ARTL_ART_chordMode;
    artPopD[ARTL_ART_chordMode_513] = true;
    artLabelInternalStrings[ARTL_ART_chordMode_514] = "chordMode ::= 'M7'  .";
    artLabelStrings[ARTL_ART_chordMode_514] = "";
    artlhsL[ARTL_ART_chordMode_514] = ARTL_ART_chordMode;
    artKindOfs[ARTL_ART_chordMode_514] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_chordMode_514] = true;
    arteoR_pL[ARTL_ART_chordMode_514] = true;
    artPopD[ARTL_ART_chordMode_514] = true;
  }

  public void artTableInitialiser_ART_instrument() {
    artLabelInternalStrings[ARTL_ART_instrument] = "instrument";
    artLabelStrings[ARTL_ART_instrument] = "instrument";
    artKindOfs[ARTL_ART_instrument] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_instrument_384] = "instrument ::= . 'instrument'  '('  subExpr ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_instrument_384] = "";
    artlhsL[ARTL_ART_instrument_384] = ARTL_ART_instrument;
    artKindOfs[ARTL_ART_instrument_384] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_instrument_385] = "instrument ::= 'instrument'  '('  subExpr ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_instrument_385] = "";
    artlhsL[ARTL_ART_instrument_385] = ARTL_ART_instrument;
    artLabelInternalStrings[ARTL_ART_instrument_386] = "instrument ::= 'instrument'  . '('  subExpr ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_instrument_386] = "";
    artlhsL[ARTL_ART_instrument_386] = ARTL_ART_instrument;
    artKindOfs[ARTL_ART_instrument_386] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_instrument_386] = true;
    artLabelInternalStrings[ARTL_ART_instrument_387] = "instrument ::= 'instrument'  '('  subExpr ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_instrument_387] = "";
    artlhsL[ARTL_ART_instrument_387] = ARTL_ART_instrument;
    artLabelInternalStrings[ARTL_ART_instrument_388] = "instrument ::= 'instrument'  '('  . subExpr ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_instrument_388] = "";
    artlhsL[ARTL_ART_instrument_388] = ARTL_ART_instrument;
    artKindOfs[ARTL_ART_instrument_388] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_instrument_390] = "instrument ::= 'instrument'  '('  subExpr . ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_instrument_390] = "";
    artlhsL[ARTL_ART_instrument_390] = ARTL_ART_instrument;
    artSlotInstanceOfs[ARTL_ART_instrument_390] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_instrument_390] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_instrument_391] = "instrument ::= 'instrument'  '('  subExpr ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_instrument_391] = "";
    artlhsL[ARTL_ART_instrument_391] = ARTL_ART_instrument;
    artLabelInternalStrings[ARTL_ART_instrument_392] = "instrument ::= 'instrument'  '('  subExpr ','  . subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_instrument_392] = "";
    artlhsL[ARTL_ART_instrument_392] = ARTL_ART_instrument;
    artKindOfs[ARTL_ART_instrument_392] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_instrument_394] = "instrument ::= 'instrument'  '('  subExpr ','  subExpr . ')'  ';'  ";
    artLabelStrings[ARTL_ART_instrument_394] = "";
    artlhsL[ARTL_ART_instrument_394] = ARTL_ART_instrument;
    artSlotInstanceOfs[ARTL_ART_instrument_394] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_instrument_394] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_instrument_394] = true;
    artLabelInternalStrings[ARTL_ART_instrument_395] = "instrument ::= 'instrument'  '('  subExpr ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_instrument_395] = "";
    artlhsL[ARTL_ART_instrument_395] = ARTL_ART_instrument;
    artPopD[ARTL_ART_instrument_395] = true;
    artLabelInternalStrings[ARTL_ART_instrument_396] = "instrument ::= 'instrument'  '('  subExpr ','  subExpr ')'  . ';'  ";
    artLabelStrings[ARTL_ART_instrument_396] = "";
    artlhsL[ARTL_ART_instrument_396] = ARTL_ART_instrument;
    artKindOfs[ARTL_ART_instrument_396] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_instrument_396] = true;
    artLabelInternalStrings[ARTL_ART_instrument_397] = "instrument ::= 'instrument'  '('  subExpr ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_instrument_397] = "";
    artlhsL[ARTL_ART_instrument_397] = ARTL_ART_instrument;
    artPopD[ARTL_ART_instrument_397] = true;
    artLabelInternalStrings[ARTL_ART_instrument_398] = "instrument ::= 'instrument'  '('  subExpr ','  subExpr ')'  ';'  .";
    artLabelStrings[ARTL_ART_instrument_398] = "";
    artlhsL[ARTL_ART_instrument_398] = ARTL_ART_instrument;
    artKindOfs[ARTL_ART_instrument_398] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_instrument_398] = true;
    arteoR_pL[ARTL_ART_instrument_398] = true;
    artPopD[ARTL_ART_instrument_398] = true;
    artLabelInternalStrings[ARTL_ART_instrument_402] = "instrument ::= . 'instrument'  '('  STRING_DQ ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_instrument_402] = "";
    artlhsL[ARTL_ART_instrument_402] = ARTL_ART_instrument;
    artKindOfs[ARTL_ART_instrument_402] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_instrument_403] = "instrument ::= 'instrument'  '('  STRING_DQ ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_instrument_403] = "";
    artlhsL[ARTL_ART_instrument_403] = ARTL_ART_instrument;
    artLabelInternalStrings[ARTL_ART_instrument_404] = "instrument ::= 'instrument'  . '('  STRING_DQ ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_instrument_404] = "";
    artlhsL[ARTL_ART_instrument_404] = ARTL_ART_instrument;
    artKindOfs[ARTL_ART_instrument_404] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_instrument_404] = true;
    artLabelInternalStrings[ARTL_ART_instrument_405] = "instrument ::= 'instrument'  '('  STRING_DQ ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_instrument_405] = "";
    artlhsL[ARTL_ART_instrument_405] = ARTL_ART_instrument;
    artLabelInternalStrings[ARTL_ART_instrument_406] = "instrument ::= 'instrument'  '('  . STRING_DQ ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_instrument_406] = "";
    artlhsL[ARTL_ART_instrument_406] = ARTL_ART_instrument;
    artKindOfs[ARTL_ART_instrument_406] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_instrument_408] = "instrument ::= 'instrument'  '('  STRING_DQ . ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_instrument_408] = "";
    artlhsL[ARTL_ART_instrument_408] = ARTL_ART_instrument;
    artSlotInstanceOfs[ARTL_ART_instrument_408] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_instrument_408] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_instrument_409] = "instrument ::= 'instrument'  '('  STRING_DQ ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_instrument_409] = "";
    artlhsL[ARTL_ART_instrument_409] = ARTL_ART_instrument;
    artLabelInternalStrings[ARTL_ART_instrument_410] = "instrument ::= 'instrument'  '('  STRING_DQ ','  . subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_instrument_410] = "";
    artlhsL[ARTL_ART_instrument_410] = ARTL_ART_instrument;
    artKindOfs[ARTL_ART_instrument_410] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_instrument_412] = "instrument ::= 'instrument'  '('  STRING_DQ ','  subExpr . ')'  ';'  ";
    artLabelStrings[ARTL_ART_instrument_412] = "";
    artlhsL[ARTL_ART_instrument_412] = ARTL_ART_instrument;
    artSlotInstanceOfs[ARTL_ART_instrument_412] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_instrument_412] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_instrument_412] = true;
    artLabelInternalStrings[ARTL_ART_instrument_413] = "instrument ::= 'instrument'  '('  STRING_DQ ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_instrument_413] = "";
    artlhsL[ARTL_ART_instrument_413] = ARTL_ART_instrument;
    artPopD[ARTL_ART_instrument_413] = true;
    artLabelInternalStrings[ARTL_ART_instrument_414] = "instrument ::= 'instrument'  '('  STRING_DQ ','  subExpr ')'  . ';'  ";
    artLabelStrings[ARTL_ART_instrument_414] = "";
    artlhsL[ARTL_ART_instrument_414] = ARTL_ART_instrument;
    artKindOfs[ARTL_ART_instrument_414] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_instrument_414] = true;
    artLabelInternalStrings[ARTL_ART_instrument_415] = "instrument ::= 'instrument'  '('  STRING_DQ ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_instrument_415] = "";
    artlhsL[ARTL_ART_instrument_415] = ARTL_ART_instrument;
    artPopD[ARTL_ART_instrument_415] = true;
    artLabelInternalStrings[ARTL_ART_instrument_416] = "instrument ::= 'instrument'  '('  STRING_DQ ','  subExpr ')'  ';'  .";
    artLabelStrings[ARTL_ART_instrument_416] = "";
    artlhsL[ARTL_ART_instrument_416] = ARTL_ART_instrument;
    artKindOfs[ARTL_ART_instrument_416] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_instrument_416] = true;
    arteoR_pL[ARTL_ART_instrument_416] = true;
    artPopD[ARTL_ART_instrument_416] = true;
    artLabelInternalStrings[ARTL_ART_instrument_420] = "instrument ::= . 'instrument'  STRING_DQ ';'  ";
    artLabelStrings[ARTL_ART_instrument_420] = "";
    artlhsL[ARTL_ART_instrument_420] = ARTL_ART_instrument;
    artKindOfs[ARTL_ART_instrument_420] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_instrument_421] = "instrument ::= 'instrument'  STRING_DQ ';'  ";
    artLabelStrings[ARTL_ART_instrument_421] = "";
    artlhsL[ARTL_ART_instrument_421] = ARTL_ART_instrument;
    artLabelInternalStrings[ARTL_ART_instrument_422] = "instrument ::= 'instrument'  . STRING_DQ ';'  ";
    artLabelStrings[ARTL_ART_instrument_422] = "";
    artlhsL[ARTL_ART_instrument_422] = ARTL_ART_instrument;
    artKindOfs[ARTL_ART_instrument_422] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_instrument_422] = true;
    artLabelInternalStrings[ARTL_ART_instrument_424] = "instrument ::= 'instrument'  STRING_DQ . ';'  ";
    artLabelStrings[ARTL_ART_instrument_424] = "";
    artlhsL[ARTL_ART_instrument_424] = ARTL_ART_instrument;
    artSlotInstanceOfs[ARTL_ART_instrument_424] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_instrument_424] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_instrument_424] = true;
    artLabelInternalStrings[ARTL_ART_instrument_425] = "instrument ::= 'instrument'  STRING_DQ ';'  ";
    artLabelStrings[ARTL_ART_instrument_425] = "";
    artlhsL[ARTL_ART_instrument_425] = ARTL_ART_instrument;
    artPopD[ARTL_ART_instrument_425] = true;
    artLabelInternalStrings[ARTL_ART_instrument_426] = "instrument ::= 'instrument'  STRING_DQ ';'  .";
    artLabelStrings[ARTL_ART_instrument_426] = "";
    artlhsL[ARTL_ART_instrument_426] = ARTL_ART_instrument;
    artKindOfs[ARTL_ART_instrument_426] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_instrument_426] = true;
    arteoR_pL[ARTL_ART_instrument_426] = true;
    artPopD[ARTL_ART_instrument_426] = true;
    artLabelInternalStrings[ARTL_ART_instrument_430] = "instrument ::= . 'instrument'  subExpr ';'  ";
    artLabelStrings[ARTL_ART_instrument_430] = "";
    artlhsL[ARTL_ART_instrument_430] = ARTL_ART_instrument;
    artKindOfs[ARTL_ART_instrument_430] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_instrument_431] = "instrument ::= 'instrument'  subExpr ';'  ";
    artLabelStrings[ARTL_ART_instrument_431] = "";
    artlhsL[ARTL_ART_instrument_431] = ARTL_ART_instrument;
    artLabelInternalStrings[ARTL_ART_instrument_432] = "instrument ::= 'instrument'  . subExpr ';'  ";
    artLabelStrings[ARTL_ART_instrument_432] = "";
    artlhsL[ARTL_ART_instrument_432] = ARTL_ART_instrument;
    artKindOfs[ARTL_ART_instrument_432] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_instrument_432] = true;
    artLabelInternalStrings[ARTL_ART_instrument_434] = "instrument ::= 'instrument'  subExpr . ';'  ";
    artLabelStrings[ARTL_ART_instrument_434] = "";
    artlhsL[ARTL_ART_instrument_434] = ARTL_ART_instrument;
    artSlotInstanceOfs[ARTL_ART_instrument_434] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_instrument_434] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_instrument_434] = true;
    artLabelInternalStrings[ARTL_ART_instrument_435] = "instrument ::= 'instrument'  subExpr ';'  ";
    artLabelStrings[ARTL_ART_instrument_435] = "";
    artlhsL[ARTL_ART_instrument_435] = ARTL_ART_instrument;
    artPopD[ARTL_ART_instrument_435] = true;
    artLabelInternalStrings[ARTL_ART_instrument_436] = "instrument ::= 'instrument'  subExpr ';'  .";
    artLabelStrings[ARTL_ART_instrument_436] = "";
    artlhsL[ARTL_ART_instrument_436] = ARTL_ART_instrument;
    artKindOfs[ARTL_ART_instrument_436] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_instrument_436] = true;
    arteoR_pL[ARTL_ART_instrument_436] = true;
    artPopD[ARTL_ART_instrument_436] = true;
  }

  public void artTableInitialiser_ART_note() {
    artLabelInternalStrings[ARTL_ART_note] = "note";
    artLabelStrings[ARTL_ART_note] = "note";
    artKindOfs[ARTL_ART_note] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_note_460] = "note ::= . simpleNote chordMode ";
    artLabelStrings[ARTL_ART_note_460] = "";
    artlhsL[ARTL_ART_note_460] = ARTL_ART_note;
    artKindOfs[ARTL_ART_note_460] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_note_462] = "note ::= simpleNote . chordMode ";
    artLabelStrings[ARTL_ART_note_462] = "";
    artlhsL[ARTL_ART_note_462] = ARTL_ART_note;
    artSlotInstanceOfs[ARTL_ART_note_462] = ARTL_ART_simpleNote;
    artKindOfs[ARTL_ART_note_462] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_note_462] = true;
    artLabelInternalStrings[ARTL_ART_note_464] = "note ::= simpleNote chordMode .";
    artLabelStrings[ARTL_ART_note_464] = "";
    artlhsL[ARTL_ART_note_464] = ARTL_ART_note;
    artSlotInstanceOfs[ARTL_ART_note_464] = ARTL_ART_chordMode;
    artKindOfs[ARTL_ART_note_464] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_note_464] = true;
    arteoR_pL[ARTL_ART_note_464] = true;
    artPopD[ARTL_ART_note_464] = true;
    artLabelInternalStrings[ARTL_ART_note_468] = "note ::= . simpleNote shifters chordMode ";
    artLabelStrings[ARTL_ART_note_468] = "";
    artlhsL[ARTL_ART_note_468] = ARTL_ART_note;
    artKindOfs[ARTL_ART_note_468] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_note_470] = "note ::= simpleNote . shifters chordMode ";
    artLabelStrings[ARTL_ART_note_470] = "";
    artlhsL[ARTL_ART_note_470] = ARTL_ART_note;
    artSlotInstanceOfs[ARTL_ART_note_470] = ARTL_ART_simpleNote;
    artKindOfs[ARTL_ART_note_470] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_note_470] = true;
    artLabelInternalStrings[ARTL_ART_note_472] = "note ::= simpleNote shifters . chordMode ";
    artLabelStrings[ARTL_ART_note_472] = "";
    artlhsL[ARTL_ART_note_472] = ARTL_ART_note;
    artSlotInstanceOfs[ARTL_ART_note_472] = ARTL_ART_shifters;
    artKindOfs[ARTL_ART_note_472] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_note_474] = "note ::= simpleNote shifters chordMode .";
    artLabelStrings[ARTL_ART_note_474] = "";
    artlhsL[ARTL_ART_note_474] = ARTL_ART_note;
    artSlotInstanceOfs[ARTL_ART_note_474] = ARTL_ART_chordMode;
    artKindOfs[ARTL_ART_note_474] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_note_474] = true;
    arteoR_pL[ARTL_ART_note_474] = true;
    artPopD[ARTL_ART_note_474] = true;
    artLabelInternalStrings[ARTL_ART_note_478] = "note ::= . simpleNote INTEGER chordMode ";
    artLabelStrings[ARTL_ART_note_478] = "";
    artlhsL[ARTL_ART_note_478] = ARTL_ART_note;
    artKindOfs[ARTL_ART_note_478] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_note_480] = "note ::= simpleNote . INTEGER chordMode ";
    artLabelStrings[ARTL_ART_note_480] = "";
    artlhsL[ARTL_ART_note_480] = ARTL_ART_note;
    artSlotInstanceOfs[ARTL_ART_note_480] = ARTL_ART_simpleNote;
    artKindOfs[ARTL_ART_note_480] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_note_480] = true;
    artLabelInternalStrings[ARTL_ART_note_482] = "note ::= simpleNote INTEGER . chordMode ";
    artLabelStrings[ARTL_ART_note_482] = "";
    artlhsL[ARTL_ART_note_482] = ARTL_ART_note;
    artSlotInstanceOfs[ARTL_ART_note_482] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_note_482] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_note_484] = "note ::= simpleNote INTEGER chordMode .";
    artLabelStrings[ARTL_ART_note_484] = "";
    artlhsL[ARTL_ART_note_484] = ARTL_ART_note;
    artSlotInstanceOfs[ARTL_ART_note_484] = ARTL_ART_chordMode;
    artKindOfs[ARTL_ART_note_484] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_note_484] = true;
    arteoR_pL[ARTL_ART_note_484] = true;
    artPopD[ARTL_ART_note_484] = true;
  }

  public void artTableInitialiser_ART_notes() {
    artLabelInternalStrings[ARTL_ART_notes] = "notes";
    artLabelStrings[ARTL_ART_notes] = "notes";
    artKindOfs[ARTL_ART_notes] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_notes_628] = "notes ::= . note ";
    artLabelStrings[ARTL_ART_notes_628] = "";
    artlhsL[ARTL_ART_notes_628] = ARTL_ART_notes;
    artKindOfs[ARTL_ART_notes_628] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_notes_630] = "notes ::= note .";
    artLabelStrings[ARTL_ART_notes_630] = "";
    artlhsL[ARTL_ART_notes_630] = ARTL_ART_notes;
    artSlotInstanceOfs[ARTL_ART_notes_630] = ARTL_ART_note;
    artKindOfs[ARTL_ART_notes_630] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_notes_630] = true;
    arteoR_pL[ARTL_ART_notes_630] = true;
    artPopD[ARTL_ART_notes_630] = true;
    artLabelInternalStrings[ARTL_ART_notes_632] = "notes ::= . note notes ";
    artLabelStrings[ARTL_ART_notes_632] = "";
    artlhsL[ARTL_ART_notes_632] = ARTL_ART_notes;
    artKindOfs[ARTL_ART_notes_632] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_notes_634] = "notes ::= note . notes ";
    artLabelStrings[ARTL_ART_notes_634] = "";
    artlhsL[ARTL_ART_notes_634] = ARTL_ART_notes;
    artSlotInstanceOfs[ARTL_ART_notes_634] = ARTL_ART_note;
    artKindOfs[ARTL_ART_notes_634] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_notes_634] = true;
    artLabelInternalStrings[ARTL_ART_notes_636] = "notes ::= note notes .";
    artLabelStrings[ARTL_ART_notes_636] = "";
    artlhsL[ARTL_ART_notes_636] = ARTL_ART_notes;
    artSlotInstanceOfs[ARTL_ART_notes_636] = ARTL_ART_notes;
    artKindOfs[ARTL_ART_notes_636] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_notes_636] = true;
    arteoR_pL[ARTL_ART_notes_636] = true;
    artPopD[ARTL_ART_notes_636] = true;
  }

  public void artTableInitialiser_ART_octave() {
    artLabelInternalStrings[ARTL_ART_octave] = "octave";
    artLabelStrings[ARTL_ART_octave] = "octave";
    artKindOfs[ARTL_ART_octave] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_octave_440] = "octave ::= . 'octave'  INTEGER ';'  ";
    artLabelStrings[ARTL_ART_octave_440] = "";
    artlhsL[ARTL_ART_octave_440] = ARTL_ART_octave;
    artKindOfs[ARTL_ART_octave_440] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_octave_441] = "octave ::= 'octave'  INTEGER ';'  ";
    artLabelStrings[ARTL_ART_octave_441] = "";
    artlhsL[ARTL_ART_octave_441] = ARTL_ART_octave;
    artLabelInternalStrings[ARTL_ART_octave_442] = "octave ::= 'octave'  . INTEGER ';'  ";
    artLabelStrings[ARTL_ART_octave_442] = "";
    artlhsL[ARTL_ART_octave_442] = ARTL_ART_octave;
    artKindOfs[ARTL_ART_octave_442] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_octave_442] = true;
    artLabelInternalStrings[ARTL_ART_octave_444] = "octave ::= 'octave'  INTEGER . ';'  ";
    artLabelStrings[ARTL_ART_octave_444] = "";
    artlhsL[ARTL_ART_octave_444] = ARTL_ART_octave;
    artSlotInstanceOfs[ARTL_ART_octave_444] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_octave_444] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_octave_444] = true;
    artLabelInternalStrings[ARTL_ART_octave_445] = "octave ::= 'octave'  INTEGER ';'  ";
    artLabelStrings[ARTL_ART_octave_445] = "";
    artlhsL[ARTL_ART_octave_445] = ARTL_ART_octave;
    artPopD[ARTL_ART_octave_445] = true;
    artLabelInternalStrings[ARTL_ART_octave_446] = "octave ::= 'octave'  INTEGER ';'  .";
    artLabelStrings[ARTL_ART_octave_446] = "";
    artlhsL[ARTL_ART_octave_446] = ARTL_ART_octave;
    artKindOfs[ARTL_ART_octave_446] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_octave_446] = true;
    arteoR_pL[ARTL_ART_octave_446] = true;
    artPopD[ARTL_ART_octave_446] = true;
  }

  public void artTableInitialiser_ART_operand() {
    artLabelInternalStrings[ARTL_ART_operand] = "operand";
    artLabelStrings[ARTL_ART_operand] = "operand";
    artKindOfs[ARTL_ART_operand] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_operand_700] = "operand ::= . ID ";
    artLabelStrings[ARTL_ART_operand_700] = "";
    artlhsL[ARTL_ART_operand_700] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_700] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_operand_702] = "operand ::= ID .";
    artLabelStrings[ARTL_ART_operand_702] = "";
    artlhsL[ARTL_ART_operand_702] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_702] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_operand_702] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_702] = true;
    arteoR_pL[ARTL_ART_operand_702] = true;
    artPopD[ARTL_ART_operand_702] = true;
    artLabelInternalStrings[ARTL_ART_operand_706] = "operand ::= . INTEGER ";
    artLabelStrings[ARTL_ART_operand_706] = "";
    artlhsL[ARTL_ART_operand_706] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_706] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_operand_708] = "operand ::= INTEGER .";
    artLabelStrings[ARTL_ART_operand_708] = "";
    artlhsL[ARTL_ART_operand_708] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_708] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_operand_708] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_708] = true;
    arteoR_pL[ARTL_ART_operand_708] = true;
    artPopD[ARTL_ART_operand_708] = true;
    artLabelInternalStrings[ARTL_ART_operand_712] = "operand ::= . '('  subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_712] = "";
    artlhsL[ARTL_ART_operand_712] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_712] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_operand_713] = "operand ::= '('  subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_713] = "";
    artlhsL[ARTL_ART_operand_713] = ARTL_ART_operand;
    artLabelInternalStrings[ARTL_ART_operand_714] = "operand ::= '('  . subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_714] = "";
    artlhsL[ARTL_ART_operand_714] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_714] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_operand_714] = true;
    artLabelInternalStrings[ARTL_ART_operand_716] = "operand ::= '('  subExpr . ')'  ";
    artLabelStrings[ARTL_ART_operand_716] = "";
    artlhsL[ARTL_ART_operand_716] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_716] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_operand_716] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_operand_716] = true;
    artLabelInternalStrings[ARTL_ART_operand_717] = "operand ::= '('  subExpr ')'  ";
    artLabelStrings[ARTL_ART_operand_717] = "";
    artlhsL[ARTL_ART_operand_717] = ARTL_ART_operand;
    artPopD[ARTL_ART_operand_717] = true;
    artLabelInternalStrings[ARTL_ART_operand_718] = "operand ::= '('  subExpr ')'  .";
    artLabelStrings[ARTL_ART_operand_718] = "";
    artlhsL[ARTL_ART_operand_718] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_718] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_718] = true;
    arteoR_pL[ARTL_ART_operand_718] = true;
    artPopD[ARTL_ART_operand_718] = true;
  }

  public void artTableInitialiser_ART_printElements() {
    artLabelInternalStrings[ARTL_ART_printElements] = "printElements";
    artLabelStrings[ARTL_ART_printElements] = "printElements";
    artKindOfs[ARTL_ART_printElements] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_printElements_662] = "printElements ::= . STRING_DQ ";
    artLabelStrings[ARTL_ART_printElements_662] = "";
    artlhsL[ARTL_ART_printElements_662] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_662] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_printElements_664] = "printElements ::= STRING_DQ .";
    artLabelStrings[ARTL_ART_printElements_664] = "";
    artlhsL[ARTL_ART_printElements_664] = ARTL_ART_printElements;
    artSlotInstanceOfs[ARTL_ART_printElements_664] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_printElements_664] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_printElements_664] = true;
    arteoR_pL[ARTL_ART_printElements_664] = true;
    artPopD[ARTL_ART_printElements_664] = true;
    artLabelInternalStrings[ARTL_ART_printElements_668] = "printElements ::= . STRING_DQ ','  printElements ";
    artLabelStrings[ARTL_ART_printElements_668] = "";
    artlhsL[ARTL_ART_printElements_668] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_668] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_printElements_670] = "printElements ::= STRING_DQ . ','  printElements ";
    artLabelStrings[ARTL_ART_printElements_670] = "";
    artlhsL[ARTL_ART_printElements_670] = ARTL_ART_printElements;
    artSlotInstanceOfs[ARTL_ART_printElements_670] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_printElements_670] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_printElements_670] = true;
    artLabelInternalStrings[ARTL_ART_printElements_673] = "printElements ::= STRING_DQ ','  printElements ";
    artLabelStrings[ARTL_ART_printElements_673] = "";
    artlhsL[ARTL_ART_printElements_673] = ARTL_ART_printElements;
    artLabelInternalStrings[ARTL_ART_printElements_674] = "printElements ::= STRING_DQ ','  . printElements ";
    artLabelStrings[ARTL_ART_printElements_674] = "";
    artlhsL[ARTL_ART_printElements_674] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_674] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_printElements_676] = "printElements ::= STRING_DQ ','  printElements .";
    artLabelStrings[ARTL_ART_printElements_676] = "";
    artlhsL[ARTL_ART_printElements_676] = ARTL_ART_printElements;
    artSlotInstanceOfs[ARTL_ART_printElements_676] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_676] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_printElements_676] = true;
    arteoR_pL[ARTL_ART_printElements_676] = true;
    artPopD[ARTL_ART_printElements_676] = true;
    artLabelInternalStrings[ARTL_ART_printElements_678] = "printElements ::= . subExpr ";
    artLabelStrings[ARTL_ART_printElements_678] = "";
    artlhsL[ARTL_ART_printElements_678] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_678] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_printElements_680] = "printElements ::= subExpr .";
    artLabelStrings[ARTL_ART_printElements_680] = "";
    artlhsL[ARTL_ART_printElements_680] = ARTL_ART_printElements;
    artSlotInstanceOfs[ARTL_ART_printElements_680] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_printElements_680] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_printElements_680] = true;
    arteoR_pL[ARTL_ART_printElements_680] = true;
    artPopD[ARTL_ART_printElements_680] = true;
    artLabelInternalStrings[ARTL_ART_printElements_684] = "printElements ::= . subExpr ','  printElements ";
    artLabelStrings[ARTL_ART_printElements_684] = "";
    artlhsL[ARTL_ART_printElements_684] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_684] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_printElements_686] = "printElements ::= subExpr . ','  printElements ";
    artLabelStrings[ARTL_ART_printElements_686] = "";
    artlhsL[ARTL_ART_printElements_686] = ARTL_ART_printElements;
    artSlotInstanceOfs[ARTL_ART_printElements_686] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_printElements_686] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_printElements_686] = true;
    artLabelInternalStrings[ARTL_ART_printElements_689] = "printElements ::= subExpr ','  printElements ";
    artLabelStrings[ARTL_ART_printElements_689] = "";
    artlhsL[ARTL_ART_printElements_689] = ARTL_ART_printElements;
    artLabelInternalStrings[ARTL_ART_printElements_690] = "printElements ::= subExpr ','  . printElements ";
    artLabelStrings[ARTL_ART_printElements_690] = "";
    artlhsL[ARTL_ART_printElements_690] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_690] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_printElements_692] = "printElements ::= subExpr ','  printElements .";
    artLabelStrings[ARTL_ART_printElements_692] = "";
    artlhsL[ARTL_ART_printElements_692] = ARTL_ART_printElements;
    artSlotInstanceOfs[ARTL_ART_printElements_692] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_692] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_printElements_692] = true;
    arteoR_pL[ARTL_ART_printElements_692] = true;
    artPopD[ARTL_ART_printElements_692] = true;
    artLabelInternalStrings[ARTL_ART_printElements_694] = "printElements ::= . ID ";
    artLabelStrings[ARTL_ART_printElements_694] = "";
    artlhsL[ARTL_ART_printElements_694] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_694] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_printElements_696] = "printElements ::= ID .";
    artLabelStrings[ARTL_ART_printElements_696] = "";
    artlhsL[ARTL_ART_printElements_696] = ARTL_ART_printElements;
    artSlotInstanceOfs[ARTL_ART_printElements_696] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_printElements_696] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_printElements_696] = true;
    arteoR_pL[ARTL_ART_printElements_696] = true;
    artPopD[ARTL_ART_printElements_696] = true;
  }

  public void artTableInitialiser_ART_relExpr() {
    artLabelInternalStrings[ARTL_ART_relExpr] = "relExpr";
    artLabelStrings[ARTL_ART_relExpr] = "relExpr";
    artKindOfs[ARTL_ART_relExpr] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_relExpr_224] = "relExpr ::= . subExpr ";
    artLabelStrings[ARTL_ART_relExpr_224] = "";
    artlhsL[ARTL_ART_relExpr_224] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_224] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_relExpr_226] = "relExpr ::= subExpr .";
    artLabelStrings[ARTL_ART_relExpr_226] = "";
    artlhsL[ARTL_ART_relExpr_226] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_226] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_relExpr_226] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_226] = true;
    arteoR_pL[ARTL_ART_relExpr_226] = true;
    artPopD[ARTL_ART_relExpr_226] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_230] = "relExpr ::= . relExpr '>'  subExpr ";
    artLabelStrings[ARTL_ART_relExpr_230] = "";
    artlhsL[ARTL_ART_relExpr_230] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_230] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_relExpr_232] = "relExpr ::= relExpr . '>'  subExpr ";
    artLabelStrings[ARTL_ART_relExpr_232] = "";
    artlhsL[ARTL_ART_relExpr_232] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_232] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_232] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_relExpr_232] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_233] = "relExpr ::= relExpr '>'  subExpr ";
    artLabelStrings[ARTL_ART_relExpr_233] = "";
    artlhsL[ARTL_ART_relExpr_233] = ARTL_ART_relExpr;
    artLabelInternalStrings[ARTL_ART_relExpr_234] = "relExpr ::= relExpr '>'  . subExpr ";
    artLabelStrings[ARTL_ART_relExpr_234] = "";
    artlhsL[ARTL_ART_relExpr_234] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_234] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_relExpr_236] = "relExpr ::= relExpr '>'  subExpr .";
    artLabelStrings[ARTL_ART_relExpr_236] = "";
    artlhsL[ARTL_ART_relExpr_236] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_236] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_relExpr_236] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_236] = true;
    arteoR_pL[ARTL_ART_relExpr_236] = true;
    artPopD[ARTL_ART_relExpr_236] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_240] = "relExpr ::= . relExpr '!='  subExpr ";
    artLabelStrings[ARTL_ART_relExpr_240] = "";
    artlhsL[ARTL_ART_relExpr_240] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_240] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_relExpr_242] = "relExpr ::= relExpr . '!='  subExpr ";
    artLabelStrings[ARTL_ART_relExpr_242] = "";
    artlhsL[ARTL_ART_relExpr_242] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_242] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_242] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_relExpr_242] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_243] = "relExpr ::= relExpr '!='  subExpr ";
    artLabelStrings[ARTL_ART_relExpr_243] = "";
    artlhsL[ARTL_ART_relExpr_243] = ARTL_ART_relExpr;
    artLabelInternalStrings[ARTL_ART_relExpr_244] = "relExpr ::= relExpr '!='  . subExpr ";
    artLabelStrings[ARTL_ART_relExpr_244] = "";
    artlhsL[ARTL_ART_relExpr_244] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_244] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_relExpr_246] = "relExpr ::= relExpr '!='  subExpr .";
    artLabelStrings[ARTL_ART_relExpr_246] = "";
    artlhsL[ARTL_ART_relExpr_246] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_246] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_relExpr_246] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_246] = true;
    arteoR_pL[ARTL_ART_relExpr_246] = true;
    artPopD[ARTL_ART_relExpr_246] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_250] = "relExpr ::= . relExpr '<'  subExpr ";
    artLabelStrings[ARTL_ART_relExpr_250] = "";
    artlhsL[ARTL_ART_relExpr_250] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_250] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_relExpr_252] = "relExpr ::= relExpr . '<'  subExpr ";
    artLabelStrings[ARTL_ART_relExpr_252] = "";
    artlhsL[ARTL_ART_relExpr_252] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_252] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_252] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_relExpr_252] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_253] = "relExpr ::= relExpr '<'  subExpr ";
    artLabelStrings[ARTL_ART_relExpr_253] = "";
    artlhsL[ARTL_ART_relExpr_253] = ARTL_ART_relExpr;
    artLabelInternalStrings[ARTL_ART_relExpr_254] = "relExpr ::= relExpr '<'  . subExpr ";
    artLabelStrings[ARTL_ART_relExpr_254] = "";
    artlhsL[ARTL_ART_relExpr_254] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_254] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_relExpr_256] = "relExpr ::= relExpr '<'  subExpr .";
    artLabelStrings[ARTL_ART_relExpr_256] = "";
    artlhsL[ARTL_ART_relExpr_256] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_256] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_relExpr_256] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_256] = true;
    arteoR_pL[ARTL_ART_relExpr_256] = true;
    artPopD[ARTL_ART_relExpr_256] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_260] = "relExpr ::= . relExpr '=='  subExpr ";
    artLabelStrings[ARTL_ART_relExpr_260] = "";
    artlhsL[ARTL_ART_relExpr_260] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_260] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_relExpr_262] = "relExpr ::= relExpr . '=='  subExpr ";
    artLabelStrings[ARTL_ART_relExpr_262] = "";
    artlhsL[ARTL_ART_relExpr_262] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_262] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_262] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_relExpr_262] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_263] = "relExpr ::= relExpr '=='  subExpr ";
    artLabelStrings[ARTL_ART_relExpr_263] = "";
    artlhsL[ARTL_ART_relExpr_263] = ARTL_ART_relExpr;
    artLabelInternalStrings[ARTL_ART_relExpr_264] = "relExpr ::= relExpr '=='  . subExpr ";
    artLabelStrings[ARTL_ART_relExpr_264] = "";
    artlhsL[ARTL_ART_relExpr_264] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_264] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_relExpr_266] = "relExpr ::= relExpr '=='  subExpr .";
    artLabelStrings[ARTL_ART_relExpr_266] = "";
    artlhsL[ARTL_ART_relExpr_266] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_266] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_relExpr_266] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_266] = true;
    arteoR_pL[ARTL_ART_relExpr_266] = true;
    artPopD[ARTL_ART_relExpr_266] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_270] = "relExpr ::= . relExpr '>='  subExpr ";
    artLabelStrings[ARTL_ART_relExpr_270] = "";
    artlhsL[ARTL_ART_relExpr_270] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_270] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_relExpr_272] = "relExpr ::= relExpr . '>='  subExpr ";
    artLabelStrings[ARTL_ART_relExpr_272] = "";
    artlhsL[ARTL_ART_relExpr_272] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_272] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_272] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_relExpr_272] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_273] = "relExpr ::= relExpr '>='  subExpr ";
    artLabelStrings[ARTL_ART_relExpr_273] = "";
    artlhsL[ARTL_ART_relExpr_273] = ARTL_ART_relExpr;
    artLabelInternalStrings[ARTL_ART_relExpr_274] = "relExpr ::= relExpr '>='  . subExpr ";
    artLabelStrings[ARTL_ART_relExpr_274] = "";
    artlhsL[ARTL_ART_relExpr_274] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_274] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_relExpr_276] = "relExpr ::= relExpr '>='  subExpr .";
    artLabelStrings[ARTL_ART_relExpr_276] = "";
    artlhsL[ARTL_ART_relExpr_276] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_276] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_relExpr_276] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_276] = true;
    arteoR_pL[ARTL_ART_relExpr_276] = true;
    artPopD[ARTL_ART_relExpr_276] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_280] = "relExpr ::= . relExpr '<='  subExpr ";
    artLabelStrings[ARTL_ART_relExpr_280] = "";
    artlhsL[ARTL_ART_relExpr_280] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_280] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_relExpr_282] = "relExpr ::= relExpr . '<='  subExpr ";
    artLabelStrings[ARTL_ART_relExpr_282] = "";
    artlhsL[ARTL_ART_relExpr_282] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_282] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_282] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_relExpr_282] = true;
    artLabelInternalStrings[ARTL_ART_relExpr_283] = "relExpr ::= relExpr '<='  subExpr ";
    artLabelStrings[ARTL_ART_relExpr_283] = "";
    artlhsL[ARTL_ART_relExpr_283] = ARTL_ART_relExpr;
    artLabelInternalStrings[ARTL_ART_relExpr_284] = "relExpr ::= relExpr '<='  . subExpr ";
    artLabelStrings[ARTL_ART_relExpr_284] = "";
    artlhsL[ARTL_ART_relExpr_284] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_relExpr_284] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_relExpr_286] = "relExpr ::= relExpr '<='  subExpr .";
    artLabelStrings[ARTL_ART_relExpr_286] = "";
    artlhsL[ARTL_ART_relExpr_286] = ARTL_ART_relExpr;
    artSlotInstanceOfs[ARTL_ART_relExpr_286] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_relExpr_286] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_relExpr_286] = true;
    arteoR_pL[ARTL_ART_relExpr_286] = true;
    artPopD[ARTL_ART_relExpr_286] = true;
  }

  public void artTableInitialiser_ART_rest() {
    artLabelInternalStrings[ARTL_ART_rest] = "rest";
    artLabelStrings[ARTL_ART_rest] = "rest";
    artKindOfs[ARTL_ART_rest] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_rest_638] = "rest ::= . '.'  ";
    artLabelStrings[ARTL_ART_rest_638] = "";
    artlhsL[ARTL_ART_rest_638] = ARTL_ART_rest;
    artKindOfs[ARTL_ART_rest_638] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_rest_638] = true;
    artLabelInternalStrings[ARTL_ART_rest_639] = "rest ::= '.'  ";
    artLabelStrings[ARTL_ART_rest_639] = "";
    artlhsL[ARTL_ART_rest_639] = ARTL_ART_rest;
    artPopD[ARTL_ART_rest_639] = true;
    artLabelInternalStrings[ARTL_ART_rest_640] = "rest ::= '.'  .";
    artLabelStrings[ARTL_ART_rest_640] = "";
    artlhsL[ARTL_ART_rest_640] = ARTL_ART_rest;
    artKindOfs[ARTL_ART_rest_640] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_rest_640] = true;
    arteoR_pL[ARTL_ART_rest_640] = true;
    artPopD[ARTL_ART_rest_640] = true;
    artLabelInternalStrings[ARTL_ART_rest_644] = "rest ::= . '..'  ";
    artLabelStrings[ARTL_ART_rest_644] = "";
    artlhsL[ARTL_ART_rest_644] = ARTL_ART_rest;
    artKindOfs[ARTL_ART_rest_644] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_rest_644] = true;
    artLabelInternalStrings[ARTL_ART_rest_645] = "rest ::= '..'  ";
    artLabelStrings[ARTL_ART_rest_645] = "";
    artlhsL[ARTL_ART_rest_645] = ARTL_ART_rest;
    artPopD[ARTL_ART_rest_645] = true;
    artLabelInternalStrings[ARTL_ART_rest_646] = "rest ::= '..'  .";
    artLabelStrings[ARTL_ART_rest_646] = "";
    artlhsL[ARTL_ART_rest_646] = ARTL_ART_rest;
    artKindOfs[ARTL_ART_rest_646] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_rest_646] = true;
    arteoR_pL[ARTL_ART_rest_646] = true;
    artPopD[ARTL_ART_rest_646] = true;
    artLabelInternalStrings[ARTL_ART_rest_650] = "rest ::= . '...'  ";
    artLabelStrings[ARTL_ART_rest_650] = "";
    artlhsL[ARTL_ART_rest_650] = ARTL_ART_rest;
    artKindOfs[ARTL_ART_rest_650] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_rest_650] = true;
    artLabelInternalStrings[ARTL_ART_rest_651] = "rest ::= '...'  ";
    artLabelStrings[ARTL_ART_rest_651] = "";
    artlhsL[ARTL_ART_rest_651] = ARTL_ART_rest;
    artPopD[ARTL_ART_rest_651] = true;
    artLabelInternalStrings[ARTL_ART_rest_652] = "rest ::= '...'  .";
    artLabelStrings[ARTL_ART_rest_652] = "";
    artlhsL[ARTL_ART_rest_652] = ARTL_ART_rest;
    artKindOfs[ARTL_ART_rest_652] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_rest_652] = true;
    arteoR_pL[ARTL_ART_rest_652] = true;
    artPopD[ARTL_ART_rest_652] = true;
    artLabelInternalStrings[ARTL_ART_rest_656] = "rest ::= . '....'  ";
    artLabelStrings[ARTL_ART_rest_656] = "";
    artlhsL[ARTL_ART_rest_656] = ARTL_ART_rest;
    artKindOfs[ARTL_ART_rest_656] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_rest_656] = true;
    artLabelInternalStrings[ARTL_ART_rest_657] = "rest ::= '....'  ";
    artLabelStrings[ARTL_ART_rest_657] = "";
    artlhsL[ARTL_ART_rest_657] = ARTL_ART_rest;
    artPopD[ARTL_ART_rest_657] = true;
    artLabelInternalStrings[ARTL_ART_rest_658] = "rest ::= '....'  .";
    artLabelStrings[ARTL_ART_rest_658] = "";
    artlhsL[ARTL_ART_rest_658] = ARTL_ART_rest;
    artKindOfs[ARTL_ART_rest_658] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_rest_658] = true;
    arteoR_pL[ARTL_ART_rest_658] = true;
    artPopD[ARTL_ART_rest_658] = true;
  }

  public void artTableInitialiser_ART_shifters() {
    artLabelInternalStrings[ARTL_ART_shifters] = "shifters";
    artLabelStrings[ARTL_ART_shifters] = "shifters";
    artKindOfs[ARTL_ART_shifters] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_shifters_592] = "shifters ::= . '+'  ";
    artLabelStrings[ARTL_ART_shifters_592] = "";
    artlhsL[ARTL_ART_shifters_592] = ARTL_ART_shifters;
    artKindOfs[ARTL_ART_shifters_592] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_shifters_592] = true;
    artLabelInternalStrings[ARTL_ART_shifters_593] = "shifters ::= '+'  ";
    artLabelStrings[ARTL_ART_shifters_593] = "";
    artlhsL[ARTL_ART_shifters_593] = ARTL_ART_shifters;
    artPopD[ARTL_ART_shifters_593] = true;
    artLabelInternalStrings[ARTL_ART_shifters_594] = "shifters ::= '+'  .";
    artLabelStrings[ARTL_ART_shifters_594] = "";
    artlhsL[ARTL_ART_shifters_594] = ARTL_ART_shifters;
    artKindOfs[ARTL_ART_shifters_594] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_shifters_594] = true;
    arteoR_pL[ARTL_ART_shifters_594] = true;
    artPopD[ARTL_ART_shifters_594] = true;
    artLabelInternalStrings[ARTL_ART_shifters_598] = "shifters ::= . '-'  ";
    artLabelStrings[ARTL_ART_shifters_598] = "";
    artlhsL[ARTL_ART_shifters_598] = ARTL_ART_shifters;
    artKindOfs[ARTL_ART_shifters_598] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_shifters_598] = true;
    artLabelInternalStrings[ARTL_ART_shifters_599] = "shifters ::= '-'  ";
    artLabelStrings[ARTL_ART_shifters_599] = "";
    artlhsL[ARTL_ART_shifters_599] = ARTL_ART_shifters;
    artPopD[ARTL_ART_shifters_599] = true;
    artLabelInternalStrings[ARTL_ART_shifters_600] = "shifters ::= '-'  .";
    artLabelStrings[ARTL_ART_shifters_600] = "";
    artlhsL[ARTL_ART_shifters_600] = ARTL_ART_shifters;
    artKindOfs[ARTL_ART_shifters_600] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_shifters_600] = true;
    arteoR_pL[ARTL_ART_shifters_600] = true;
    artPopD[ARTL_ART_shifters_600] = true;
    artLabelInternalStrings[ARTL_ART_shifters_604] = "shifters ::= . '+'  shifters ";
    artLabelStrings[ARTL_ART_shifters_604] = "";
    artlhsL[ARTL_ART_shifters_604] = ARTL_ART_shifters;
    artKindOfs[ARTL_ART_shifters_604] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_shifters_605] = "shifters ::= '+'  shifters ";
    artLabelStrings[ARTL_ART_shifters_605] = "";
    artlhsL[ARTL_ART_shifters_605] = ARTL_ART_shifters;
    artLabelInternalStrings[ARTL_ART_shifters_606] = "shifters ::= '+'  . shifters ";
    artLabelStrings[ARTL_ART_shifters_606] = "";
    artlhsL[ARTL_ART_shifters_606] = ARTL_ART_shifters;
    artKindOfs[ARTL_ART_shifters_606] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_shifters_606] = true;
    artLabelInternalStrings[ARTL_ART_shifters_608] = "shifters ::= '+'  shifters .";
    artLabelStrings[ARTL_ART_shifters_608] = "";
    artlhsL[ARTL_ART_shifters_608] = ARTL_ART_shifters;
    artSlotInstanceOfs[ARTL_ART_shifters_608] = ARTL_ART_shifters;
    artKindOfs[ARTL_ART_shifters_608] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_shifters_608] = true;
    arteoR_pL[ARTL_ART_shifters_608] = true;
    artPopD[ARTL_ART_shifters_608] = true;
    artLabelInternalStrings[ARTL_ART_shifters_612] = "shifters ::= . '-'  shifters ";
    artLabelStrings[ARTL_ART_shifters_612] = "";
    artlhsL[ARTL_ART_shifters_612] = ARTL_ART_shifters;
    artKindOfs[ARTL_ART_shifters_612] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_shifters_613] = "shifters ::= '-'  shifters ";
    artLabelStrings[ARTL_ART_shifters_613] = "";
    artlhsL[ARTL_ART_shifters_613] = ARTL_ART_shifters;
    artLabelInternalStrings[ARTL_ART_shifters_614] = "shifters ::= '-'  . shifters ";
    artLabelStrings[ARTL_ART_shifters_614] = "";
    artlhsL[ARTL_ART_shifters_614] = ARTL_ART_shifters;
    artKindOfs[ARTL_ART_shifters_614] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_shifters_614] = true;
    artLabelInternalStrings[ARTL_ART_shifters_616] = "shifters ::= '-'  shifters .";
    artLabelStrings[ARTL_ART_shifters_616] = "";
    artlhsL[ARTL_ART_shifters_616] = ARTL_ART_shifters;
    artSlotInstanceOfs[ARTL_ART_shifters_616] = ARTL_ART_shifters;
    artKindOfs[ARTL_ART_shifters_616] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_shifters_616] = true;
    arteoR_pL[ARTL_ART_shifters_616] = true;
    artPopD[ARTL_ART_shifters_616] = true;
  }

  public void artTableInitialiser_ART_simpleNote() {
    artLabelInternalStrings[ARTL_ART_simpleNote] = "simpleNote";
    artLabelStrings[ARTL_ART_simpleNote] = "simpleNote";
    artKindOfs[ARTL_ART_simpleNote] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_simpleNote_518] = "simpleNote ::= . simpleNoteLexeme ";
    artLabelStrings[ARTL_ART_simpleNote_518] = "";
    artlhsL[ARTL_ART_simpleNote_518] = ARTL_ART_simpleNote;
    artKindOfs[ARTL_ART_simpleNote_518] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_simpleNote_520] = "simpleNote ::= simpleNoteLexeme .";
    artLabelStrings[ARTL_ART_simpleNote_520] = "";
    artlhsL[ARTL_ART_simpleNote_520] = ARTL_ART_simpleNote;
    artSlotInstanceOfs[ARTL_ART_simpleNote_520] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNote_520] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNote_520] = true;
    arteoR_pL[ARTL_ART_simpleNote_520] = true;
    artPopD[ARTL_ART_simpleNote_520] = true;
  }

  public void artTableInitialiser_ART_simpleNoteLexeme() {
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme] = "simpleNoteLexeme";
    artLabelStrings[ARTL_ART_simpleNoteLexeme] = "simpleNoteLexeme";
    artKindOfs[ARTL_ART_simpleNoteLexeme] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_524] = "simpleNoteLexeme ::= . 'Ab'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_524] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_524] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_524] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_524] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_525] = "simpleNoteLexeme ::= 'Ab'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_525] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_525] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_525] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_526] = "simpleNoteLexeme ::= 'Ab'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_526] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_526] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_526] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_526] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_526] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_526] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_528] = "simpleNoteLexeme ::= . 'A'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_528] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_528] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_528] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_528] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_529] = "simpleNoteLexeme ::= 'A'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_529] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_529] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_529] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_530] = "simpleNoteLexeme ::= 'A'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_530] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_530] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_530] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_530] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_530] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_530] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_532] = "simpleNoteLexeme ::= . 'A#'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_532] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_532] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_532] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_532] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_533] = "simpleNoteLexeme ::= 'A#'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_533] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_533] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_533] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_534] = "simpleNoteLexeme ::= 'A#'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_534] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_534] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_534] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_534] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_534] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_534] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_536] = "simpleNoteLexeme ::= . 'Bb'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_536] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_536] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_536] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_536] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_537] = "simpleNoteLexeme ::= 'Bb'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_537] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_537] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_537] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_538] = "simpleNoteLexeme ::= 'Bb'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_538] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_538] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_538] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_538] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_538] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_538] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_540] = "simpleNoteLexeme ::= . 'B'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_540] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_540] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_540] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_540] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_541] = "simpleNoteLexeme ::= 'B'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_541] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_541] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_541] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_542] = "simpleNoteLexeme ::= 'B'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_542] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_542] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_542] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_542] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_542] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_542] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_544] = "simpleNoteLexeme ::= . 'C'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_544] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_544] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_544] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_544] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_545] = "simpleNoteLexeme ::= 'C'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_545] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_545] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_545] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_546] = "simpleNoteLexeme ::= 'C'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_546] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_546] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_546] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_546] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_546] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_546] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_548] = "simpleNoteLexeme ::= . 'C#'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_548] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_548] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_548] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_548] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_549] = "simpleNoteLexeme ::= 'C#'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_549] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_549] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_549] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_550] = "simpleNoteLexeme ::= 'C#'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_550] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_550] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_550] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_550] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_550] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_550] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_552] = "simpleNoteLexeme ::= . 'Db'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_552] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_552] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_552] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_552] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_553] = "simpleNoteLexeme ::= 'Db'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_553] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_553] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_553] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_554] = "simpleNoteLexeme ::= 'Db'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_554] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_554] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_554] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_554] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_554] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_554] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_556] = "simpleNoteLexeme ::= . 'D'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_556] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_556] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_556] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_556] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_557] = "simpleNoteLexeme ::= 'D'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_557] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_557] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_557] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_558] = "simpleNoteLexeme ::= 'D'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_558] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_558] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_558] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_558] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_558] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_558] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_560] = "simpleNoteLexeme ::= . 'D#'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_560] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_560] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_560] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_560] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_561] = "simpleNoteLexeme ::= 'D#'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_561] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_561] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_561] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_562] = "simpleNoteLexeme ::= 'D#'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_562] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_562] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_562] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_562] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_562] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_562] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_564] = "simpleNoteLexeme ::= . 'Eb'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_564] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_564] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_564] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_564] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_565] = "simpleNoteLexeme ::= 'Eb'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_565] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_565] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_565] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_566] = "simpleNoteLexeme ::= 'Eb'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_566] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_566] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_566] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_566] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_566] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_566] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_568] = "simpleNoteLexeme ::= . 'E'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_568] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_568] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_568] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_568] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_569] = "simpleNoteLexeme ::= 'E'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_569] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_569] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_569] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_570] = "simpleNoteLexeme ::= 'E'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_570] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_570] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_570] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_570] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_570] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_570] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_572] = "simpleNoteLexeme ::= . 'F'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_572] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_572] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_572] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_572] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_573] = "simpleNoteLexeme ::= 'F'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_573] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_573] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_573] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_574] = "simpleNoteLexeme ::= 'F'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_574] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_574] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_574] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_574] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_574] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_574] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_576] = "simpleNoteLexeme ::= . 'F#'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_576] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_576] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_576] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_576] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_577] = "simpleNoteLexeme ::= 'F#'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_577] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_577] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_577] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_578] = "simpleNoteLexeme ::= 'F#'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_578] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_578] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_578] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_578] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_578] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_578] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_580] = "simpleNoteLexeme ::= . 'Gb'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_580] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_580] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_580] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_580] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_581] = "simpleNoteLexeme ::= 'Gb'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_581] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_581] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_581] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_582] = "simpleNoteLexeme ::= 'Gb'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_582] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_582] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_582] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_582] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_582] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_582] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_584] = "simpleNoteLexeme ::= . 'G'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_584] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_584] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_584] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_584] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_585] = "simpleNoteLexeme ::= 'G'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_585] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_585] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_585] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_586] = "simpleNoteLexeme ::= 'G'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_586] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_586] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_586] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_586] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_586] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_586] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_588] = "simpleNoteLexeme ::= . 'G#'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_588] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_588] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_588] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_simpleNoteLexeme_588] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_589] = "simpleNoteLexeme ::= 'G#'  ";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_589] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_589] = ARTL_ART_simpleNoteLexeme;
    artPopD[ARTL_ART_simpleNoteLexeme_589] = true;
    artLabelInternalStrings[ARTL_ART_simpleNoteLexeme_590] = "simpleNoteLexeme ::= 'G#'  .";
    artLabelStrings[ARTL_ART_simpleNoteLexeme_590] = "";
    artlhsL[ARTL_ART_simpleNoteLexeme_590] = ARTL_ART_simpleNoteLexeme;
    artKindOfs[ARTL_ART_simpleNoteLexeme_590] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_simpleNoteLexeme_590] = true;
    arteoR_pL[ARTL_ART_simpleNoteLexeme_590] = true;
    artPopD[ARTL_ART_simpleNoteLexeme_590] = true;
  }

  public void artTableInitialiser_ART_statement() {
    artLabelInternalStrings[ARTL_ART_statement] = "statement";
    artLabelStrings[ARTL_ART_statement] = "statement";
    artKindOfs[ARTL_ART_statement] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_statement_14] = "statement ::= . ID ':='  subExpr ';'  ";
    artLabelStrings[ARTL_ART_statement_14] = "";
    artlhsL[ARTL_ART_statement_14] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_14] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_16] = "statement ::= ID . ':='  subExpr ';'  ";
    artLabelStrings[ARTL_ART_statement_16] = "";
    artlhsL[ARTL_ART_statement_16] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_16] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_statement_16] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statement_16] = true;
    artLabelInternalStrings[ARTL_ART_statement_17] = "statement ::= ID ':='  subExpr ';'  ";
    artLabelStrings[ARTL_ART_statement_17] = "";
    artlhsL[ARTL_ART_statement_17] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_18] = "statement ::= ID ':='  . subExpr ';'  ";
    artLabelStrings[ARTL_ART_statement_18] = "";
    artlhsL[ARTL_ART_statement_18] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_18] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_20] = "statement ::= ID ':='  subExpr . ';'  ";
    artLabelStrings[ARTL_ART_statement_20] = "";
    artlhsL[ARTL_ART_statement_20] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_20] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_statement_20] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_20] = true;
    artLabelInternalStrings[ARTL_ART_statement_21] = "statement ::= ID ':='  subExpr ';'  ";
    artLabelStrings[ARTL_ART_statement_21] = "";
    artlhsL[ARTL_ART_statement_21] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_21] = true;
    artLabelInternalStrings[ARTL_ART_statement_22] = "statement ::= ID ':='  subExpr ';'  .";
    artLabelStrings[ARTL_ART_statement_22] = "";
    artlhsL[ARTL_ART_statement_22] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_22] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_22] = true;
    arteoR_pL[ARTL_ART_statement_22] = true;
    artPopD[ARTL_ART_statement_22] = true;
    artLabelInternalStrings[ARTL_ART_statement_26] = "statement ::= . 'if'  relExpr statement 'else'  statement ";
    artLabelStrings[ARTL_ART_statement_26] = "";
    artlhsL[ARTL_ART_statement_26] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_26] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_27] = "statement ::= 'if'  relExpr statement 'else'  statement ";
    artLabelStrings[ARTL_ART_statement_27] = "";
    artlhsL[ARTL_ART_statement_27] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_28] = "statement ::= 'if'  . relExpr statement 'else'  statement ";
    artLabelStrings[ARTL_ART_statement_28] = "";
    artlhsL[ARTL_ART_statement_28] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_28] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statement_28] = true;
    artLabelInternalStrings[ARTL_ART_statement_30] = "statement ::= 'if'  relExpr . statement 'else'  statement ";
    artLabelStrings[ARTL_ART_statement_30] = "";
    artlhsL[ARTL_ART_statement_30] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_30] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_statement_30] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_32] = "statement ::= 'if'  relExpr statement . 'else'  statement ";
    artLabelStrings[ARTL_ART_statement_32] = "";
    artlhsL[ARTL_ART_statement_32] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_32] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_32] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_33] = "statement ::= 'if'  relExpr statement 'else'  statement ";
    artLabelStrings[ARTL_ART_statement_33] = "";
    artlhsL[ARTL_ART_statement_33] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_34] = "statement ::= 'if'  relExpr statement 'else'  . statement ";
    artLabelStrings[ARTL_ART_statement_34] = "";
    artlhsL[ARTL_ART_statement_34] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_34] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_36] = "statement ::= 'if'  relExpr statement 'else'  statement .";
    artLabelStrings[ARTL_ART_statement_36] = "";
    artlhsL[ARTL_ART_statement_36] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_36] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_36] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_36] = true;
    arteoR_pL[ARTL_ART_statement_36] = true;
    artPopD[ARTL_ART_statement_36] = true;
    artLabelInternalStrings[ARTL_ART_statement_40] = "statement ::= . 'while'  relExpr statement ";
    artLabelStrings[ARTL_ART_statement_40] = "";
    artlhsL[ARTL_ART_statement_40] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_40] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_41] = "statement ::= 'while'  relExpr statement ";
    artLabelStrings[ARTL_ART_statement_41] = "";
    artlhsL[ARTL_ART_statement_41] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_42] = "statement ::= 'while'  . relExpr statement ";
    artLabelStrings[ARTL_ART_statement_42] = "";
    artlhsL[ARTL_ART_statement_42] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_42] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statement_42] = true;
    artLabelInternalStrings[ARTL_ART_statement_44] = "statement ::= 'while'  relExpr . statement ";
    artLabelStrings[ARTL_ART_statement_44] = "";
    artlhsL[ARTL_ART_statement_44] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_44] = ARTL_ART_relExpr;
    artKindOfs[ARTL_ART_statement_44] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_46] = "statement ::= 'while'  relExpr statement .";
    artLabelStrings[ARTL_ART_statement_46] = "";
    artlhsL[ARTL_ART_statement_46] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_46] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_46] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_46] = true;
    arteoR_pL[ARTL_ART_statement_46] = true;
    artPopD[ARTL_ART_statement_46] = true;
    artLabelInternalStrings[ARTL_ART_statement_50] = "statement ::= . 'melody'  ID '{'  STRING_DQ '}'  ";
    artLabelStrings[ARTL_ART_statement_50] = "";
    artlhsL[ARTL_ART_statement_50] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_50] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_51] = "statement ::= 'melody'  ID '{'  STRING_DQ '}'  ";
    artLabelStrings[ARTL_ART_statement_51] = "";
    artlhsL[ARTL_ART_statement_51] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_52] = "statement ::= 'melody'  . ID '{'  STRING_DQ '}'  ";
    artLabelStrings[ARTL_ART_statement_52] = "";
    artlhsL[ARTL_ART_statement_52] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_52] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statement_52] = true;
    artLabelInternalStrings[ARTL_ART_statement_54] = "statement ::= 'melody'  ID . '{'  STRING_DQ '}'  ";
    artLabelStrings[ARTL_ART_statement_54] = "";
    artlhsL[ARTL_ART_statement_54] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_54] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_statement_54] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_55] = "statement ::= 'melody'  ID '{'  STRING_DQ '}'  ";
    artLabelStrings[ARTL_ART_statement_55] = "";
    artlhsL[ARTL_ART_statement_55] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_56] = "statement ::= 'melody'  ID '{'  . STRING_DQ '}'  ";
    artLabelStrings[ARTL_ART_statement_56] = "";
    artlhsL[ARTL_ART_statement_56] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_56] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_58] = "statement ::= 'melody'  ID '{'  STRING_DQ . '}'  ";
    artLabelStrings[ARTL_ART_statement_58] = "";
    artlhsL[ARTL_ART_statement_58] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_58] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_statement_58] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_58] = true;
    artLabelInternalStrings[ARTL_ART_statement_59] = "statement ::= 'melody'  ID '{'  STRING_DQ '}'  ";
    artLabelStrings[ARTL_ART_statement_59] = "";
    artlhsL[ARTL_ART_statement_59] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_59] = true;
    artLabelInternalStrings[ARTL_ART_statement_60] = "statement ::= 'melody'  ID '{'  STRING_DQ '}'  .";
    artLabelStrings[ARTL_ART_statement_60] = "";
    artlhsL[ARTL_ART_statement_60] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_60] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_60] = true;
    arteoR_pL[ARTL_ART_statement_60] = true;
    artPopD[ARTL_ART_statement_60] = true;
    artLabelInternalStrings[ARTL_ART_statement_64] = "statement ::= . 'repeatNote'  '('  STRING_DQ ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_64] = "";
    artlhsL[ARTL_ART_statement_64] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_64] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_65] = "statement ::= 'repeatNote'  '('  STRING_DQ ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_65] = "";
    artlhsL[ARTL_ART_statement_65] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_66] = "statement ::= 'repeatNote'  . '('  STRING_DQ ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_66] = "";
    artlhsL[ARTL_ART_statement_66] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_66] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statement_66] = true;
    artLabelInternalStrings[ARTL_ART_statement_67] = "statement ::= 'repeatNote'  '('  STRING_DQ ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_67] = "";
    artlhsL[ARTL_ART_statement_67] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_68] = "statement ::= 'repeatNote'  '('  . STRING_DQ ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_68] = "";
    artlhsL[ARTL_ART_statement_68] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_68] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_70] = "statement ::= 'repeatNote'  '('  STRING_DQ . ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_70] = "";
    artlhsL[ARTL_ART_statement_70] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_70] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_statement_70] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_71] = "statement ::= 'repeatNote'  '('  STRING_DQ ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_71] = "";
    artlhsL[ARTL_ART_statement_71] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_72] = "statement ::= 'repeatNote'  '('  STRING_DQ ','  . subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_72] = "";
    artlhsL[ARTL_ART_statement_72] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_72] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_74] = "statement ::= 'repeatNote'  '('  STRING_DQ ','  subExpr . ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_74] = "";
    artlhsL[ARTL_ART_statement_74] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_74] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_statement_74] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_74] = true;
    artLabelInternalStrings[ARTL_ART_statement_75] = "statement ::= 'repeatNote'  '('  STRING_DQ ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_75] = "";
    artlhsL[ARTL_ART_statement_75] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_75] = true;
    artLabelInternalStrings[ARTL_ART_statement_76] = "statement ::= 'repeatNote'  '('  STRING_DQ ','  subExpr ')'  . ';'  ";
    artLabelStrings[ARTL_ART_statement_76] = "";
    artlhsL[ARTL_ART_statement_76] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_76] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_76] = true;
    artLabelInternalStrings[ARTL_ART_statement_77] = "statement ::= 'repeatNote'  '('  STRING_DQ ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_77] = "";
    artlhsL[ARTL_ART_statement_77] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_77] = true;
    artLabelInternalStrings[ARTL_ART_statement_78] = "statement ::= 'repeatNote'  '('  STRING_DQ ','  subExpr ')'  ';'  .";
    artLabelStrings[ARTL_ART_statement_78] = "";
    artlhsL[ARTL_ART_statement_78] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_78] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_78] = true;
    arteoR_pL[ARTL_ART_statement_78] = true;
    artPopD[ARTL_ART_statement_78] = true;
    artLabelInternalStrings[ARTL_ART_statement_82] = "statement ::= . 'play'  ID ';'  ";
    artLabelStrings[ARTL_ART_statement_82] = "";
    artlhsL[ARTL_ART_statement_82] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_82] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_83] = "statement ::= 'play'  ID ';'  ";
    artLabelStrings[ARTL_ART_statement_83] = "";
    artlhsL[ARTL_ART_statement_83] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_84] = "statement ::= 'play'  . ID ';'  ";
    artLabelStrings[ARTL_ART_statement_84] = "";
    artlhsL[ARTL_ART_statement_84] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_84] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statement_84] = true;
    artLabelInternalStrings[ARTL_ART_statement_86] = "statement ::= 'play'  ID . ';'  ";
    artLabelStrings[ARTL_ART_statement_86] = "";
    artlhsL[ARTL_ART_statement_86] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_86] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_statement_86] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_86] = true;
    artLabelInternalStrings[ARTL_ART_statement_87] = "statement ::= 'play'  ID ';'  ";
    artLabelStrings[ARTL_ART_statement_87] = "";
    artlhsL[ARTL_ART_statement_87] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_87] = true;
    artLabelInternalStrings[ARTL_ART_statement_88] = "statement ::= 'play'  ID ';'  .";
    artLabelStrings[ARTL_ART_statement_88] = "";
    artlhsL[ARTL_ART_statement_88] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_88] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_88] = true;
    arteoR_pL[ARTL_ART_statement_88] = true;
    artPopD[ARTL_ART_statement_88] = true;
    artLabelInternalStrings[ARTL_ART_statement_92] = "statement ::= . '{'  statements '}'  ";
    artLabelStrings[ARTL_ART_statement_92] = "";
    artlhsL[ARTL_ART_statement_92] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_92] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_93] = "statement ::= '{'  statements '}'  ";
    artLabelStrings[ARTL_ART_statement_93] = "";
    artlhsL[ARTL_ART_statement_93] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_94] = "statement ::= '{'  . statements '}'  ";
    artLabelStrings[ARTL_ART_statement_94] = "";
    artlhsL[ARTL_ART_statement_94] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_94] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statement_94] = true;
    artLabelInternalStrings[ARTL_ART_statement_96] = "statement ::= '{'  statements . '}'  ";
    artLabelStrings[ARTL_ART_statement_96] = "";
    artlhsL[ARTL_ART_statement_96] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_96] = ARTL_ART_statements;
    artKindOfs[ARTL_ART_statement_96] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_96] = true;
    artLabelInternalStrings[ARTL_ART_statement_97] = "statement ::= '{'  statements '}'  ";
    artLabelStrings[ARTL_ART_statement_97] = "";
    artlhsL[ARTL_ART_statement_97] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_97] = true;
    artLabelInternalStrings[ARTL_ART_statement_98] = "statement ::= '{'  statements '}'  .";
    artLabelStrings[ARTL_ART_statement_98] = "";
    artlhsL[ARTL_ART_statement_98] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_98] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_98] = true;
    arteoR_pL[ARTL_ART_statement_98] = true;
    artPopD[ARTL_ART_statement_98] = true;
    artLabelInternalStrings[ARTL_ART_statement_100] = "statement ::= . 'mix'  '('  ID ','  ID ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_100] = "";
    artlhsL[ARTL_ART_statement_100] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_100] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_101] = "statement ::= 'mix'  '('  ID ','  ID ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_101] = "";
    artlhsL[ARTL_ART_statement_101] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_102] = "statement ::= 'mix'  . '('  ID ','  ID ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_102] = "";
    artlhsL[ARTL_ART_statement_102] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_102] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statement_102] = true;
    artLabelInternalStrings[ARTL_ART_statement_103] = "statement ::= 'mix'  '('  ID ','  ID ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_103] = "";
    artlhsL[ARTL_ART_statement_103] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_104] = "statement ::= 'mix'  '('  . ID ','  ID ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_104] = "";
    artlhsL[ARTL_ART_statement_104] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_104] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_106] = "statement ::= 'mix'  '('  ID . ','  ID ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_106] = "";
    artlhsL[ARTL_ART_statement_106] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_106] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_statement_106] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_107] = "statement ::= 'mix'  '('  ID ','  ID ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_107] = "";
    artlhsL[ARTL_ART_statement_107] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_108] = "statement ::= 'mix'  '('  ID ','  . ID ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_108] = "";
    artlhsL[ARTL_ART_statement_108] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_108] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_110] = "statement ::= 'mix'  '('  ID ','  ID . ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_110] = "";
    artlhsL[ARTL_ART_statement_110] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_110] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_statement_110] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_110] = true;
    artLabelInternalStrings[ARTL_ART_statement_111] = "statement ::= 'mix'  '('  ID ','  ID ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_111] = "";
    artlhsL[ARTL_ART_statement_111] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_111] = true;
    artLabelInternalStrings[ARTL_ART_statement_112] = "statement ::= 'mix'  '('  ID ','  ID ')'  . ';'  ";
    artLabelStrings[ARTL_ART_statement_112] = "";
    artlhsL[ARTL_ART_statement_112] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_112] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_112] = true;
    artLabelInternalStrings[ARTL_ART_statement_113] = "statement ::= 'mix'  '('  ID ','  ID ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_113] = "";
    artlhsL[ARTL_ART_statement_113] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_113] = true;
    artLabelInternalStrings[ARTL_ART_statement_114] = "statement ::= 'mix'  '('  ID ','  ID ')'  ';'  .";
    artLabelStrings[ARTL_ART_statement_114] = "";
    artlhsL[ARTL_ART_statement_114] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_114] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_114] = true;
    arteoR_pL[ARTL_ART_statement_114] = true;
    artPopD[ARTL_ART_statement_114] = true;
    artLabelInternalStrings[ARTL_ART_statement_118] = "statement ::= . ID STRING_DQ ';'  ";
    artLabelStrings[ARTL_ART_statement_118] = "";
    artlhsL[ARTL_ART_statement_118] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_118] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_120] = "statement ::= ID . STRING_DQ ';'  ";
    artLabelStrings[ARTL_ART_statement_120] = "";
    artlhsL[ARTL_ART_statement_120] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_120] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_statement_120] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statement_120] = true;
    artLabelInternalStrings[ARTL_ART_statement_122] = "statement ::= ID STRING_DQ . ';'  ";
    artLabelStrings[ARTL_ART_statement_122] = "";
    artlhsL[ARTL_ART_statement_122] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_122] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_statement_122] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_122] = true;
    artLabelInternalStrings[ARTL_ART_statement_123] = "statement ::= ID STRING_DQ ';'  ";
    artLabelStrings[ARTL_ART_statement_123] = "";
    artlhsL[ARTL_ART_statement_123] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_123] = true;
    artLabelInternalStrings[ARTL_ART_statement_124] = "statement ::= ID STRING_DQ ';'  .";
    artLabelStrings[ARTL_ART_statement_124] = "";
    artlhsL[ARTL_ART_statement_124] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_124] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_124] = true;
    arteoR_pL[ARTL_ART_statement_124] = true;
    artPopD[ARTL_ART_statement_124] = true;
    artLabelInternalStrings[ARTL_ART_statement_126] = "statement ::= . 'backingtrack'  '('  ID ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_126] = "";
    artlhsL[ARTL_ART_statement_126] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_126] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_127] = "statement ::= 'backingtrack'  '('  ID ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_127] = "";
    artlhsL[ARTL_ART_statement_127] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_128] = "statement ::= 'backingtrack'  . '('  ID ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_128] = "";
    artlhsL[ARTL_ART_statement_128] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_128] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statement_128] = true;
    artLabelInternalStrings[ARTL_ART_statement_129] = "statement ::= 'backingtrack'  '('  ID ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_129] = "";
    artlhsL[ARTL_ART_statement_129] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_130] = "statement ::= 'backingtrack'  '('  . ID ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_130] = "";
    artlhsL[ARTL_ART_statement_130] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_130] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_132] = "statement ::= 'backingtrack'  '('  ID . ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_132] = "";
    artlhsL[ARTL_ART_statement_132] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_132] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_statement_132] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_133] = "statement ::= 'backingtrack'  '('  ID ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_133] = "";
    artlhsL[ARTL_ART_statement_133] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_134] = "statement ::= 'backingtrack'  '('  ID ','  . subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_134] = "";
    artlhsL[ARTL_ART_statement_134] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_134] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_136] = "statement ::= 'backingtrack'  '('  ID ','  subExpr . ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_136] = "";
    artlhsL[ARTL_ART_statement_136] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_136] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_statement_136] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_136] = true;
    artLabelInternalStrings[ARTL_ART_statement_137] = "statement ::= 'backingtrack'  '('  ID ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_137] = "";
    artlhsL[ARTL_ART_statement_137] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_137] = true;
    artLabelInternalStrings[ARTL_ART_statement_138] = "statement ::= 'backingtrack'  '('  ID ','  subExpr ')'  . ';'  ";
    artLabelStrings[ARTL_ART_statement_138] = "";
    artlhsL[ARTL_ART_statement_138] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_138] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_138] = true;
    artLabelInternalStrings[ARTL_ART_statement_139] = "statement ::= 'backingtrack'  '('  ID ','  subExpr ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_139] = "";
    artlhsL[ARTL_ART_statement_139] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_139] = true;
    artLabelInternalStrings[ARTL_ART_statement_140] = "statement ::= 'backingtrack'  '('  ID ','  subExpr ')'  ';'  .";
    artLabelStrings[ARTL_ART_statement_140] = "";
    artlhsL[ARTL_ART_statement_140] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_140] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_140] = true;
    arteoR_pL[ARTL_ART_statement_140] = true;
    artPopD[ARTL_ART_statement_140] = true;
    artLabelInternalStrings[ARTL_ART_statement_144] = "statement ::= . 'scale'  '('  STRING_DQ ','  STRING_DQ ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_144] = "";
    artlhsL[ARTL_ART_statement_144] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_144] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_145] = "statement ::= 'scale'  '('  STRING_DQ ','  STRING_DQ ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_145] = "";
    artlhsL[ARTL_ART_statement_145] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_146] = "statement ::= 'scale'  . '('  STRING_DQ ','  STRING_DQ ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_146] = "";
    artlhsL[ARTL_ART_statement_146] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_146] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statement_146] = true;
    artLabelInternalStrings[ARTL_ART_statement_147] = "statement ::= 'scale'  '('  STRING_DQ ','  STRING_DQ ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_147] = "";
    artlhsL[ARTL_ART_statement_147] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_148] = "statement ::= 'scale'  '('  . STRING_DQ ','  STRING_DQ ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_148] = "";
    artlhsL[ARTL_ART_statement_148] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_148] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_150] = "statement ::= 'scale'  '('  STRING_DQ . ','  STRING_DQ ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_150] = "";
    artlhsL[ARTL_ART_statement_150] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_150] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_statement_150] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_151] = "statement ::= 'scale'  '('  STRING_DQ ','  STRING_DQ ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_151] = "";
    artlhsL[ARTL_ART_statement_151] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_152] = "statement ::= 'scale'  '('  STRING_DQ ','  . STRING_DQ ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_152] = "";
    artlhsL[ARTL_ART_statement_152] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_152] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_154] = "statement ::= 'scale'  '('  STRING_DQ ','  STRING_DQ . ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_154] = "";
    artlhsL[ARTL_ART_statement_154] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_154] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_statement_154] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_154] = true;
    artLabelInternalStrings[ARTL_ART_statement_155] = "statement ::= 'scale'  '('  STRING_DQ ','  STRING_DQ ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_155] = "";
    artlhsL[ARTL_ART_statement_155] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_155] = true;
    artLabelInternalStrings[ARTL_ART_statement_156] = "statement ::= 'scale'  '('  STRING_DQ ','  STRING_DQ ')'  . ';'  ";
    artLabelStrings[ARTL_ART_statement_156] = "";
    artlhsL[ARTL_ART_statement_156] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_156] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_156] = true;
    artLabelInternalStrings[ARTL_ART_statement_157] = "statement ::= 'scale'  '('  STRING_DQ ','  STRING_DQ ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_157] = "";
    artlhsL[ARTL_ART_statement_157] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_157] = true;
    artLabelInternalStrings[ARTL_ART_statement_158] = "statement ::= 'scale'  '('  STRING_DQ ','  STRING_DQ ')'  ';'  .";
    artLabelStrings[ARTL_ART_statement_158] = "";
    artlhsL[ARTL_ART_statement_158] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_158] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_158] = true;
    arteoR_pL[ARTL_ART_statement_158] = true;
    artPopD[ARTL_ART_statement_158] = true;
    artLabelInternalStrings[ARTL_ART_statement_162] = "statement ::= . 'arpeggio'  '('  STRING_DQ ','  STRING_DQ ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_162] = "";
    artlhsL[ARTL_ART_statement_162] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_162] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_163] = "statement ::= 'arpeggio'  '('  STRING_DQ ','  STRING_DQ ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_163] = "";
    artlhsL[ARTL_ART_statement_163] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_164] = "statement ::= 'arpeggio'  . '('  STRING_DQ ','  STRING_DQ ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_164] = "";
    artlhsL[ARTL_ART_statement_164] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_164] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statement_164] = true;
    artLabelInternalStrings[ARTL_ART_statement_165] = "statement ::= 'arpeggio'  '('  STRING_DQ ','  STRING_DQ ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_165] = "";
    artlhsL[ARTL_ART_statement_165] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_166] = "statement ::= 'arpeggio'  '('  . STRING_DQ ','  STRING_DQ ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_166] = "";
    artlhsL[ARTL_ART_statement_166] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_166] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_168] = "statement ::= 'arpeggio'  '('  STRING_DQ . ','  STRING_DQ ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_168] = "";
    artlhsL[ARTL_ART_statement_168] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_168] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_statement_168] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_169] = "statement ::= 'arpeggio'  '('  STRING_DQ ','  STRING_DQ ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_169] = "";
    artlhsL[ARTL_ART_statement_169] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_170] = "statement ::= 'arpeggio'  '('  STRING_DQ ','  . STRING_DQ ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_170] = "";
    artlhsL[ARTL_ART_statement_170] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_170] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_172] = "statement ::= 'arpeggio'  '('  STRING_DQ ','  STRING_DQ . ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_172] = "";
    artlhsL[ARTL_ART_statement_172] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_172] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_statement_172] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_172] = true;
    artLabelInternalStrings[ARTL_ART_statement_173] = "statement ::= 'arpeggio'  '('  STRING_DQ ','  STRING_DQ ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_173] = "";
    artlhsL[ARTL_ART_statement_173] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_173] = true;
    artLabelInternalStrings[ARTL_ART_statement_174] = "statement ::= 'arpeggio'  '('  STRING_DQ ','  STRING_DQ ')'  . ';'  ";
    artLabelStrings[ARTL_ART_statement_174] = "";
    artlhsL[ARTL_ART_statement_174] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_174] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_174] = true;
    artLabelInternalStrings[ARTL_ART_statement_175] = "statement ::= 'arpeggio'  '('  STRING_DQ ','  STRING_DQ ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_175] = "";
    artlhsL[ARTL_ART_statement_175] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_175] = true;
    artLabelInternalStrings[ARTL_ART_statement_176] = "statement ::= 'arpeggio'  '('  STRING_DQ ','  STRING_DQ ')'  ';'  .";
    artLabelStrings[ARTL_ART_statement_176] = "";
    artlhsL[ARTL_ART_statement_176] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_176] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_176] = true;
    arteoR_pL[ARTL_ART_statement_176] = true;
    artPopD[ARTL_ART_statement_176] = true;
    artLabelInternalStrings[ARTL_ART_statement_180] = "statement ::= . 'print'  '('  printElements ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_180] = "";
    artlhsL[ARTL_ART_statement_180] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_180] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_181] = "statement ::= 'print'  '('  printElements ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_181] = "";
    artlhsL[ARTL_ART_statement_181] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_182] = "statement ::= 'print'  . '('  printElements ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_182] = "";
    artlhsL[ARTL_ART_statement_182] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_182] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statement_182] = true;
    artLabelInternalStrings[ARTL_ART_statement_183] = "statement ::= 'print'  '('  printElements ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_183] = "";
    artlhsL[ARTL_ART_statement_183] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_184] = "statement ::= 'print'  '('  . printElements ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_184] = "";
    artlhsL[ARTL_ART_statement_184] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_184] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_186] = "statement ::= 'print'  '('  printElements . ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_186] = "";
    artlhsL[ARTL_ART_statement_186] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_186] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_statement_186] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_186] = true;
    artLabelInternalStrings[ARTL_ART_statement_187] = "statement ::= 'print'  '('  printElements ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_187] = "";
    artlhsL[ARTL_ART_statement_187] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_187] = true;
    artLabelInternalStrings[ARTL_ART_statement_188] = "statement ::= 'print'  '('  printElements ')'  . ';'  ";
    artLabelStrings[ARTL_ART_statement_188] = "";
    artlhsL[ARTL_ART_statement_188] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_188] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_188] = true;
    artLabelInternalStrings[ARTL_ART_statement_189] = "statement ::= 'print'  '('  printElements ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_189] = "";
    artlhsL[ARTL_ART_statement_189] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_189] = true;
    artLabelInternalStrings[ARTL_ART_statement_190] = "statement ::= 'print'  '('  printElements ')'  ';'  .";
    artLabelStrings[ARTL_ART_statement_190] = "";
    artlhsL[ARTL_ART_statement_190] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_190] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_190] = true;
    arteoR_pL[ARTL_ART_statement_190] = true;
    artPopD[ARTL_ART_statement_190] = true;
    artLabelInternalStrings[ARTL_ART_statement_192] = "statement ::= . bpm ";
    artLabelStrings[ARTL_ART_statement_192] = "";
    artlhsL[ARTL_ART_statement_192] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_192] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_194] = "statement ::= bpm .";
    artLabelStrings[ARTL_ART_statement_194] = "";
    artlhsL[ARTL_ART_statement_194] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_194] = ARTL_ART_bpm;
    artKindOfs[ARTL_ART_statement_194] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_194] = true;
    arteoR_pL[ARTL_ART_statement_194] = true;
    artPopD[ARTL_ART_statement_194] = true;
    artLabelInternalStrings[ARTL_ART_statement_196] = "statement ::= . octave ";
    artLabelStrings[ARTL_ART_statement_196] = "";
    artlhsL[ARTL_ART_statement_196] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_196] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_198] = "statement ::= octave .";
    artLabelStrings[ARTL_ART_statement_198] = "";
    artlhsL[ARTL_ART_statement_198] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_198] = ARTL_ART_octave;
    artKindOfs[ARTL_ART_statement_198] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_198] = true;
    arteoR_pL[ARTL_ART_statement_198] = true;
    artPopD[ARTL_ART_statement_198] = true;
    artLabelInternalStrings[ARTL_ART_statement_200] = "statement ::= . note ";
    artLabelStrings[ARTL_ART_statement_200] = "";
    artlhsL[ARTL_ART_statement_200] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_200] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_202] = "statement ::= note .";
    artLabelStrings[ARTL_ART_statement_202] = "";
    artlhsL[ARTL_ART_statement_202] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_202] = ARTL_ART_note;
    artKindOfs[ARTL_ART_statement_202] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_202] = true;
    arteoR_pL[ARTL_ART_statement_202] = true;
    artPopD[ARTL_ART_statement_202] = true;
    artLabelInternalStrings[ARTL_ART_statement_204] = "statement ::= . chord ";
    artLabelStrings[ARTL_ART_statement_204] = "";
    artlhsL[ARTL_ART_statement_204] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_204] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_206] = "statement ::= chord .";
    artLabelStrings[ARTL_ART_statement_206] = "";
    artlhsL[ARTL_ART_statement_206] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_206] = ARTL_ART_chord;
    artKindOfs[ARTL_ART_statement_206] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_206] = true;
    arteoR_pL[ARTL_ART_statement_206] = true;
    artPopD[ARTL_ART_statement_206] = true;
    artLabelInternalStrings[ARTL_ART_statement_208] = "statement ::= . rest ";
    artLabelStrings[ARTL_ART_statement_208] = "";
    artlhsL[ARTL_ART_statement_208] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_208] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_210] = "statement ::= rest .";
    artLabelStrings[ARTL_ART_statement_210] = "";
    artlhsL[ARTL_ART_statement_210] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_210] = ARTL_ART_rest;
    artKindOfs[ARTL_ART_statement_210] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_210] = true;
    arteoR_pL[ARTL_ART_statement_210] = true;
    artPopD[ARTL_ART_statement_210] = true;
    artLabelInternalStrings[ARTL_ART_statement_212] = "statement ::= . instrument ";
    artLabelStrings[ARTL_ART_statement_212] = "";
    artlhsL[ARTL_ART_statement_212] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_212] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_214] = "statement ::= instrument .";
    artLabelStrings[ARTL_ART_statement_214] = "";
    artlhsL[ARTL_ART_statement_214] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_214] = ARTL_ART_instrument;
    artKindOfs[ARTL_ART_statement_214] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_214] = true;
    arteoR_pL[ARTL_ART_statement_214] = true;
    artPopD[ARTL_ART_statement_214] = true;
    artLabelInternalStrings[ARTL_ART_statement_216] = "statement ::= . volume ";
    artLabelStrings[ARTL_ART_statement_216] = "";
    artlhsL[ARTL_ART_statement_216] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_216] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_218] = "statement ::= volume .";
    artLabelStrings[ARTL_ART_statement_218] = "";
    artlhsL[ARTL_ART_statement_218] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_218] = ARTL_ART_volume;
    artKindOfs[ARTL_ART_statement_218] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_218] = true;
    arteoR_pL[ARTL_ART_statement_218] = true;
    artPopD[ARTL_ART_statement_218] = true;
    artLabelInternalStrings[ARTL_ART_statement_220] = "statement ::= . beatRatio ";
    artLabelStrings[ARTL_ART_statement_220] = "";
    artlhsL[ARTL_ART_statement_220] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_220] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_222] = "statement ::= beatRatio .";
    artLabelStrings[ARTL_ART_statement_222] = "";
    artlhsL[ARTL_ART_statement_222] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_222] = ARTL_ART_beatRatio;
    artKindOfs[ARTL_ART_statement_222] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_222] = true;
    arteoR_pL[ARTL_ART_statement_222] = true;
    artPopD[ARTL_ART_statement_222] = true;
  }

  public void artTableInitialiser_ART_statements() {
    artLabelInternalStrings[ARTL_ART_statements] = "statements";
    artLabelStrings[ARTL_ART_statements] = "statements";
    artKindOfs[ARTL_ART_statements] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_statements_2] = "statements ::= . statement ";
    artLabelStrings[ARTL_ART_statements_2] = "";
    artlhsL[ARTL_ART_statements_2] = ARTL_ART_statements;
    artKindOfs[ARTL_ART_statements_2] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statements_4] = "statements ::= statement .";
    artLabelStrings[ARTL_ART_statements_4] = "";
    artlhsL[ARTL_ART_statements_4] = ARTL_ART_statements;
    artSlotInstanceOfs[ARTL_ART_statements_4] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statements_4] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statements_4] = true;
    arteoR_pL[ARTL_ART_statements_4] = true;
    artPopD[ARTL_ART_statements_4] = true;
    artLabelInternalStrings[ARTL_ART_statements_8] = "statements ::= . statement statements ";
    artLabelStrings[ARTL_ART_statements_8] = "";
    artlhsL[ARTL_ART_statements_8] = ARTL_ART_statements;
    artKindOfs[ARTL_ART_statements_8] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statements_10] = "statements ::= statement . statements ";
    artLabelStrings[ARTL_ART_statements_10] = "";
    artlhsL[ARTL_ART_statements_10] = ARTL_ART_statements;
    artSlotInstanceOfs[ARTL_ART_statements_10] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statements_10] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statements_10] = true;
    artLabelInternalStrings[ARTL_ART_statements_12] = "statements ::= statement statements .";
    artLabelStrings[ARTL_ART_statements_12] = "";
    artlhsL[ARTL_ART_statements_12] = ARTL_ART_statements;
    artSlotInstanceOfs[ARTL_ART_statements_12] = ARTL_ART_statements;
    artKindOfs[ARTL_ART_statements_12] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statements_12] = true;
    arteoR_pL[ARTL_ART_statements_12] = true;
    artPopD[ARTL_ART_statements_12] = true;
  }

  public void artTableInitialiser_ART_subExpr() {
    artLabelInternalStrings[ARTL_ART_subExpr] = "subExpr";
    artLabelStrings[ARTL_ART_subExpr] = "subExpr";
    artKindOfs[ARTL_ART_subExpr] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_subExpr_290] = "subExpr ::= . operand ";
    artLabelStrings[ARTL_ART_subExpr_290] = "";
    artlhsL[ARTL_ART_subExpr_290] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_290] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExpr_292] = "subExpr ::= operand .";
    artLabelStrings[ARTL_ART_subExpr_292] = "";
    artlhsL[ARTL_ART_subExpr_292] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_292] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_subExpr_292] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_292] = true;
    arteoR_pL[ARTL_ART_subExpr_292] = true;
    artPopD[ARTL_ART_subExpr_292] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_296] = "subExpr ::= . subExpr '-'  operand ";
    artLabelStrings[ARTL_ART_subExpr_296] = "";
    artlhsL[ARTL_ART_subExpr_296] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_296] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExpr_298] = "subExpr ::= subExpr . '-'  operand ";
    artLabelStrings[ARTL_ART_subExpr_298] = "";
    artlhsL[ARTL_ART_subExpr_298] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_298] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_298] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_subExpr_298] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_299] = "subExpr ::= subExpr '-'  operand ";
    artLabelStrings[ARTL_ART_subExpr_299] = "";
    artlhsL[ARTL_ART_subExpr_299] = ARTL_ART_subExpr;
    artLabelInternalStrings[ARTL_ART_subExpr_300] = "subExpr ::= subExpr '-'  . operand ";
    artLabelStrings[ARTL_ART_subExpr_300] = "";
    artlhsL[ARTL_ART_subExpr_300] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_300] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExpr_302] = "subExpr ::= subExpr '-'  operand .";
    artLabelStrings[ARTL_ART_subExpr_302] = "";
    artlhsL[ARTL_ART_subExpr_302] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_302] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_subExpr_302] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_302] = true;
    arteoR_pL[ARTL_ART_subExpr_302] = true;
    artPopD[ARTL_ART_subExpr_302] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_306] = "subExpr ::= . subExpr '+'  operand ";
    artLabelStrings[ARTL_ART_subExpr_306] = "";
    artlhsL[ARTL_ART_subExpr_306] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_306] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExpr_308] = "subExpr ::= subExpr . '+'  operand ";
    artLabelStrings[ARTL_ART_subExpr_308] = "";
    artlhsL[ARTL_ART_subExpr_308] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_308] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_308] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_subExpr_308] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_309] = "subExpr ::= subExpr '+'  operand ";
    artLabelStrings[ARTL_ART_subExpr_309] = "";
    artlhsL[ARTL_ART_subExpr_309] = ARTL_ART_subExpr;
    artLabelInternalStrings[ARTL_ART_subExpr_310] = "subExpr ::= subExpr '+'  . operand ";
    artLabelStrings[ARTL_ART_subExpr_310] = "";
    artlhsL[ARTL_ART_subExpr_310] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_310] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExpr_312] = "subExpr ::= subExpr '+'  operand .";
    artLabelStrings[ARTL_ART_subExpr_312] = "";
    artlhsL[ARTL_ART_subExpr_312] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_312] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_subExpr_312] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_312] = true;
    arteoR_pL[ARTL_ART_subExpr_312] = true;
    artPopD[ARTL_ART_subExpr_312] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_316] = "subExpr ::= . subExpr '*'  operand ";
    artLabelStrings[ARTL_ART_subExpr_316] = "";
    artlhsL[ARTL_ART_subExpr_316] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_316] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExpr_318] = "subExpr ::= subExpr . '*'  operand ";
    artLabelStrings[ARTL_ART_subExpr_318] = "";
    artlhsL[ARTL_ART_subExpr_318] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_318] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_318] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_subExpr_318] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_319] = "subExpr ::= subExpr '*'  operand ";
    artLabelStrings[ARTL_ART_subExpr_319] = "";
    artlhsL[ARTL_ART_subExpr_319] = ARTL_ART_subExpr;
    artLabelInternalStrings[ARTL_ART_subExpr_320] = "subExpr ::= subExpr '*'  . operand ";
    artLabelStrings[ARTL_ART_subExpr_320] = "";
    artlhsL[ARTL_ART_subExpr_320] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_320] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExpr_322] = "subExpr ::= subExpr '*'  operand .";
    artLabelStrings[ARTL_ART_subExpr_322] = "";
    artlhsL[ARTL_ART_subExpr_322] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_322] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_subExpr_322] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_322] = true;
    arteoR_pL[ARTL_ART_subExpr_322] = true;
    artPopD[ARTL_ART_subExpr_322] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_326] = "subExpr ::= . subExpr '/'  operand ";
    artLabelStrings[ARTL_ART_subExpr_326] = "";
    artlhsL[ARTL_ART_subExpr_326] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_326] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExpr_328] = "subExpr ::= subExpr . '/'  operand ";
    artLabelStrings[ARTL_ART_subExpr_328] = "";
    artlhsL[ARTL_ART_subExpr_328] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_328] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_328] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_subExpr_328] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_329] = "subExpr ::= subExpr '/'  operand ";
    artLabelStrings[ARTL_ART_subExpr_329] = "";
    artlhsL[ARTL_ART_subExpr_329] = ARTL_ART_subExpr;
    artLabelInternalStrings[ARTL_ART_subExpr_330] = "subExpr ::= subExpr '/'  . operand ";
    artLabelStrings[ARTL_ART_subExpr_330] = "";
    artlhsL[ARTL_ART_subExpr_330] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_330] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExpr_332] = "subExpr ::= subExpr '/'  operand .";
    artLabelStrings[ARTL_ART_subExpr_332] = "";
    artlhsL[ARTL_ART_subExpr_332] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_332] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_subExpr_332] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_332] = true;
    arteoR_pL[ARTL_ART_subExpr_332] = true;
    artPopD[ARTL_ART_subExpr_332] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_336] = "subExpr ::= . subExpr '%'  operand ";
    artLabelStrings[ARTL_ART_subExpr_336] = "";
    artlhsL[ARTL_ART_subExpr_336] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_336] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExpr_338] = "subExpr ::= subExpr . '%'  operand ";
    artLabelStrings[ARTL_ART_subExpr_338] = "";
    artlhsL[ARTL_ART_subExpr_338] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_338] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_338] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_subExpr_338] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_339] = "subExpr ::= subExpr '%'  operand ";
    artLabelStrings[ARTL_ART_subExpr_339] = "";
    artlhsL[ARTL_ART_subExpr_339] = ARTL_ART_subExpr;
    artLabelInternalStrings[ARTL_ART_subExpr_340] = "subExpr ::= subExpr '%'  . operand ";
    artLabelStrings[ARTL_ART_subExpr_340] = "";
    artlhsL[ARTL_ART_subExpr_340] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_340] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExpr_342] = "subExpr ::= subExpr '%'  operand .";
    artLabelStrings[ARTL_ART_subExpr_342] = "";
    artlhsL[ARTL_ART_subExpr_342] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_342] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_subExpr_342] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_342] = true;
    arteoR_pL[ARTL_ART_subExpr_342] = true;
    artPopD[ARTL_ART_subExpr_342] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_346] = "subExpr ::= . '-'  subExpr ";
    artLabelStrings[ARTL_ART_subExpr_346] = "";
    artlhsL[ARTL_ART_subExpr_346] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_346] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExpr_347] = "subExpr ::= '-'  subExpr ";
    artLabelStrings[ARTL_ART_subExpr_347] = "";
    artlhsL[ARTL_ART_subExpr_347] = ARTL_ART_subExpr;
    artLabelInternalStrings[ARTL_ART_subExpr_348] = "subExpr ::= '-'  . subExpr ";
    artLabelStrings[ARTL_ART_subExpr_348] = "";
    artlhsL[ARTL_ART_subExpr_348] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_348] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_subExpr_348] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_350] = "subExpr ::= '-'  subExpr .";
    artLabelStrings[ARTL_ART_subExpr_350] = "";
    artlhsL[ARTL_ART_subExpr_350] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_350] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_350] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_350] = true;
    arteoR_pL[ARTL_ART_subExpr_350] = true;
    artPopD[ARTL_ART_subExpr_350] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_354] = "subExpr ::= . subExpr '**'  operand ";
    artLabelStrings[ARTL_ART_subExpr_354] = "";
    artlhsL[ARTL_ART_subExpr_354] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_354] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExpr_356] = "subExpr ::= subExpr . '**'  operand ";
    artLabelStrings[ARTL_ART_subExpr_356] = "";
    artlhsL[ARTL_ART_subExpr_356] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_356] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_356] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_subExpr_356] = true;
    artLabelInternalStrings[ARTL_ART_subExpr_357] = "subExpr ::= subExpr '**'  operand ";
    artLabelStrings[ARTL_ART_subExpr_357] = "";
    artlhsL[ARTL_ART_subExpr_357] = ARTL_ART_subExpr;
    artLabelInternalStrings[ARTL_ART_subExpr_358] = "subExpr ::= subExpr '**'  . operand ";
    artLabelStrings[ARTL_ART_subExpr_358] = "";
    artlhsL[ARTL_ART_subExpr_358] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_subExpr_358] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subExpr_360] = "subExpr ::= subExpr '**'  operand .";
    artLabelStrings[ARTL_ART_subExpr_360] = "";
    artlhsL[ARTL_ART_subExpr_360] = ARTL_ART_subExpr;
    artSlotInstanceOfs[ARTL_ART_subExpr_360] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_subExpr_360] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subExpr_360] = true;
    arteoR_pL[ARTL_ART_subExpr_360] = true;
    artPopD[ARTL_ART_subExpr_360] = true;
  }

  public void artTableInitialiser_ART_volume() {
    artLabelInternalStrings[ARTL_ART_volume] = "volume";
    artLabelStrings[ARTL_ART_volume] = "volume";
    artKindOfs[ARTL_ART_volume] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_volume_374] = "volume ::= . 'volume'  subExpr ';'  ";
    artLabelStrings[ARTL_ART_volume_374] = "";
    artlhsL[ARTL_ART_volume_374] = ARTL_ART_volume;
    artKindOfs[ARTL_ART_volume_374] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_volume_375] = "volume ::= 'volume'  subExpr ';'  ";
    artLabelStrings[ARTL_ART_volume_375] = "";
    artlhsL[ARTL_ART_volume_375] = ARTL_ART_volume;
    artLabelInternalStrings[ARTL_ART_volume_376] = "volume ::= 'volume'  . subExpr ';'  ";
    artLabelStrings[ARTL_ART_volume_376] = "";
    artlhsL[ARTL_ART_volume_376] = ARTL_ART_volume;
    artKindOfs[ARTL_ART_volume_376] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_volume_376] = true;
    artLabelInternalStrings[ARTL_ART_volume_378] = "volume ::= 'volume'  subExpr . ';'  ";
    artLabelStrings[ARTL_ART_volume_378] = "";
    artlhsL[ARTL_ART_volume_378] = ARTL_ART_volume;
    artSlotInstanceOfs[ARTL_ART_volume_378] = ARTL_ART_subExpr;
    artKindOfs[ARTL_ART_volume_378] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_volume_378] = true;
    artLabelInternalStrings[ARTL_ART_volume_379] = "volume ::= 'volume'  subExpr ';'  ";
    artLabelStrings[ARTL_ART_volume_379] = "";
    artlhsL[ARTL_ART_volume_379] = ARTL_ART_volume;
    artPopD[ARTL_ART_volume_379] = true;
    artLabelInternalStrings[ARTL_ART_volume_380] = "volume ::= 'volume'  subExpr ';'  .";
    artLabelStrings[ARTL_ART_volume_380] = "";
    artlhsL[ARTL_ART_volume_380] = ARTL_ART_volume;
    artKindOfs[ARTL_ART_volume_380] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_volume_380] = true;
    arteoR_pL[ARTL_ART_volume_380] = true;
    artPopD[ARTL_ART_volume_380] = true;
  }

  public void artTableInitialise() {
    artLabelInternalStrings = new String[ARTX_LABEL_EXTENT + 1];
    artLabelStrings = new String[ARTX_LABEL_EXTENT + 1];
    artLabelInternalStrings[ARTL_EOS] = "ART$";
    artLabelStrings[ARTL_EOS] = " EOS $";
    artLabelInternalStrings[ARTX_DESPATCH] = "ARTX_DESPATCH";
    artLabelStrings[ARTX_DESPATCH] = " DESPATCH";
    artLabelInternalStrings[ARTL_DUMMY] = "ARTL_DUMMY";
    artLabelStrings[ARTL_DUMMY] = " DUMMY";
    artLabelInternalStrings[ARTX_LABEL_EXTENT] = "!!ILLEGAL!!";
    artLabelStrings[ARTX_LABEL_EXTENT] = " ILLEGAL";
    artLabelStrings[ARTL_EPSILON] = "#";
    artLabelInternalStrings[ARTL_EPSILON] = "#";

    artTerminalRequiresWhiteSpace = new boolean[ARTL_EPSILON];
    artInitialiseBooleanArray(artTerminalRequiresWhiteSpace, 0, ARTL_EPSILON, false);

    artTerminalCaseInsensitive = new boolean[ARTL_EPSILON];
    artInitialiseBooleanArray(artTerminalCaseInsensitive, 0, ARTL_EPSILON, false);

    artlhsL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artlhsL, 0, ARTX_LABEL_EXTENT);
    artlhsL[ARTX_DESPATCH] = ARTX_DESPATCH;

    artKindOfs = new int[ARTX_LABEL_EXTENT + 1];
    artKindOfs[ARTL_EOS] = ARTK_EOS;
    artKindOfs[ARTL_EPSILON] = ARTK_EPSILON;

    artLonger = new ARTBitSet[ARTX_LABEL_EXTENT + 1];
    for (int i = 0; i < ARTX_LABEL_EXTENT + 1; i++) artLonger[i] = new ARTBitSet();
    artHigher = new ARTBitSet[ARTX_LABEL_EXTENT + 1];
    for (int i = 0; i < ARTX_LABEL_EXTENT + 1; i++) artHigher[i] = new ARTBitSet();

    artPreSlots = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artPreSlots, 0, ARTX_LABEL_EXTENT);

    artPostSlots = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artPostSlots, 0, ARTX_LABEL_EXTENT);

    artInstanceOfs = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artInstanceOfs, 0, ARTX_LABEL_EXTENT);

    artSlotInstanceOfs = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artSlotInstanceOfs, 0, ARTX_LABEL_EXTENT);

    artUserNameOfs = new int[ARTX_LABEL_EXTENT + 1];

    artGathers = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artGathers, 0, ARTX_LABEL_EXTENT);

    artFolds = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artFolds, 0, ARTX_LABEL_EXTENT, 0);

    artpL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artpL, 0, ARTX_LABEL_EXTENT);

    artaL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artaL, 0, ARTX_LABEL_EXTENT);

    artcolonL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artcolonL, 0, ARTX_LABEL_EXTENT);

    arteoOPL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(arteoOPL, 0, ARTX_LABEL_EXTENT, false);

    artfiRL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(artfiRL, 0, ARTX_LABEL_EXTENT, false);

    artfiPCL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(artfiPCL, 0, ARTX_LABEL_EXTENT, false);

    arteoRL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(arteoRL, 0, ARTX_LABEL_EXTENT, false);

    arteoR_pL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(arteoR_pL, 0, ARTX_LABEL_EXTENT, false);

    artPopD = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(artPopD, 0, ARTX_LABEL_EXTENT, false);

    artLabelStrings[ARTTB_ID] = "ID";
    artLabelInternalStrings[ARTTB_ID] = "&ID";
    artKindOfs[ARTTB_ID] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_ID] = true;
    artLabelStrings[ARTTB_INTEGER] = "INTEGER";
    artLabelInternalStrings[ARTTB_INTEGER] = "&INTEGER";
    artKindOfs[ARTTB_INTEGER] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_INTEGER] = true;
    artLabelStrings[ARTTB_REAL] = "REAL";
    artLabelInternalStrings[ARTTB_REAL] = "&REAL";
    artKindOfs[ARTTB_REAL] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_REAL] = true;
    artLabelStrings[ARTTB_SIMPLE_WHITESPACE] = "SIMPLE_WHITESPACE";
    artLabelInternalStrings[ARTTB_SIMPLE_WHITESPACE] = "&SIMPLE_WHITESPACE";
    artKindOfs[ARTTB_SIMPLE_WHITESPACE] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_SIMPLE_WHITESPACE] = true;
    artLabelStrings[ARTTB_STRING_DQ] = "STRING_DQ";
    artLabelInternalStrings[ARTTB_STRING_DQ] = "&STRING_DQ";
    artKindOfs[ARTTB_STRING_DQ] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_STRING_DQ] = true;
    artLabelStrings[ARTTS__SHREIK_EQUAL] = "!=";
    artLabelInternalStrings[ARTTS__SHREIK_EQUAL] = "'!='";
    artKindOfs[ARTTS__SHREIK_EQUAL] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__SHREIK_EQUAL] = true;
    artLabelStrings[ARTTS__PERCENT] = "%";
    artLabelInternalStrings[ARTTS__PERCENT] = "'%'";
    artKindOfs[ARTTS__PERCENT] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__PERCENT] = true;
    artLabelStrings[ARTTS__LPAR] = "(";
    artLabelInternalStrings[ARTTS__LPAR] = "'('";
    artKindOfs[ARTTS__LPAR] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LPAR] = true;
    artLabelStrings[ARTTS__RPAR] = ")";
    artLabelInternalStrings[ARTTS__RPAR] = "')'";
    artKindOfs[ARTTS__RPAR] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__RPAR] = true;
    artLabelStrings[ARTTS__STAR] = "*";
    artLabelInternalStrings[ARTTS__STAR] = "'*'";
    artKindOfs[ARTTS__STAR] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__STAR] = true;
    artLabelStrings[ARTTS__STAR_STAR] = "**";
    artLabelInternalStrings[ARTTS__STAR_STAR] = "'**'";
    artKindOfs[ARTTS__STAR_STAR] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__STAR_STAR] = true;
    artLabelStrings[ARTTS__PLUS] = "+";
    artLabelInternalStrings[ARTTS__PLUS] = "'+'";
    artKindOfs[ARTTS__PLUS] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__PLUS] = true;
    artLabelStrings[ARTTS__COMMA] = ",";
    artLabelInternalStrings[ARTTS__COMMA] = "','";
    artKindOfs[ARTTS__COMMA] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__COMMA] = true;
    artLabelStrings[ARTTS__MINUS] = "-";
    artLabelInternalStrings[ARTTS__MINUS] = "'-'";
    artKindOfs[ARTTS__MINUS] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__MINUS] = true;
    artLabelStrings[ARTTS__PERIOD] = ".";
    artLabelInternalStrings[ARTTS__PERIOD] = "'.'";
    artKindOfs[ARTTS__PERIOD] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__PERIOD] = true;
    artLabelStrings[ARTTS__PERIOD_PERIOD] = "..";
    artLabelInternalStrings[ARTTS__PERIOD_PERIOD] = "'..'";
    artKindOfs[ARTTS__PERIOD_PERIOD] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__PERIOD_PERIOD] = true;
    artLabelStrings[ARTTS__PERIOD_PERIOD_PERIOD] = "...";
    artLabelInternalStrings[ARTTS__PERIOD_PERIOD_PERIOD] = "'...'";
    artKindOfs[ARTTS__PERIOD_PERIOD_PERIOD] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__PERIOD_PERIOD_PERIOD] = true;
    artLabelStrings[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = "....";
    artLabelInternalStrings[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = "'....'";
    artKindOfs[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__PERIOD_PERIOD_PERIOD_PERIOD] = true;
    artLabelStrings[ARTTS__SLASH] = "/";
    artLabelInternalStrings[ARTTS__SLASH] = "'/'";
    artKindOfs[ARTTS__SLASH] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__SLASH] = true;
    artLabelStrings[ARTTS__COLON_EQUAL] = ":=";
    artLabelInternalStrings[ARTTS__COLON_EQUAL] = "':='";
    artKindOfs[ARTTS__COLON_EQUAL] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__COLON_EQUAL] = true;
    artLabelStrings[ARTTS__SEMICOLON] = ";";
    artLabelInternalStrings[ARTTS__SEMICOLON] = "';'";
    artKindOfs[ARTTS__SEMICOLON] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__SEMICOLON] = true;
    artLabelStrings[ARTTS__LT] = "<";
    artLabelInternalStrings[ARTTS__LT] = "'<'";
    artKindOfs[ARTTS__LT] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LT] = true;
    artLabelStrings[ARTTS__LT_EQUAL] = "<=";
    artLabelInternalStrings[ARTTS__LT_EQUAL] = "'<='";
    artKindOfs[ARTTS__LT_EQUAL] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LT_EQUAL] = true;
    artLabelStrings[ARTTS__EQUAL_EQUAL] = "==";
    artLabelInternalStrings[ARTTS__EQUAL_EQUAL] = "'=='";
    artKindOfs[ARTTS__EQUAL_EQUAL] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__EQUAL_EQUAL] = true;
    artLabelStrings[ARTTS__GT] = ">";
    artLabelInternalStrings[ARTTS__GT] = "'>'";
    artKindOfs[ARTTS__GT] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__GT] = true;
    artLabelStrings[ARTTS__GT_EQUAL] = ">=";
    artLabelInternalStrings[ARTTS__GT_EQUAL] = "'>='";
    artKindOfs[ARTTS__GT_EQUAL] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__GT_EQUAL] = true;
    artLabelStrings[ARTTS_A] = "A";
    artLabelInternalStrings[ARTTS_A] = "'A'";
    artKindOfs[ARTTS_A] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_A] = true;
    artLabelStrings[ARTTS_A_HASH] = "A#";
    artLabelInternalStrings[ARTTS_A_HASH] = "'A#'";
    artKindOfs[ARTTS_A_HASH] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_A_HASH] = true;
    artLabelStrings[ARTTS_Ab] = "Ab";
    artLabelInternalStrings[ARTTS_Ab] = "'Ab'";
    artKindOfs[ARTTS_Ab] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_Ab] = true;
    artLabelStrings[ARTTS_B] = "B";
    artLabelInternalStrings[ARTTS_B] = "'B'";
    artKindOfs[ARTTS_B] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_B] = true;
    artLabelStrings[ARTTS_Bb] = "Bb";
    artLabelInternalStrings[ARTTS_Bb] = "'Bb'";
    artKindOfs[ARTTS_Bb] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_Bb] = true;
    artLabelStrings[ARTTS_C] = "C";
    artLabelInternalStrings[ARTTS_C] = "'C'";
    artKindOfs[ARTTS_C] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_C] = true;
    artLabelStrings[ARTTS_C_HASH] = "C#";
    artLabelInternalStrings[ARTTS_C_HASH] = "'C#'";
    artKindOfs[ARTTS_C_HASH] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_C_HASH] = true;
    artLabelStrings[ARTTS_D] = "D";
    artLabelInternalStrings[ARTTS_D] = "'D'";
    artKindOfs[ARTTS_D] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_D] = true;
    artLabelStrings[ARTTS_D_HASH] = "D#";
    artLabelInternalStrings[ARTTS_D_HASH] = "'D#'";
    artKindOfs[ARTTS_D_HASH] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_D_HASH] = true;
    artLabelStrings[ARTTS_Db] = "Db";
    artLabelInternalStrings[ARTTS_Db] = "'Db'";
    artKindOfs[ARTTS_Db] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_Db] = true;
    artLabelStrings[ARTTS_E] = "E";
    artLabelInternalStrings[ARTTS_E] = "'E'";
    artKindOfs[ARTTS_E] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_E] = true;
    artLabelStrings[ARTTS_Eb] = "Eb";
    artLabelInternalStrings[ARTTS_Eb] = "'Eb'";
    artKindOfs[ARTTS_Eb] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_Eb] = true;
    artLabelStrings[ARTTS_F] = "F";
    artLabelInternalStrings[ARTTS_F] = "'F'";
    artKindOfs[ARTTS_F] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_F] = true;
    artLabelStrings[ARTTS_F_HASH] = "F#";
    artLabelInternalStrings[ARTTS_F_HASH] = "'F#'";
    artKindOfs[ARTTS_F_HASH] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_F_HASH] = true;
    artLabelStrings[ARTTS_G] = "G";
    artLabelInternalStrings[ARTTS_G] = "'G'";
    artKindOfs[ARTTS_G] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_G] = true;
    artLabelStrings[ARTTS_G_HASH] = "G#";
    artLabelInternalStrings[ARTTS_G_HASH] = "'G#'";
    artKindOfs[ARTTS_G_HASH] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_G_HASH] = true;
    artLabelStrings[ARTTS_Gb] = "Gb";
    artLabelInternalStrings[ARTTS_Gb] = "'Gb'";
    artKindOfs[ARTTS_Gb] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_Gb] = true;
    artLabelStrings[ARTTS_M] = "M";
    artLabelInternalStrings[ARTTS_M] = "'M'";
    artKindOfs[ARTTS_M] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_M] = true;
    artLabelStrings[ARTTS_M7] = "M7";
    artLabelInternalStrings[ARTTS_M7] = "'M7'";
    artKindOfs[ARTTS_M7] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_M7] = true;
    artLabelStrings[ARTTS__LBRACK] = "[";
    artLabelInternalStrings[ARTTS__LBRACK] = "'['";
    artKindOfs[ARTTS__LBRACK] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LBRACK] = true;
    artLabelStrings[ARTTS__RBRACK] = "]";
    artLabelInternalStrings[ARTTS__RBRACK] = "']'";
    artKindOfs[ARTTS__RBRACK] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__RBRACK] = true;
    artLabelStrings[ARTTS_arpeggio] = "arpeggio";
    artLabelInternalStrings[ARTTS_arpeggio] = "'arpeggio'";
    artKindOfs[ARTTS_arpeggio] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_arpeggio] = true;
    artLabelStrings[ARTTS_backingtrack] = "backingtrack";
    artLabelInternalStrings[ARTTS_backingtrack] = "'backingtrack'";
    artKindOfs[ARTTS_backingtrack] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_backingtrack] = true;
    artLabelStrings[ARTTS_beatRatio] = "beatRatio";
    artLabelInternalStrings[ARTTS_beatRatio] = "'beatRatio'";
    artKindOfs[ARTTS_beatRatio] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_beatRatio] = true;
    artLabelStrings[ARTTS_bpm] = "bpm";
    artLabelInternalStrings[ARTTS_bpm] = "'bpm'";
    artKindOfs[ARTTS_bpm] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_bpm] = true;
    artLabelStrings[ARTTS_else] = "else";
    artLabelInternalStrings[ARTTS_else] = "'else'";
    artKindOfs[ARTTS_else] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_else] = true;
    artLabelStrings[ARTTS_if] = "if";
    artLabelInternalStrings[ARTTS_if] = "'if'";
    artKindOfs[ARTTS_if] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_if] = true;
    artLabelStrings[ARTTS_instrument] = "instrument";
    artLabelInternalStrings[ARTTS_instrument] = "'instrument'";
    artKindOfs[ARTTS_instrument] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_instrument] = true;
    artLabelStrings[ARTTS_m] = "m";
    artLabelInternalStrings[ARTTS_m] = "'m'";
    artKindOfs[ARTTS_m] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_m] = true;
    artLabelStrings[ARTTS_m7] = "m7";
    artLabelInternalStrings[ARTTS_m7] = "'m7'";
    artKindOfs[ARTTS_m7] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_m7] = true;
    artLabelStrings[ARTTS_melody] = "melody";
    artLabelInternalStrings[ARTTS_melody] = "'melody'";
    artKindOfs[ARTTS_melody] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_melody] = true;
    artLabelStrings[ARTTS_mix] = "mix";
    artLabelInternalStrings[ARTTS_mix] = "'mix'";
    artKindOfs[ARTTS_mix] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_mix] = true;
    artLabelStrings[ARTTS_octave] = "octave";
    artLabelInternalStrings[ARTTS_octave] = "'octave'";
    artKindOfs[ARTTS_octave] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_octave] = true;
    artLabelStrings[ARTTS_play] = "play";
    artLabelInternalStrings[ARTTS_play] = "'play'";
    artKindOfs[ARTTS_play] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_play] = true;
    artLabelStrings[ARTTS_print] = "print";
    artLabelInternalStrings[ARTTS_print] = "'print'";
    artKindOfs[ARTTS_print] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_print] = true;
    artLabelStrings[ARTTS_repeatNote] = "repeatNote";
    artLabelInternalStrings[ARTTS_repeatNote] = "'repeatNote'";
    artKindOfs[ARTTS_repeatNote] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_repeatNote] = true;
    artLabelStrings[ARTTS_scale] = "scale";
    artLabelInternalStrings[ARTTS_scale] = "'scale'";
    artKindOfs[ARTTS_scale] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_scale] = true;
    artLabelStrings[ARTTS_volume] = "volume";
    artLabelInternalStrings[ARTTS_volume] = "'volume'";
    artKindOfs[ARTTS_volume] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_volume] = true;
    artLabelStrings[ARTTS_while] = "while";
    artLabelInternalStrings[ARTTS_while] = "'while'";
    artKindOfs[ARTTS_while] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_while] = true;
    artLabelStrings[ARTTS__LBRACE] = "{";
    artLabelInternalStrings[ARTTS__LBRACE] = "'{'";
    artKindOfs[ARTTS__LBRACE] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LBRACE] = true;
    artLabelStrings[ARTTS__RBRACE] = "}";
    artLabelInternalStrings[ARTTS__RBRACE] = "'}'";
    artKindOfs[ARTTS__RBRACE] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__RBRACE] = true;
    artTableInitialiser_ART_ID();
    artTableInitialiser_ART_INTEGER();
    artTableInitialiser_ART_REAL();
    artTableInitialiser_ART_STRING_DQ();
    artTableInitialiser_ART_beatRatio();
    artTableInitialiser_ART_bpm();
    artTableInitialiser_ART_chord();
    artTableInitialiser_ART_chordMode();
    artTableInitialiser_ART_instrument();
    artTableInitialiser_ART_note();
    artTableInitialiser_ART_notes();
    artTableInitialiser_ART_octave();
    artTableInitialiser_ART_operand();
    artTableInitialiser_ART_printElements();
    artTableInitialiser_ART_relExpr();
    artTableInitialiser_ART_rest();
    artTableInitialiser_ART_shifters();
    artTableInitialiser_ART_simpleNote();
    artTableInitialiser_ART_simpleNoteLexeme();
    artTableInitialiser_ART_statement();
    artTableInitialiser_ART_statements();
    artTableInitialiser_ART_subExpr();
    artTableInitialiser_ART_volume();
  }

  public ARTGeneratedParser(ARTLexerV3 artLexer) {
    this(null, artLexer);
  }

  public ARTGeneratedParser(ARTGrammar artGrammar, ARTLexerV3 artLexer) {
    super(artGrammar, artLexer);
    artParserKind = "GLL Gen";
    artFirstTerminalLabel = ARTTS__SHREIK_EQUAL;
    artFirstUnusedLabel = ARTX_LABEL_EXTENT + 1;
    artSetExtent = 92;
    ARTL_EOS = ARTX_EOS;
    ARTL_EPSILON = ARTX_EPSILON;
    ARTL_DUMMY = ARTX_DUMMY;
    artGrammarKind = ARTModeGrammarKind.BNF;
    artDefaultStartSymbolLabel = ARTL_ART_statements;
    artBuildDirectives = "ARTDirectives [verbosityLevel=0, statistics=false, trace=false, inputs=[], inputFilenames=[], lexWSSuffix=false, lexExtents=false, lexSegments=false, lexRecursive=false, lexPrintTWESet=false, lexDead=false, lexLongestWithin=false, lexLongestAcross=false, lexPriority=false, outputDirectory=., parserName=ARTGeneratedParser, lexerName=ARTGeneratedLexer, namespace=null, despatchMode=fragment, supportMode=HashPool, predictivePops=false, FIFODescriptors=false, suppressPopGuard=false, suppressProductionGuard=false, suppressTestRepeat=false, suppressSemantics=false, clusteredGSS=false, algorithmMode=gllGeneratorPool, treeLevel=3]";
    artFIFODescriptors = false;
    artSetInitialise();
    artTableInitialise();
  }

  private ARTGLLRDT artRDT;
  private int artNextFreeNodeNumber = 1;

  HashMap<String, Integer> variables = new HashMap<String, Integer>();
  HashMap<String, ARTGLLRDTHandle> melodies = new HashMap<String, ARTGLLRDTHandle>();
  HashMap<String, String> notesinmelody = new HashMap<String, String>();
  ITerms iTerms = new ITermsLowLevelAPI(10,10);
  MusicPlayer mp = new MusicPlayer();

  public static class ARTAT_ART_ID extends ARTGLLAttributeBlock {
    public int rightExtent;
    public int leftExtent;
    public String lexeme;
    public String v;
    public String toString() {
      String ret = "";
    ret += " rightExtent=" + rightExtent;
    ret += " leftExtent=" + leftExtent;
    ret += " lexeme=" + lexeme;
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_INTEGER extends ARTGLLAttributeBlock {
    public int v;
    public int rightExtent;
    public int leftExtent;
    public String lexeme;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
    ret += " rightExtent=" + rightExtent;
    ret += " leftExtent=" + leftExtent;
    ret += " lexeme=" + lexeme;
      return ret + " ";
}
  }

  public static class ARTAT_ART_REAL extends ARTGLLAttributeBlock {
    public int rightExtent;
    public int leftExtent;
    public String lexeme;
    public double v;
    public String toString() {
      String ret = "";
    ret += " rightExtent=" + rightExtent;
    ret += " leftExtent=" + leftExtent;
    ret += " lexeme=" + lexeme;
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_STRING_DQ extends ARTGLLAttributeBlock {
    public int rightExtent;
    public int leftExtent;
    public String lexeme;
    public String v;
    public String toString() {
      String ret = "";
    ret += " rightExtent=" + rightExtent;
    ret += " leftExtent=" + leftExtent;
    ret += " lexeme=" + lexeme;
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_chordMode extends ARTGLLAttributeBlock {
    public Chord v;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_operand extends ARTGLLAttributeBlock {
    public int v;
    ARTGLLRDTHandle ID1;
    ARTGLLRDTHandle INTEGER1;
    ARTGLLRDTHandle subExpr1;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_relExpr extends ARTGLLAttributeBlock {
    public int v;
    ARTGLLRDTHandle relExpr1;
    ARTGLLRDTHandle subExpr1;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_shifters extends ARTGLLAttributeBlock {
    public int v;
    ARTGLLRDTHandle shifters1;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_simpleNote extends ARTGLLAttributeBlock {
    public int rightExtent;
    public int leftExtent;
    public String v;
    public String toString() {
      String ret = "";
    ret += " rightExtent=" + rightExtent;
    ret += " leftExtent=" + leftExtent;
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_statement extends ARTGLLAttributeBlock {
    ARTGLLRDTHandle ID1;
    ARTGLLRDTHandle ID2;
    ARTGLLRDTHandle STRING_DQ1;
    ARTGLLRDTHandle STRING_DQ2;
    ARTGLLRDTHandle relExpr1;
    ARTGLLRDTHandle statement1;
    ARTGLLRDTHandle statement2;
    ARTGLLRDTHandle subExpr1;
    public String toString() {
      String ret = "";
      return ret + " ";
}
  }

  public static class ARTAT_ART_subExpr extends ARTGLLAttributeBlock {
    public int v;
    ARTGLLRDTHandle operand1;
    ARTGLLRDTHandle subExpr1;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public void ARTRD_ID(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_ID ID) throws ARTException {
  ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
      /*ID ::= &ID  .*/
      case ARTL_ART_ID_724: 
                ARTRD_ID(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID);
        artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
        ID.lexeme = artLexeme(ID.leftExtent, ID.rightExtent); ID.v = artLexemeAsID(ID.leftExtent, ID.rightExtent); 
        break;
        default:
          throw new ARTException("ARTRD_ID: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_INTEGER(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_INTEGER INTEGER) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*INTEGER ::= &INTEGER  .*/
    case ARTL_ART_INTEGER_730: 
            ARTRD_INTEGER(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      INTEGER.lexeme = artLexeme(INTEGER.leftExtent, INTEGER.rightExtent); INTEGER.v = artLexemeAsInteger(INTEGER.leftExtent, INTEGER.rightExtent); 
      break;
        default:
          throw new ARTException("ARTRD_INTEGER: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_REAL(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_REAL REAL) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*REAL ::= &REAL  .*/
    case ARTL_ART_REAL_736: 
            ARTRD_REAL(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      REAL.lexeme = artLexeme(REAL.leftExtent, REAL.rightExtent); REAL.v = artLexemeAsReal(REAL.leftExtent, REAL.rightExtent); 
      break;
        default:
          throw new ARTException("ARTRD_REAL: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_STRING_DQ(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_STRING_DQ STRING_DQ) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*STRING_DQ ::= &STRING_DQ  .*/
    case ARTL_ART_STRING_DQ_742: 
            ARTRD_STRING_DQ(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, STRING_DQ);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      STRING_DQ.lexeme = artLexeme(STRING_DQ.leftExtent, STRING_DQ.rightExtent); STRING_DQ.v = artLexemeAsString(STRING_DQ.leftExtent, STRING_DQ.rightExtent); 
      break;
        default:
          throw new ARTException("ARTRD_STRING_DQ: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_beatRatio(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_REAL REAL1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*beatRatio ::= 'beatRatio'  REAL . ';'  */
    case ARTL_ART_beatRatio_454: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            REAL1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      REAL1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), REAL1));
      ARTRD_REAL(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, REAL1);
            break;
    /*beatRatio ::= 'beatRatio'  REAL ';'  .*/
    case ARTL_ART_beatRatio_456: 
      REAL1 = new ARTAT_ART_REAL();
            ARTRD_beatRatio(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       iTerms.valueUserPlugin.user(new __int32(17,iTerms), new __real64(REAL1.v, iTerms)); 
      break;
        default:
          throw new ARTException("ARTRD_beatRatio: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_bpm(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_subExpr subExpr1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*bpm ::= 'bpm'  subExpr . ';'  */
    case ARTL_ART_bpm_368: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExpr1));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExpr1, null, null);
            break;
    /*bpm ::= 'bpm'  subExpr ';'  .*/
    case ARTL_ART_bpm_370: 
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_bpm(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, subExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       iTerms.valueUserPlugin.user(new __int32(4, iTerms), new __int32(subExpr1.v, iTerms)); 
      break;
        default:
          throw new ARTException("ARTRD_bpm: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_chord(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*chord ::= '['  notes . ']'  */
    case ARTL_ART_chord_624: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_notes(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*chord ::= '['  notes ']'  .*/
    case ARTL_ART_chord_626: 
            ARTRD_chord(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
        default:
          throw new ARTException("ARTRD_chord: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_chordMode(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_chordMode chordMode) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*chordMode ::= # .*/
    case ARTL_ART_chordMode_490: 
            ARTRD_chordMode(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, chordMode);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       chordMode.v = Chord.NONE; 
      break;
    /*chordMode ::= 'm'  .*/
    case ARTL_ART_chordMode_496: 
            ARTRD_chordMode(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, chordMode);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       chordMode.v = Chord.MINOR; 
      break;
    /*chordMode ::= 'm7'  .*/
    case ARTL_ART_chordMode_502: 
            ARTRD_chordMode(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, chordMode);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       chordMode.v = Chord.MINOR7; 
      break;
    /*chordMode ::= 'M'  .*/
    case ARTL_ART_chordMode_508: 
            ARTRD_chordMode(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, chordMode);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       chordMode.v = Chord.MAJOR; 
      break;
    /*chordMode ::= 'M7'  .*/
    case ARTL_ART_chordMode_514: 
            ARTRD_chordMode(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, chordMode);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       chordMode.v = Chord.MAJOR7; 
      break;
        default:
          throw new ARTException("ARTRD_chordMode: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_instrument(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_STRING_DQ STRING_DQ1, ARTAT_ART_subExpr subExpr1, ARTAT_ART_subExpr subExpr2) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*instrument ::= 'instrument'  '('  . subExpr ','  subExpr ')'  ';'  */
    case ARTL_ART_instrument_388: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*instrument ::= 'instrument'  '('  subExpr . ','  subExpr ')'  ';'  */
    case ARTL_ART_instrument_390: 
      ARTRD_instrument(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, STRING_DQ1, subExpr1, subExpr2);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExpr1));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExpr1, null, null);
            break;
    /*instrument ::= 'instrument'  '('  subExpr ','  . subExpr ')'  ';'  */
    case ARTL_ART_instrument_392: 
      ARTRD_instrument(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, STRING_DQ1, subExpr1, subExpr2);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*instrument ::= 'instrument'  '('  subExpr ','  subExpr . ')'  ';'  */
    case ARTL_ART_instrument_394: 
      ARTRD_instrument(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, STRING_DQ1, subExpr1, subExpr2);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExpr2));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExpr2, null, null);
            break;
    /*instrument ::= 'instrument'  '('  subExpr ','  subExpr ')'  . ';'  */
    case ARTL_ART_instrument_396: 
      ARTRD_instrument(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, STRING_DQ1, subExpr1, subExpr2);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*instrument ::= 'instrument'  '('  subExpr ','  subExpr ')'  ';'  .*/
    case ARTL_ART_instrument_398: 
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      subExpr1 = new ARTAT_ART_subExpr();
      subExpr2 = new ARTAT_ART_subExpr();
            ARTRD_instrument(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, STRING_DQ1, subExpr1, subExpr2);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       iTerms.valueUserPlugin.user(new __int32(5, iTerms), new __int32(subExpr1.v, iTerms), new __int32(subExpr2.v, iTerms)); 
      break;
    /*instrument ::= 'instrument'  '('  . STRING_DQ ','  subExpr ')'  ';'  */
    case ARTL_ART_instrument_406: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*instrument ::= 'instrument'  '('  STRING_DQ . ','  subExpr ')'  ';'  */
    case ARTL_ART_instrument_408: 
      ARTRD_instrument(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, STRING_DQ1, subExpr1, subExpr2);
      STRING_DQ1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      STRING_DQ1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), STRING_DQ1));
      ARTRD_STRING_DQ(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, STRING_DQ1);
            break;
    /*instrument ::= 'instrument'  '('  STRING_DQ ','  . subExpr ')'  ';'  */
    case ARTL_ART_instrument_410: 
      ARTRD_instrument(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, STRING_DQ1, subExpr1, subExpr2);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*instrument ::= 'instrument'  '('  STRING_DQ ','  subExpr . ')'  ';'  */
    case ARTL_ART_instrument_412: 
      ARTRD_instrument(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, STRING_DQ1, subExpr1, subExpr2);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExpr1));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExpr1, null, null);
            break;
    /*instrument ::= 'instrument'  '('  STRING_DQ ','  subExpr ')'  . ';'  */
    case ARTL_ART_instrument_414: 
      ARTRD_instrument(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, STRING_DQ1, subExpr1, subExpr2);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*instrument ::= 'instrument'  '('  STRING_DQ ','  subExpr ')'  ';'  .*/
    case ARTL_ART_instrument_416: 
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      subExpr1 = new ARTAT_ART_subExpr();
      subExpr2 = new ARTAT_ART_subExpr();
            ARTRD_instrument(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, STRING_DQ1, subExpr1, subExpr2);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       iTerms.valueUserPlugin.user(new __int32(6, iTerms), new __string(STRING_DQ1.v, iTerms), new __int32(subExpr1.v, iTerms));
      break;
    /*instrument ::= 'instrument'  STRING_DQ . ';'  */
    case ARTL_ART_instrument_424: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            STRING_DQ1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      STRING_DQ1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), STRING_DQ1));
      ARTRD_STRING_DQ(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, STRING_DQ1);
            break;
    /*instrument ::= 'instrument'  STRING_DQ ';'  .*/
    case ARTL_ART_instrument_426: 
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      subExpr1 = new ARTAT_ART_subExpr();
      subExpr2 = new ARTAT_ART_subExpr();
            ARTRD_instrument(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, STRING_DQ1, subExpr1, subExpr2);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       iTerms.valueUserPlugin.user(new __int32(15, iTerms), new __string(STRING_DQ1.v, iTerms)); 
      break;
    /*instrument ::= 'instrument'  subExpr . ';'  */
    case ARTL_ART_instrument_434: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExpr1));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExpr1, null, null);
            break;
    /*instrument ::= 'instrument'  subExpr ';'  .*/
    case ARTL_ART_instrument_436: 
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      subExpr1 = new ARTAT_ART_subExpr();
      subExpr2 = new ARTAT_ART_subExpr();
            ARTRD_instrument(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, STRING_DQ1, subExpr1, subExpr2);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       iTerms.valueUserPlugin.user(new __int32(16, iTerms), new __int32(subExpr1.v, iTerms)); 
      break;
        default:
          throw new ARTException("ARTRD_instrument: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_note(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_INTEGER INTEGER1, ARTAT_ART_chordMode chordMode1, ARTAT_ART_shifters shifters1, ARTAT_ART_simpleNote simpleNote1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*note ::= simpleNote chordMode .*/
    case ARTL_ART_note_464: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      chordMode1 = new ARTAT_ART_chordMode();
      shifters1 = new ARTAT_ART_shifters();
      simpleNote1 = new ARTAT_ART_simpleNote();
            simpleNote1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      simpleNote1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), simpleNote1));
      ARTRD_simpleNote(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, simpleNote1);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), chordMode1));
      ARTRD_chordMode(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, chordMode1);
       mp.playChord(simpleNote1.v.trim(), chordMode1.v ); 
      break;
    /*note ::= simpleNote shifters . chordMode */
    case ARTL_ART_note_472: 
      simpleNote1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      simpleNote1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), simpleNote1));
      ARTRD_simpleNote(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, simpleNote1);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), shifters1));
      ARTRD_shifters(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, shifters1, null);
            break;
    /*note ::= simpleNote shifters chordMode .*/
    case ARTL_ART_note_474: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      chordMode1 = new ARTAT_ART_chordMode();
      shifters1 = new ARTAT_ART_shifters();
      simpleNote1 = new ARTAT_ART_simpleNote();
            ARTRD_note(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, chordMode1, shifters1, simpleNote1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), chordMode1));
      ARTRD_chordMode(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, chordMode1);
       mp.playChord(simpleNote1.v.trim(), mp.getDefaultOctave() + shifters1.v, chordMode1.v); 
      break;
    /*note ::= simpleNote INTEGER . chordMode */
    case ARTL_ART_note_482: 
      simpleNote1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      simpleNote1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), simpleNote1));
      ARTRD_simpleNote(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, simpleNote1);
            INTEGER1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      INTEGER1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), INTEGER1));
      ARTRD_INTEGER(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, INTEGER1);
            break;
    /*note ::= simpleNote INTEGER chordMode .*/
    case ARTL_ART_note_484: 
      INTEGER1 = new ARTAT_ART_INTEGER();
      chordMode1 = new ARTAT_ART_chordMode();
      shifters1 = new ARTAT_ART_shifters();
      simpleNote1 = new ARTAT_ART_simpleNote();
            ARTRD_note(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1, chordMode1, shifters1, simpleNote1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), chordMode1));
      ARTRD_chordMode(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, chordMode1);
       mp.playChord(simpleNote1.v.trim(), INTEGER1.v, chordMode1.v); 
      break;
        default:
          throw new ARTException("ARTRD_note: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_notes(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*notes ::= note .*/
    case ARTL_ART_notes_630: 
            ARTRD_notes(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_note(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null, null, null);
            break;
    /*notes ::= note notes .*/
    case ARTL_ART_notes_636: 
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_note(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, null, null, null, null);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_notes(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_notes: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_octave(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_INTEGER INTEGER1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*octave ::= 'octave'  INTEGER . ';'  */
    case ARTL_ART_octave_444: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            INTEGER1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      INTEGER1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), INTEGER1));
      ARTRD_INTEGER(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, INTEGER1);
            break;
    /*octave ::= 'octave'  INTEGER ';'  .*/
    case ARTL_ART_octave_446: 
      INTEGER1 = new ARTAT_ART_INTEGER();
            ARTRD_octave(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       if (INTEGER1.v < 0 || INTEGER1.v > 10) 
     artText.println(ARTTextLevel.WARNING, "ignoring illegal MIDI octave number " + INTEGER1.v);
    else
      iTerms.valueUserPlugin.user(new __int32(8, iTerms), new __int32(INTEGER1.v, iTerms)); 
 
      break;
        default:
          throw new ARTException("ARTRD_octave: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_operand(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_operand operand, ARTAT_ART_ID ID1, ARTAT_ART_INTEGER INTEGER1, ARTAT_ART_subExpr subExpr1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*operand ::= ID .*/
    case ARTL_ART_operand_702: 
      ID1 = new ARTAT_ART_ID();
      INTEGER1 = new ARTAT_ART_INTEGER();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, operand, ID1, INTEGER1, subExpr1);
      ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
      operand.v = variables.get(ID1.v); 
      break;
    /*operand ::= INTEGER .*/
    case ARTL_ART_operand_708: 
      ID1 = new ARTAT_ART_ID();
      INTEGER1 = new ARTAT_ART_INTEGER();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, operand, ID1, INTEGER1, subExpr1);
      INTEGER1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      INTEGER1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), INTEGER1));
      ARTRD_INTEGER(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, INTEGER1);
      operand.v = INTEGER1.v; 
      break;
    /*operand ::= '('  subExpr . ')'  */
    case ARTL_ART_operand_716: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExpr1));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExpr1, null, null);
            break;
    /*operand ::= '('  subExpr ')'  .*/
    case ARTL_ART_operand_718: 
      ID1 = new ARTAT_ART_ID();
      INTEGER1 = new ARTAT_ART_INTEGER();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, operand, ID1, INTEGER1, subExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      operand.v = subExpr1.v; 
      break;
        default:
          throw new ARTException("ARTRD_operand: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_printElements(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_ID ID1, ARTAT_ART_STRING_DQ STRING_DQ1, ARTAT_ART_subExpr subExpr1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*printElements ::= STRING_DQ .*/
    case ARTL_ART_printElements_664: 
      ID1 = new ARTAT_ART_ID();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_printElements(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1, STRING_DQ1, subExpr1);
      STRING_DQ1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      STRING_DQ1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), STRING_DQ1));
      ARTRD_STRING_DQ(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, STRING_DQ1);
       iTerms.valueUserPlugin.user(new __int32(14, iTerms), new __string(STRING_DQ1.v, iTerms)); 
      break;
    /*printElements ::= STRING_DQ ','  . printElements */
    case ARTL_ART_printElements_674: 
      STRING_DQ1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      STRING_DQ1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), STRING_DQ1));
      ARTRD_STRING_DQ(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, STRING_DQ1);
       iTerms.valueUserPlugin.user(new __int32(14, iTerms), new __string(STRING_DQ1.v, iTerms)); 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*printElements ::= STRING_DQ ','  printElements .*/
    case ARTL_ART_printElements_676: 
      ID1 = new ARTAT_ART_ID();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_printElements(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1, STRING_DQ1, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_printElements(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null, null);
            break;
    /*printElements ::= subExpr .*/
    case ARTL_ART_printElements_680: 
      ID1 = new ARTAT_ART_ID();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_printElements(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1, STRING_DQ1, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExpr1));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExpr1, null, null);
       iTerms.valueUserPlugin.user(new __int32(14, iTerms), new __int32(subExpr1.v, iTerms)); 
      break;
    /*printElements ::= subExpr ','  . printElements */
    case ARTL_ART_printElements_690: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), subExpr1));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, subExpr1, null, null);
       iTerms.valueUserPlugin.user(new __int32(14, iTerms), new __int32(subExpr1.v, iTerms)); 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*printElements ::= subExpr ','  printElements .*/
    case ARTL_ART_printElements_692: 
      ID1 = new ARTAT_ART_ID();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_printElements(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1, STRING_DQ1, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_printElements(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null, null);
            break;
    /*printElements ::= ID .*/
    case ARTL_ART_printElements_696: 
      ID1 = new ARTAT_ART_ID();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_printElements(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID1, STRING_DQ1, subExpr1);
      ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
       iTerms.valueUserPlugin.user(new __int32(14, iTerms), new __int32(variables.get(ID1.v), iTerms)); 
      break;
        default:
          throw new ARTException("ARTRD_printElements: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_relExpr(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_relExpr relExpr, ARTAT_ART_relExpr relExpr1, ARTAT_ART_subExpr subExpr1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*relExpr ::= subExpr .*/
    case ARTL_ART_relExpr_226: 
      relExpr1 = new ARTAT_ART_relExpr();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, relExpr, relExpr1, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExpr1));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExpr1, null, null);
       relExpr.v = subExpr1.v; 
      break;
    /*relExpr ::= relExpr '>'  . subExpr */
    case ARTL_ART_relExpr_234: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), relExpr1));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, relExpr1, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*relExpr ::= relExpr '>'  subExpr .*/
    case ARTL_ART_relExpr_236: 
      relExpr1 = new ARTAT_ART_relExpr();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, relExpr, relExpr1, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExpr1));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExpr1, null, null);
       relExpr.v = relExpr1.v > subExpr1.v ? 1 : 0; 
      break;
    /*relExpr ::= relExpr '!='  . subExpr */
    case ARTL_ART_relExpr_244: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), relExpr1));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, relExpr1, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*relExpr ::= relExpr '!='  subExpr .*/
    case ARTL_ART_relExpr_246: 
      relExpr1 = new ARTAT_ART_relExpr();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, relExpr, relExpr1, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExpr1));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExpr1, null, null);
       relExpr.v = relExpr1.v != subExpr1.v ? 1 : 0; 
      break;
    /*relExpr ::= relExpr '<'  . subExpr */
    case ARTL_ART_relExpr_254: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), relExpr1));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, relExpr1, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*relExpr ::= relExpr '<'  subExpr .*/
    case ARTL_ART_relExpr_256: 
      relExpr1 = new ARTAT_ART_relExpr();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, relExpr, relExpr1, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExpr1));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExpr1, null, null);
       relExpr.v = relExpr1.v < subExpr1.v ? 1 : 0; 
      break;
    /*relExpr ::= relExpr '=='  . subExpr */
    case ARTL_ART_relExpr_264: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), relExpr1));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, relExpr1, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*relExpr ::= relExpr '=='  subExpr .*/
    case ARTL_ART_relExpr_266: 
      relExpr1 = new ARTAT_ART_relExpr();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, relExpr, relExpr1, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExpr1));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExpr1, null, null);
       relExpr.v = relExpr1.v == subExpr1.v ? 1 : 0; 
      break;
    /*relExpr ::= relExpr '>='  . subExpr */
    case ARTL_ART_relExpr_274: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), relExpr1));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, relExpr1, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*relExpr ::= relExpr '>='  subExpr .*/
    case ARTL_ART_relExpr_276: 
      relExpr1 = new ARTAT_ART_relExpr();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, relExpr, relExpr1, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExpr1));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExpr1, null, null);
       relExpr.v = relExpr1.v >= subExpr1.v ? 1 : 0; 
      break;
    /*relExpr ::= relExpr '<='  . subExpr */
    case ARTL_ART_relExpr_284: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), relExpr1));
      ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, relExpr1, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*relExpr ::= relExpr '<='  subExpr .*/
    case ARTL_ART_relExpr_286: 
      relExpr1 = new ARTAT_ART_relExpr();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_relExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, relExpr, relExpr1, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExpr1));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExpr1, null, null);
       relExpr.v = relExpr1.v <= subExpr1.v ? 1 : 0; 
      break;
        default:
          throw new ARTException("ARTRD_relExpr: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_rest(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*rest ::= '.'  .*/
    case ARTL_ART_rest_640: 
            ARTRD_rest(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       iTerms.valueUserPlugin.user(new __int32(7, iTerms), new __int32(1, iTerms)); 
      break;
    /*rest ::= '..'  .*/
    case ARTL_ART_rest_646: 
            ARTRD_rest(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       iTerms.valueUserPlugin.user(new __int32(7, iTerms), new __int32(2, iTerms)); 
      break;
    /*rest ::= '...'  .*/
    case ARTL_ART_rest_652: 
            ARTRD_rest(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       iTerms.valueUserPlugin.user(new __int32(7, iTerms), new __int32(3, iTerms)); 
      break;
    /*rest ::= '....'  .*/
    case ARTL_ART_rest_658: 
            ARTRD_rest(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       iTerms.valueUserPlugin.user(new __int32(7, iTerms), new __int32(4, iTerms)); 
      break;
        default:
          throw new ARTException("ARTRD_rest: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_shifters(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_shifters shifters, ARTAT_ART_shifters shifters1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*shifters ::= '+'  .*/
    case ARTL_ART_shifters_594: 
      shifters1 = new ARTAT_ART_shifters();
            ARTRD_shifters(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, shifters, shifters1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      shifters.v = 1;
      break;
    /*shifters ::= '-'  .*/
    case ARTL_ART_shifters_600: 
      shifters1 = new ARTAT_ART_shifters();
            ARTRD_shifters(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, shifters, shifters1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      shifters.v = -1;
      break;
    /*shifters ::= '+'  shifters .*/
    case ARTL_ART_shifters_608: 
      shifters1 = new ARTAT_ART_shifters();
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), shifters1));
      ARTRD_shifters(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, shifters1, null);
      shifters.v = shifters1.v + 1; 
      break;
    /*shifters ::= '-'  shifters .*/
    case ARTL_ART_shifters_616: 
      shifters1 = new ARTAT_ART_shifters();
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), shifters1));
      ARTRD_shifters(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, shifters1, null);
      shifters.v = shifters1.v - 1; 
      break;
        default:
          throw new ARTException("ARTRD_shifters: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_simpleNote(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_simpleNote simpleNote) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*simpleNote ::= simpleNoteLexeme .*/
    case ARTL_ART_simpleNote_520: 
            ARTRD_simpleNote(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, simpleNote);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_simpleNoteLexeme(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
       simpleNote.v = artLexeme(simpleNote.leftExtent, simpleNote.rightExtent).trim(); 
      break;
        default:
          throw new ARTException("ARTRD_simpleNote: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_simpleNoteLexeme(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*simpleNoteLexeme ::= 'Ab'  .*/
    case ARTL_ART_simpleNoteLexeme_526: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'A'  .*/
    case ARTL_ART_simpleNoteLexeme_530: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'A#'  .*/
    case ARTL_ART_simpleNoteLexeme_534: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'Bb'  .*/
    case ARTL_ART_simpleNoteLexeme_538: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'B'  .*/
    case ARTL_ART_simpleNoteLexeme_542: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'C'  .*/
    case ARTL_ART_simpleNoteLexeme_546: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'C#'  .*/
    case ARTL_ART_simpleNoteLexeme_550: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'Db'  .*/
    case ARTL_ART_simpleNoteLexeme_554: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'D'  .*/
    case ARTL_ART_simpleNoteLexeme_558: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'D#'  .*/
    case ARTL_ART_simpleNoteLexeme_562: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'Eb'  .*/
    case ARTL_ART_simpleNoteLexeme_566: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'E'  .*/
    case ARTL_ART_simpleNoteLexeme_570: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'F'  .*/
    case ARTL_ART_simpleNoteLexeme_574: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'F#'  .*/
    case ARTL_ART_simpleNoteLexeme_578: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'Gb'  .*/
    case ARTL_ART_simpleNoteLexeme_582: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'G'  .*/
    case ARTL_ART_simpleNoteLexeme_586: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*simpleNoteLexeme ::= 'G#'  .*/
    case ARTL_ART_simpleNoteLexeme_590: 
            ARTRD_simpleNoteLexeme(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
        default:
          throw new ARTException("ARTRD_simpleNoteLexeme: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_statement(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_statement statement, ARTAT_ART_ID ID1, ARTAT_ART_ID ID2, ARTAT_ART_STRING_DQ STRING_DQ1, ARTAT_ART_STRING_DQ STRING_DQ2, ARTAT_ART_relExpr relExpr1, ARTAT_ART_statement statement1, ARTAT_ART_statement statement2, ARTAT_ART_subExpr subExpr1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*statement ::= ID ':='  . subExpr ';'  */
    case ARTL_ART_statement_18: 
      ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, ID1);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= ID ':='  subExpr . ';'  */
    case ARTL_ART_statement_20: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExpr1));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExpr1, null, null);
            break;
    /*statement ::= ID ':='  subExpr ';'  .*/
    case ARTL_ART_statement_22: 
      ID1 = new ARTAT_ART_ID();
      ID2 = new ARTAT_ART_ID();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      STRING_DQ2 = new ARTAT_ART_STRING_DQ();
      relExpr1 = new ARTAT_ART_relExpr();
      statement1 = new ARTAT_ART_statement();
      statement2 = new ARTAT_ART_statement();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       variables.put(ID1.v, subExpr1.v); 
      break;
    /*statement ::= 'if'  relExpr . statement 'else'  statement */
    case ARTL_ART_statement_30: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), relExpr1));
      ARTRD_relExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, relExpr1, null, null);
            break;
    /*statement ::= 'if'  relExpr statement . 'else'  statement */
    case ARTL_ART_statement_32: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      statement.statement1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
            break;
    /*statement ::= 'if'  relExpr statement 'else'  . statement */
    case ARTL_ART_statement_34: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'if'  relExpr statement 'else'  statement .*/
    case ARTL_ART_statement_36: 
      ID1 = new ARTAT_ART_ID();
      ID2 = new ARTAT_ART_ID();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      STRING_DQ2 = new ARTAT_ART_STRING_DQ();
      relExpr1 = new ARTAT_ART_relExpr();
      statement1 = new ARTAT_ART_statement();
      statement2 = new ARTAT_ART_statement();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      statement.statement2 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
       if (relExpr1.v != 0) 
      artEvaluate(statement.statement1, statement1); 
    else
      artEvaluate(statement.statement2, statement2);  
   
      break;
    /*statement ::= 'while'  relExpr . statement */
    case ARTL_ART_statement_44: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), relExpr1));
      statement.relExpr1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
            break;
    /*statement ::= 'while'  relExpr statement .*/
    case ARTL_ART_statement_46: 
      ID1 = new ARTAT_ART_ID();
      ID2 = new ARTAT_ART_ID();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      STRING_DQ2 = new ARTAT_ART_STRING_DQ();
      relExpr1 = new ARTAT_ART_relExpr();
      statement1 = new ARTAT_ART_statement();
      statement2 = new ARTAT_ART_statement();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      statement.statement1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
       artEvaluate(statement.relExpr1, relExpr1); 
    while (relExpr1.v != 0) { 
      artEvaluate(statement.statement1, statement1); 
      artEvaluate(statement.relExpr1, relExpr1); 
    } 
  
      break;
    /*statement ::= 'melody'  ID . '{'  STRING_DQ '}'  */
    case ARTL_ART_statement_54: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
            break;
    /*statement ::= 'melody'  ID '{'  . STRING_DQ '}'  */
    case ARTL_ART_statement_56: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'melody'  ID '{'  STRING_DQ . '}'  */
    case ARTL_ART_statement_58: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      STRING_DQ1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      STRING_DQ1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), STRING_DQ1));
      ARTRD_STRING_DQ(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, STRING_DQ1);
            break;
    /*statement ::= 'melody'  ID '{'  STRING_DQ '}'  .*/
    case ARTL_ART_statement_60: 
      ID1 = new ARTAT_ART_ID();
      ID2 = new ARTAT_ART_ID();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      STRING_DQ2 = new ARTAT_ART_STRING_DQ();
      relExpr1 = new ARTAT_ART_relExpr();
      statement1 = new ARTAT_ART_statement();
      statement2 = new ARTAT_ART_statement();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      notesinmelody.put(ID1.v, STRING_DQ1.v);
      break;
    /*statement ::= 'repeatNote'  '('  . STRING_DQ ','  subExpr ')'  ';'  */
    case ARTL_ART_statement_68: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'repeatNote'  '('  STRING_DQ . ','  subExpr ')'  ';'  */
    case ARTL_ART_statement_70: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      STRING_DQ1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      STRING_DQ1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), STRING_DQ1));
      ARTRD_STRING_DQ(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, STRING_DQ1);
            break;
    /*statement ::= 'repeatNote'  '('  STRING_DQ ','  . subExpr ')'  ';'  */
    case ARTL_ART_statement_72: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'repeatNote'  '('  STRING_DQ ','  subExpr . ')'  ';'  */
    case ARTL_ART_statement_74: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExpr1));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExpr1, null, null);
            break;
    /*statement ::= 'repeatNote'  '('  STRING_DQ ','  subExpr ')'  . ';'  */
    case ARTL_ART_statement_76: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'repeatNote'  '('  STRING_DQ ','  subExpr ')'  ';'  .*/
    case ARTL_ART_statement_78: 
      ID1 = new ARTAT_ART_ID();
      ID2 = new ARTAT_ART_ID();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      STRING_DQ2 = new ARTAT_ART_STRING_DQ();
      relExpr1 = new ARTAT_ART_relExpr();
      statement1 = new ARTAT_ART_statement();
      statement2 = new ARTAT_ART_statement();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       iTerms.valueUserPlugin.user(new __int32(1,iTerms), new __string(STRING_DQ1.v,iTerms), new __int32(subExpr1.v, iTerms)); 
      break;
    /*statement ::= 'play'  ID . ';'  */
    case ARTL_ART_statement_86: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
            break;
    /*statement ::= 'play'  ID ';'  .*/
    case ARTL_ART_statement_88: 
      ID1 = new ARTAT_ART_ID();
      ID2 = new ARTAT_ART_ID();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      STRING_DQ2 = new ARTAT_ART_STRING_DQ();
      relExpr1 = new ARTAT_ART_relExpr();
      statement1 = new ARTAT_ART_statement();
      statement2 = new ARTAT_ART_statement();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      if(!notesinmelody.containsKey(ID1.v)){
    artText.println(ARTTextLevel.WARNING, "ignoring request to play undefined melody: " + ID1.v);
  } else{
    iTerms.valueUserPlugin.user(new __int32(3, iTerms), new __string(notesinmelody.get(ID1.v), iTerms));
  }
      break;
    /*statement ::= '{'  statements . '}'  */
    case ARTL_ART_statement_96: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statements(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
    /*statement ::= '{'  statements '}'  .*/
    case ARTL_ART_statement_98: 
      ID1 = new ARTAT_ART_ID();
      ID2 = new ARTAT_ART_ID();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      STRING_DQ2 = new ARTAT_ART_STRING_DQ();
      relExpr1 = new ARTAT_ART_relExpr();
      statement1 = new ARTAT_ART_statement();
      statement2 = new ARTAT_ART_statement();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'mix'  '('  . ID ','  ID ')'  ';'  */
    case ARTL_ART_statement_104: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'mix'  '('  ID . ','  ID ')'  ';'  */
    case ARTL_ART_statement_106: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
            break;
    /*statement ::= 'mix'  '('  ID ','  . ID ')'  ';'  */
    case ARTL_ART_statement_108: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'mix'  '('  ID ','  ID . ')'  ';'  */
    case ARTL_ART_statement_110: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      ID2.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID2.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID2));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID2);
            break;
    /*statement ::= 'mix'  '('  ID ','  ID ')'  . ';'  */
    case ARTL_ART_statement_112: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'mix'  '('  ID ','  ID ')'  ';'  .*/
    case ARTL_ART_statement_114: 
      ID1 = new ARTAT_ART_ID();
      ID2 = new ARTAT_ART_ID();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      STRING_DQ2 = new ARTAT_ART_STRING_DQ();
      relExpr1 = new ARTAT_ART_relExpr();
      statement1 = new ARTAT_ART_statement();
      statement2 = new ARTAT_ART_statement();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      
    iTerms.valueUserPlugin.user(new __int32(9, iTerms), new __string(notesinmelody.get(ID1.v), iTerms), new __string(notesinmelody.get(ID2.v), iTerms));
  
      break;
    /*statement ::= ID STRING_DQ . ';'  */
    case ARTL_ART_statement_122: 
      ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, ID1);
            STRING_DQ1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      STRING_DQ1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), STRING_DQ1));
      ARTRD_STRING_DQ(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, STRING_DQ1);
            break;
    /*statement ::= ID STRING_DQ ';'  .*/
    case ARTL_ART_statement_124: 
      ID1 = new ARTAT_ART_ID();
      ID2 = new ARTAT_ART_ID();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      STRING_DQ2 = new ARTAT_ART_STRING_DQ();
      relExpr1 = new ARTAT_ART_relExpr();
      statement1 = new ARTAT_ART_statement();
      statement2 = new ARTAT_ART_statement();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'backingtrack'  '('  . ID ','  subExpr ')'  ';'  */
    case ARTL_ART_statement_130: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'backingtrack'  '('  ID . ','  subExpr ')'  ';'  */
    case ARTL_ART_statement_132: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
            break;
    /*statement ::= 'backingtrack'  '('  ID ','  . subExpr ')'  ';'  */
    case ARTL_ART_statement_134: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'backingtrack'  '('  ID ','  subExpr . ')'  ';'  */
    case ARTL_ART_statement_136: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExpr1));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExpr1, null, null);
            break;
    /*statement ::= 'backingtrack'  '('  ID ','  subExpr ')'  . ';'  */
    case ARTL_ART_statement_138: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'backingtrack'  '('  ID ','  subExpr ')'  ';'  .*/
    case ARTL_ART_statement_140: 
      ID1 = new ARTAT_ART_ID();
      ID2 = new ARTAT_ART_ID();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      STRING_DQ2 = new ARTAT_ART_STRING_DQ();
      relExpr1 = new ARTAT_ART_relExpr();
      statement1 = new ARTAT_ART_statement();
      statement2 = new ARTAT_ART_statement();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      if(!notesinmelody.containsKey(ID1.v)){
    artText.println(ARTTextLevel.WARNING, "ignoring request to play undefined melody: " + ID1.v);
  } else{
    iTerms.valueUserPlugin.user(new __int32(10,iTerms), new __string(notesinmelody.get(ID1.v), iTerms), new __int32(subExpr1.v, iTerms));
  }
  
      break;
    /*statement ::= 'scale'  '('  . STRING_DQ ','  STRING_DQ ')'  ';'  */
    case ARTL_ART_statement_148: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'scale'  '('  STRING_DQ . ','  STRING_DQ ')'  ';'  */
    case ARTL_ART_statement_150: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      STRING_DQ1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      STRING_DQ1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), STRING_DQ1));
      ARTRD_STRING_DQ(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, STRING_DQ1);
            break;
    /*statement ::= 'scale'  '('  STRING_DQ ','  . STRING_DQ ')'  ';'  */
    case ARTL_ART_statement_152: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'scale'  '('  STRING_DQ ','  STRING_DQ . ')'  ';'  */
    case ARTL_ART_statement_154: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      STRING_DQ2.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      STRING_DQ2.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), STRING_DQ2));
      ARTRD_STRING_DQ(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, STRING_DQ2);
            break;
    /*statement ::= 'scale'  '('  STRING_DQ ','  STRING_DQ ')'  . ';'  */
    case ARTL_ART_statement_156: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'scale'  '('  STRING_DQ ','  STRING_DQ ')'  ';'  .*/
    case ARTL_ART_statement_158: 
      ID1 = new ARTAT_ART_ID();
      ID2 = new ARTAT_ART_ID();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      STRING_DQ2 = new ARTAT_ART_STRING_DQ();
      relExpr1 = new ARTAT_ART_relExpr();
      statement1 = new ARTAT_ART_statement();
      statement2 = new ARTAT_ART_statement();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      
    iTerms.valueUserPlugin.user(new __int32(12, iTerms), new __string(STRING_DQ1.v, iTerms), new __string(STRING_DQ2.v, iTerms));
  
      break;
    /*statement ::= 'arpeggio'  '('  . STRING_DQ ','  STRING_DQ ')'  ';'  */
    case ARTL_ART_statement_166: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'arpeggio'  '('  STRING_DQ . ','  STRING_DQ ')'  ';'  */
    case ARTL_ART_statement_168: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      STRING_DQ1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      STRING_DQ1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), STRING_DQ1));
      ARTRD_STRING_DQ(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, STRING_DQ1);
            break;
    /*statement ::= 'arpeggio'  '('  STRING_DQ ','  . STRING_DQ ')'  ';'  */
    case ARTL_ART_statement_170: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'arpeggio'  '('  STRING_DQ ','  STRING_DQ . ')'  ';'  */
    case ARTL_ART_statement_172: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      STRING_DQ2.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      STRING_DQ2.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), STRING_DQ2));
      ARTRD_STRING_DQ(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, STRING_DQ2);
            break;
    /*statement ::= 'arpeggio'  '('  STRING_DQ ','  STRING_DQ ')'  . ';'  */
    case ARTL_ART_statement_174: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'arpeggio'  '('  STRING_DQ ','  STRING_DQ ')'  ';'  .*/
    case ARTL_ART_statement_176: 
      ID1 = new ARTAT_ART_ID();
      ID2 = new ARTAT_ART_ID();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      STRING_DQ2 = new ARTAT_ART_STRING_DQ();
      relExpr1 = new ARTAT_ART_relExpr();
      statement1 = new ARTAT_ART_statement();
      statement2 = new ARTAT_ART_statement();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      
    iTerms.valueUserPlugin.user(new __int32(13, iTerms), new __string(STRING_DQ1.v, iTerms), new __string(STRING_DQ2.v, iTerms));
  
      break;
    /*statement ::= 'print'  '('  . printElements ')'  ';'  */
    case ARTL_ART_statement_184: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'print'  '('  printElements . ')'  ';'  */
    case ARTL_ART_statement_186: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_printElements(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null, null);
            break;
    /*statement ::= 'print'  '('  printElements ')'  . ';'  */
    case ARTL_ART_statement_188: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'print'  '('  printElements ')'  ';'  .*/
    case ARTL_ART_statement_190: 
      ID1 = new ARTAT_ART_ID();
      ID2 = new ARTAT_ART_ID();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      STRING_DQ2 = new ARTAT_ART_STRING_DQ();
      relExpr1 = new ARTAT_ART_relExpr();
      statement1 = new ARTAT_ART_statement();
      statement2 = new ARTAT_ART_statement();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= bpm .*/
    case ARTL_ART_statement_194: 
      ID1 = new ARTAT_ART_ID();
      ID2 = new ARTAT_ART_ID();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      STRING_DQ2 = new ARTAT_ART_STRING_DQ();
      relExpr1 = new ARTAT_ART_relExpr();
      statement1 = new ARTAT_ART_statement();
      statement2 = new ARTAT_ART_statement();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_bpm(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
    /*statement ::= octave .*/
    case ARTL_ART_statement_198: 
      ID1 = new ARTAT_ART_ID();
      ID2 = new ARTAT_ART_ID();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      STRING_DQ2 = new ARTAT_ART_STRING_DQ();
      relExpr1 = new ARTAT_ART_relExpr();
      statement1 = new ARTAT_ART_statement();
      statement2 = new ARTAT_ART_statement();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_octave(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
    /*statement ::= note .*/
    case ARTL_ART_statement_202: 
      ID1 = new ARTAT_ART_ID();
      ID2 = new ARTAT_ART_ID();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      STRING_DQ2 = new ARTAT_ART_STRING_DQ();
      relExpr1 = new ARTAT_ART_relExpr();
      statement1 = new ARTAT_ART_statement();
      statement2 = new ARTAT_ART_statement();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_note(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null, null, null);
            break;
    /*statement ::= chord .*/
    case ARTL_ART_statement_206: 
      ID1 = new ARTAT_ART_ID();
      ID2 = new ARTAT_ART_ID();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      STRING_DQ2 = new ARTAT_ART_STRING_DQ();
      relExpr1 = new ARTAT_ART_relExpr();
      statement1 = new ARTAT_ART_statement();
      statement2 = new ARTAT_ART_statement();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_chord(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*statement ::= rest .*/
    case ARTL_ART_statement_210: 
      ID1 = new ARTAT_ART_ID();
      ID2 = new ARTAT_ART_ID();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      STRING_DQ2 = new ARTAT_ART_STRING_DQ();
      relExpr1 = new ARTAT_ART_relExpr();
      statement1 = new ARTAT_ART_statement();
      statement2 = new ARTAT_ART_statement();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_rest(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*statement ::= instrument .*/
    case ARTL_ART_statement_214: 
      ID1 = new ARTAT_ART_ID();
      ID2 = new ARTAT_ART_ID();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      STRING_DQ2 = new ARTAT_ART_STRING_DQ();
      relExpr1 = new ARTAT_ART_relExpr();
      statement1 = new ARTAT_ART_statement();
      statement2 = new ARTAT_ART_statement();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_instrument(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null, null);
            break;
    /*statement ::= volume .*/
    case ARTL_ART_statement_218: 
      ID1 = new ARTAT_ART_ID();
      ID2 = new ARTAT_ART_ID();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      STRING_DQ2 = new ARTAT_ART_STRING_DQ();
      relExpr1 = new ARTAT_ART_relExpr();
      statement1 = new ARTAT_ART_statement();
      statement2 = new ARTAT_ART_statement();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_volume(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
    /*statement ::= beatRatio .*/
    case ARTL_ART_statement_222: 
      ID1 = new ARTAT_ART_ID();
      ID2 = new ARTAT_ART_ID();
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      STRING_DQ2 = new ARTAT_ART_STRING_DQ();
      relExpr1 = new ARTAT_ART_relExpr();
      statement1 = new ARTAT_ART_statement();
      statement2 = new ARTAT_ART_statement();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, ID2, STRING_DQ1, STRING_DQ2, relExpr1, statement1, statement2, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_beatRatio(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
        default:
          throw new ARTException("ARTRD_statement: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_statements(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_statement statement1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*statements ::= statement .*/
    case ARTL_ART_statements_4: 
      statement1 = new ARTAT_ART_statement();
            ARTRD_statements(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, statement1, null, null, null, null, null, null, null, null);
       System.out.println("Variables at end of program: " + variables); 
      break;
    /*statements ::= statement statements .*/
    case ARTL_ART_statements_12: 
      statement1 = new ARTAT_ART_statement();
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, statement1, null, null, null, null, null, null, null, null);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statements(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
        default:
          throw new ARTException("ARTRD_statements: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_subExpr(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_subExpr subExpr, ARTAT_ART_operand operand1, ARTAT_ART_subExpr subExpr1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*subExpr ::= operand .*/
    case ARTL_ART_subExpr_292: 
      operand1 = new ARTAT_ART_operand();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, subExpr, operand1, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), operand1));
      ARTRD_operand(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, operand1, null, null, null);
       subExpr.v = operand1.v; 
      break;
    /*subExpr ::= subExpr '-'  . operand */
    case ARTL_ART_subExpr_300: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), subExpr1));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, subExpr1, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*subExpr ::= subExpr '-'  operand .*/
    case ARTL_ART_subExpr_302: 
      operand1 = new ARTAT_ART_operand();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, subExpr, operand1, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), operand1));
      ARTRD_operand(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, operand1, null, null, null);
       subExpr.v = subExpr1.v - operand1.v; 
      break;
    /*subExpr ::= subExpr '+'  . operand */
    case ARTL_ART_subExpr_310: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), subExpr1));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, subExpr1, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*subExpr ::= subExpr '+'  operand .*/
    case ARTL_ART_subExpr_312: 
      operand1 = new ARTAT_ART_operand();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, subExpr, operand1, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), operand1));
      ARTRD_operand(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, operand1, null, null, null);
       subExpr.v = subExpr1.v + operand1.v; 
      break;
    /*subExpr ::= subExpr '*'  . operand */
    case ARTL_ART_subExpr_320: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), subExpr1));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, subExpr1, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*subExpr ::= subExpr '*'  operand .*/
    case ARTL_ART_subExpr_322: 
      operand1 = new ARTAT_ART_operand();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, subExpr, operand1, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), operand1));
      ARTRD_operand(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, operand1, null, null, null);
       subExpr.v = subExpr1.v * operand1.v; 
      break;
    /*subExpr ::= subExpr '/'  . operand */
    case ARTL_ART_subExpr_330: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), subExpr1));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, subExpr1, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*subExpr ::= subExpr '/'  operand .*/
    case ARTL_ART_subExpr_332: 
      operand1 = new ARTAT_ART_operand();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, subExpr, operand1, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), operand1));
      ARTRD_operand(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, operand1, null, null, null);
       subExpr.v = subExpr1.v / operand1.v; 
      break;
    /*subExpr ::= subExpr '%'  . operand */
    case ARTL_ART_subExpr_340: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), subExpr1));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, subExpr1, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*subExpr ::= subExpr '%'  operand .*/
    case ARTL_ART_subExpr_342: 
      operand1 = new ARTAT_ART_operand();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, subExpr, operand1, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), operand1));
      ARTRD_operand(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, operand1, null, null, null);
       subExpr.v = subExpr1.v % operand1.v; 
      break;
    /*subExpr ::= '-'  subExpr .*/
    case ARTL_ART_subExpr_350: 
      operand1 = new ARTAT_ART_operand();
      subExpr1 = new ARTAT_ART_subExpr();
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExpr1));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExpr1, null, null);
       subExpr.v = -subExpr1.v ; 
      break;
    /*subExpr ::= subExpr '**'  . operand */
    case ARTL_ART_subExpr_358: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), subExpr1));
      ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, subExpr1, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*subExpr ::= subExpr '**'  operand .*/
    case ARTL_ART_subExpr_360: 
      operand1 = new ARTAT_ART_operand();
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_subExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, subExpr, operand1, subExpr1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), operand1));
      ARTRD_operand(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, operand1, null, null, null);
       subExpr.v = (int)Math.pow(subExpr1.v, operand1.v); 
      break;
        default:
          throw new ARTException("ARTRD_subExpr: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_volume(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_subExpr subExpr1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*volume ::= 'volume'  subExpr . ';'  */
    case ARTL_ART_volume_378: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), subExpr1));
      ARTRD_subExpr(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, subExpr1, null, null);
            break;
    /*volume ::= 'volume'  subExpr ';'  .*/
    case ARTL_ART_volume_380: 
      subExpr1 = new ARTAT_ART_subExpr();
            ARTRD_volume(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, subExpr1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       iTerms.valueUserPlugin.user(new __int32(11, iTerms), new __int32(subExpr1.v, iTerms)); 
      break;
        default:
          throw new ARTException("ARTRD_volume: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void artEvaluate(ARTGLLRDTHandle artElement, Object artAttributes, ARTGLLRDTVertex artParent, Boolean artWriteable) throws ARTException {
  switch (artSPPFNodeLabel(artElement.element)) {
    case ARTL_ART_ID:  ARTRD_ID(artElement.element, artParent, artWriteable, (ARTAT_ART_ID) artAttributes); break;
    case ARTL_ART_INTEGER:  ARTRD_INTEGER(artElement.element, artParent, artWriteable, (ARTAT_ART_INTEGER) artAttributes); break;
    case ARTL_ART_REAL:  ARTRD_REAL(artElement.element, artParent, artWriteable, (ARTAT_ART_REAL) artAttributes); break;
    case ARTL_ART_STRING_DQ:  ARTRD_STRING_DQ(artElement.element, artParent, artWriteable, (ARTAT_ART_STRING_DQ) artAttributes); break;
    case ARTL_ART_beatRatio: ARTRD_beatRatio(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_bpm: ARTRD_bpm(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_chord: ARTRD_chord(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_chordMode:  ARTRD_chordMode(artElement.element, artParent, artWriteable, (ARTAT_ART_chordMode) artAttributes); break;
    case ARTL_ART_instrument: ARTRD_instrument(artElement.element, artParent, artWriteable, null, null, null); break;
    case ARTL_ART_note: ARTRD_note(artElement.element, artParent, artWriteable, null, null, null, null); break;
    case ARTL_ART_notes: ARTRD_notes(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_octave: ARTRD_octave(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_operand:  ARTRD_operand(artElement.element, artParent, artWriteable, (ARTAT_ART_operand) artAttributes, null, null, null); break;
    case ARTL_ART_printElements: ARTRD_printElements(artElement.element, artParent, artWriteable, null, null, null); break;
    case ARTL_ART_relExpr:  ARTRD_relExpr(artElement.element, artParent, artWriteable, (ARTAT_ART_relExpr) artAttributes, null, null); break;
    case ARTL_ART_rest: ARTRD_rest(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_shifters:  ARTRD_shifters(artElement.element, artParent, artWriteable, (ARTAT_ART_shifters) artAttributes, null); break;
    case ARTL_ART_simpleNote:  ARTRD_simpleNote(artElement.element, artParent, artWriteable, (ARTAT_ART_simpleNote) artAttributes); break;
    case ARTL_ART_simpleNoteLexeme: ARTRD_simpleNoteLexeme(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_statement:  ARTRD_statement(artElement.element, artParent, artWriteable, (ARTAT_ART_statement) artAttributes, null, null, null, null, null, null, null, null); break;
    case ARTL_ART_statements: ARTRD_statements(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_subExpr:  ARTRD_subExpr(artElement.element, artParent, artWriteable, (ARTAT_ART_subExpr) artAttributes, null, null); break;
    case ARTL_ART_volume: ARTRD_volume(artElement.element, artParent, artWriteable, null); break;
  }
}

public ARTGLLRDT artEvaluator() throws ARTException {
  artRDT = new ARTGLLRDT("RDT", artKindOfs, artLabelStrings, artInputString);
  ARTGLLRDTVertex artNewParent = new ARTGLLRDTVertex(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artRootSPPFNode),artSPPFNodeRightExtent(artRootSPPFNode),artSPPFNodeLabel(artRootSPPFNode), null));
  artRDT.setRoot(artNewParent);
  boolean artNewWriteable = true;
  artEvaluate(new ARTGLLRDTHandle(artRootSPPFNode), null, artNewParent, artNewWriteable);
  artAttributeEvaluateCompleteTime = artReadClock();
  return artRDT;
}
};
