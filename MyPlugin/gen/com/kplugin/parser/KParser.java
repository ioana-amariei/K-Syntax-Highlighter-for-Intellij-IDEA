// This is a generated file. Not intended for manual editing.
package com.kplugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.kplugin.psi.KTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class KParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == CELL_) {
      r = cell_(b, 0);
    }
    else if (t == CONDITION_) {
      r = condition_(b, 0);
    }
    else if (t == CONFIGURATION_) {
      r = configuration_(b, 0);
    }
    else if (t == CONFIGURATION_BLOCK) {
      r = configuration_block(b, 0);
    }
    else if (t == EXPRESSION_) {
      r = expression_(b, 0);
    }
    else if (t == EXPRESSION_BLOCK) {
      r = expression_block(b, 0);
    }
    else if (t == HEADER_BLOCK) {
      r = header_block(b, 0);
    }
    else if (t == HEADER_LINE) {
      r = header_line(b, 0);
    }
    else if (t == IMPORTS_BLOCK) {
      r = imports_block(b, 0);
    }
    else if (t == IMPORTS_LINE) {
      r = imports_line(b, 0);
    }
    else if (t == ITEM_) {
      r = item_(b, 0);
    }
    else if (t == LIST_OPTIONS) {
      r = list_options(b, 0);
    }
    else if (t == MODULE_BODY) {
      r = module_body(b, 0);
    }
    else if (t == MODULE_END) {
      r = module_end(b, 0);
    }
    else if (t == MODULE_START) {
      r = module_start(b, 0);
    }
    else if (t == PRECEDENCE_) {
      r = precedence_(b, 0);
    }
    else if (t == PROPERTY) {
      r = property(b, 0);
    }
    else if (t == RULE_) {
      r = rule_(b, 0);
    }
    else if (t == RULE_BLOCK) {
      r = rule_block(b, 0);
    }
    else if (t == STATEMENT) {
      r = statement(b, 0);
    }
    else if (t == SYNTAX_BLOCK) {
      r = syntax_block(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return kFile(b, l + 1);
  }

  /* ********************************************************** */
  // WS* SPECIAL_SIGN* WS* STRING WS* SPECIAL_SIGN
  public static boolean cell_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cell_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CELL_, "<cell>");
    r = cell__0(b, l + 1);
    r = r && cell__1(b, l + 1);
    r = r && cell__2(b, l + 1);
    r = r && consumeToken(b, STRING);
    r = r && cell__4(b, l + 1);
    r = r && consumeToken(b, SPECIAL_SIGN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // WS*
  private static boolean cell__0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cell__0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "cell__0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPECIAL_SIGN*
  private static boolean cell__1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cell__1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SPECIAL_SIGN)) break;
      if (!empty_element_parsed_guard_(b, "cell__1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // WS*
  private static boolean cell__2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cell__2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "cell__2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // WS*
  private static boolean cell__4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cell__4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "cell__4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // WS* WHEN WS* ID WS* SPECIAL_SIGN TYPE WS* ID
  public static boolean condition_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_")) return false;
    if (!nextTokenIs(b, "<condition>", WHEN, WS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITION_, "<condition>");
    r = condition__0(b, l + 1);
    r = r && consumeToken(b, WHEN);
    r = r && condition__2(b, l + 1);
    r = r && consumeToken(b, ID);
    r = r && condition__4(b, l + 1);
    r = r && consumeTokens(b, 0, SPECIAL_SIGN, TYPE);
    r = r && condition__7(b, l + 1);
    r = r && consumeToken(b, ID);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // WS*
  private static boolean condition__0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition__0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "condition__0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // WS*
  private static boolean condition__2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition__2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "condition__2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // WS*
  private static boolean condition__4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition__4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "condition__4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // WS*
  private static boolean condition__7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition__7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "condition__7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // cell_ WS* SPECIAL_SIGN? WS* PGM WS* SPECIAL_SIGN TYPE WS* cell_
  public static boolean configuration_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONFIGURATION_, "<configuration>");
    r = cell_(b, l + 1);
    r = r && configuration__1(b, l + 1);
    r = r && configuration__2(b, l + 1);
    r = r && configuration__3(b, l + 1);
    r = r && consumeToken(b, PGM);
    r = r && configuration__5(b, l + 1);
    r = r && consumeTokens(b, 0, SPECIAL_SIGN, TYPE);
    r = r && configuration__8(b, l + 1);
    r = r && cell_(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // WS*
  private static boolean configuration__1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration__1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "configuration__1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPECIAL_SIGN?
  private static boolean configuration__2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration__2")) return false;
    consumeToken(b, SPECIAL_SIGN);
    return true;
  }

  // WS*
  private static boolean configuration__3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration__3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "configuration__3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // WS*
  private static boolean configuration__5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration__5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "configuration__5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // WS*
  private static boolean configuration__8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration__8")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "configuration__8", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // (WS* CONFIGURATION WS* configuration_ CRLF*)+
  public static boolean configuration_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration_block")) return false;
    if (!nextTokenIs(b, "<configuration block>", CONFIGURATION, WS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONFIGURATION_BLOCK, "<configuration block>");
    r = configuration_block_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!configuration_block_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "configuration_block", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // WS* CONFIGURATION WS* configuration_ CRLF*
  private static boolean configuration_block_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration_block_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = configuration_block_0_0(b, l + 1);
    r = r && consumeToken(b, CONFIGURATION);
    r = r && configuration_block_0_2(b, l + 1);
    r = r && configuration_(b, l + 1);
    r = r && configuration_block_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WS*
  private static boolean configuration_block_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration_block_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "configuration_block_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // WS*
  private static boolean configuration_block_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration_block_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "configuration_block_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // CRLF*
  private static boolean configuration_block_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration_block_0_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, CRLF)) break;
      if (!empty_element_parsed_guard_(b, "configuration_block_0_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // STRING_VALUE
  //                 | TYPE
  //                 | (TYPE WS* STRING_VALUE? WS* TYPE)
  //                 |(STRING_VALUE WS* (TYPE WS*)* WS* STRING_VALUE (TYPE WS*)*)
  public static boolean expression_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_")) return false;
    if (!nextTokenIs(b, "<expression>", STRING_VALUE, TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_, "<expression>");
    r = consumeToken(b, STRING_VALUE);
    if (!r) r = consumeToken(b, TYPE);
    if (!r) r = expression__2(b, l + 1);
    if (!r) r = expression__3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TYPE WS* STRING_VALUE? WS* TYPE
  private static boolean expression__2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression__2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPE);
    r = r && expression__2_1(b, l + 1);
    r = r && expression__2_2(b, l + 1);
    r = r && expression__2_3(b, l + 1);
    r = r && consumeToken(b, TYPE);
    exit_section_(b, m, null, r);
    return r;
  }

  // WS*
  private static boolean expression__2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression__2_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "expression__2_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // STRING_VALUE?
  private static boolean expression__2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression__2_2")) return false;
    consumeToken(b, STRING_VALUE);
    return true;
  }

  // WS*
  private static boolean expression__2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression__2_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "expression__2_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // STRING_VALUE WS* (TYPE WS*)* WS* STRING_VALUE (TYPE WS*)*
  private static boolean expression__3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression__3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_VALUE);
    r = r && expression__3_1(b, l + 1);
    r = r && expression__3_2(b, l + 1);
    r = r && expression__3_3(b, l + 1);
    r = r && consumeToken(b, STRING_VALUE);
    r = r && expression__3_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WS*
  private static boolean expression__3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression__3_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "expression__3_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (TYPE WS*)*
  private static boolean expression__3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression__3_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!expression__3_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression__3_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TYPE WS*
  private static boolean expression__3_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression__3_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPE);
    r = r && expression__3_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WS*
  private static boolean expression__3_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression__3_2_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "expression__3_2_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // WS*
  private static boolean expression__3_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression__3_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "expression__3_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (TYPE WS*)*
  private static boolean expression__3_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression__3_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!expression__3_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression__3_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TYPE WS*
  private static boolean expression__3_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression__3_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPE);
    r = r && expression__3_5_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WS*
  private static boolean expression__3_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression__3_5_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "expression__3_5_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // (WS* expression_ WS* list_options? CRLF* WS* (SPECIAL_SIGN | precedence_)?)+
  public static boolean expression_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_block")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_BLOCK, "<expression block>");
    r = expression_block_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!expression_block_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_block", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // WS* expression_ WS* list_options? CRLF* WS* (SPECIAL_SIGN | precedence_)?
  private static boolean expression_block_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_block_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_block_0_0(b, l + 1);
    r = r && expression_(b, l + 1);
    r = r && expression_block_0_2(b, l + 1);
    r = r && expression_block_0_3(b, l + 1);
    r = r && expression_block_0_4(b, l + 1);
    r = r && expression_block_0_5(b, l + 1);
    r = r && expression_block_0_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WS*
  private static boolean expression_block_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_block_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "expression_block_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // WS*
  private static boolean expression_block_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_block_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "expression_block_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // list_options?
  private static boolean expression_block_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_block_0_3")) return false;
    list_options(b, l + 1);
    return true;
  }

  // CRLF*
  private static boolean expression_block_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_block_0_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, CRLF)) break;
      if (!empty_element_parsed_guard_(b, "expression_block_0_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // WS*
  private static boolean expression_block_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_block_0_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "expression_block_0_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (SPECIAL_SIGN | precedence_)?
  private static boolean expression_block_0_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_block_0_6")) return false;
    expression_block_0_6_0(b, l + 1);
    return true;
  }

  // SPECIAL_SIGN | precedence_
  private static boolean expression_block_0_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_block_0_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SPECIAL_SIGN);
    if (!r) r = precedence_(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // header_line*
  public static boolean header_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header_block")) return false;
    Marker m = enter_section_(b, l, _NONE_, HEADER_BLOCK, "<header block>");
    int c = current_position_(b);
    while (true) {
      if (!header_line(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "header_block", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // REQUIRE CRLF+
  public static boolean header_line(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header_line")) return false;
    if (!nextTokenIs(b, REQUIRE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REQUIRE);
    r = r && header_line_1(b, l + 1);
    exit_section_(b, m, HEADER_LINE, r);
    return r;
  }

  // CRLF+
  private static boolean header_line_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header_line_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CRLF);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, CRLF)) break;
      if (!empty_element_parsed_guard_(b, "header_line_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // imports_line*
  public static boolean imports_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "imports_block")) return false;
    Marker m = enter_section_(b, l, _NONE_, IMPORTS_BLOCK, "<imports block>");
    int c = current_position_(b);
    while (true) {
      if (!imports_line(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "imports_block", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // WS* IMPORTS WS+ MODULE_NAME WS* CRLF*
  public static boolean imports_line(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "imports_line")) return false;
    if (!nextTokenIs(b, "<imports line>", IMPORTS, WS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORTS_LINE, "<imports line>");
    r = imports_line_0(b, l + 1);
    r = r && consumeToken(b, IMPORTS);
    r = r && imports_line_2(b, l + 1);
    r = r && consumeToken(b, MODULE_NAME);
    r = r && imports_line_4(b, l + 1);
    r = r && imports_line_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // WS*
  private static boolean imports_line_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "imports_line_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "imports_line_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // WS+
  private static boolean imports_line_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "imports_line_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WS);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "imports_line_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // WS*
  private static boolean imports_line_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "imports_line_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "imports_line_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // CRLF*
  private static boolean imports_line_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "imports_line_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, CRLF)) break;
      if (!empty_element_parsed_guard_(b, "imports_line_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // property|COMMENT|CRLF
  public static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ITEM_, "<item>");
    r = property(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (CRLF|WS|COMMENT)* header_block (module_definition CRLF*)+
  static boolean kFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "kFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = kFile_0(b, l + 1);
    r = r && header_block(b, l + 1);
    r = r && kFile_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (CRLF|WS|COMMENT)*
  private static boolean kFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "kFile_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!kFile_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "kFile_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // CRLF|WS|COMMENT
  private static boolean kFile_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "kFile_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CRLF);
    if (!r) r = consumeToken(b, WS);
    if (!r) r = consumeToken(b, COMMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // (module_definition CRLF*)+
  private static boolean kFile_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "kFile_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = kFile_2_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!kFile_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "kFile_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // module_definition CRLF*
  private static boolean kFile_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "kFile_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = module_definition(b, l + 1);
    r = r && kFile_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CRLF*
  private static boolean kFile_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "kFile_2_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, CRLF)) break;
      if (!empty_element_parsed_guard_(b, "kFile_2_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // OPTION
  public static boolean list_options(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_options")) return false;
    if (!nextTokenIs(b, OPTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPTION);
    exit_section_(b, m, LIST_OPTIONS, r);
    return r;
  }

  /* ********************************************************** */
  // ((imports_block (CRLF|WS|COMMENT)* syntax_block  (CRLF|WS|COMMENT)*)
  //                 | (imports_block (CRLF|WS|COMMENT)* rule_block  (CRLF|WS|COMMENT)*)
  //                 |(imports_block (CRLF|WS|COMMENT)* configuration_block  (CRLF|WS|COMMENT)*))+
  public static boolean module_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODULE_BODY, "<module body>");
    r = module_body_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!module_body_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "module_body", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (imports_block (CRLF|WS|COMMENT)* syntax_block  (CRLF|WS|COMMENT)*)
  //                 | (imports_block (CRLF|WS|COMMENT)* rule_block  (CRLF|WS|COMMENT)*)
  //                 |(imports_block (CRLF|WS|COMMENT)* configuration_block  (CRLF|WS|COMMENT)*)
  private static boolean module_body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_body_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = module_body_0_0(b, l + 1);
    if (!r) r = module_body_0_1(b, l + 1);
    if (!r) r = module_body_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // imports_block (CRLF|WS|COMMENT)* syntax_block  (CRLF|WS|COMMENT)*
  private static boolean module_body_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_body_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = imports_block(b, l + 1);
    r = r && module_body_0_0_1(b, l + 1);
    r = r && syntax_block(b, l + 1);
    r = r && module_body_0_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (CRLF|WS|COMMENT)*
  private static boolean module_body_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_body_0_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!module_body_0_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "module_body_0_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // CRLF|WS|COMMENT
  private static boolean module_body_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_body_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CRLF);
    if (!r) r = consumeToken(b, WS);
    if (!r) r = consumeToken(b, COMMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // (CRLF|WS|COMMENT)*
  private static boolean module_body_0_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_body_0_0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!module_body_0_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "module_body_0_0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // CRLF|WS|COMMENT
  private static boolean module_body_0_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_body_0_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CRLF);
    if (!r) r = consumeToken(b, WS);
    if (!r) r = consumeToken(b, COMMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // imports_block (CRLF|WS|COMMENT)* rule_block  (CRLF|WS|COMMENT)*
  private static boolean module_body_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_body_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = imports_block(b, l + 1);
    r = r && module_body_0_1_1(b, l + 1);
    r = r && rule_block(b, l + 1);
    r = r && module_body_0_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (CRLF|WS|COMMENT)*
  private static boolean module_body_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_body_0_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!module_body_0_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "module_body_0_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // CRLF|WS|COMMENT
  private static boolean module_body_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_body_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CRLF);
    if (!r) r = consumeToken(b, WS);
    if (!r) r = consumeToken(b, COMMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // (CRLF|WS|COMMENT)*
  private static boolean module_body_0_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_body_0_1_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!module_body_0_1_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "module_body_0_1_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // CRLF|WS|COMMENT
  private static boolean module_body_0_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_body_0_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CRLF);
    if (!r) r = consumeToken(b, WS);
    if (!r) r = consumeToken(b, COMMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // imports_block (CRLF|WS|COMMENT)* configuration_block  (CRLF|WS|COMMENT)*
  private static boolean module_body_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_body_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = imports_block(b, l + 1);
    r = r && module_body_0_2_1(b, l + 1);
    r = r && configuration_block(b, l + 1);
    r = r && module_body_0_2_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (CRLF|WS|COMMENT)*
  private static boolean module_body_0_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_body_0_2_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!module_body_0_2_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "module_body_0_2_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // CRLF|WS|COMMENT
  private static boolean module_body_0_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_body_0_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CRLF);
    if (!r) r = consumeToken(b, WS);
    if (!r) r = consumeToken(b, COMMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // (CRLF|WS|COMMENT)*
  private static boolean module_body_0_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_body_0_2_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!module_body_0_2_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "module_body_0_2_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // CRLF|WS|COMMENT
  private static boolean module_body_0_2_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_body_0_2_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CRLF);
    if (!r) r = consumeToken(b, WS);
    if (!r) r = consumeToken(b, COMMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (CRLF|WS|COMMENT)* module_start (WS|COMMENT)* module_body (WS|COMMENT)* module_end (WS|COMMENT)*
  static boolean module_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_definition")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = module_definition_0(b, l + 1);
    r = r && module_start(b, l + 1);
    r = r && module_definition_2(b, l + 1);
    r = r && module_body(b, l + 1);
    r = r && module_definition_4(b, l + 1);
    r = r && module_end(b, l + 1);
    r = r && module_definition_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (CRLF|WS|COMMENT)*
  private static boolean module_definition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_definition_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!module_definition_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "module_definition_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // CRLF|WS|COMMENT
  private static boolean module_definition_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_definition_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CRLF);
    if (!r) r = consumeToken(b, WS);
    if (!r) r = consumeToken(b, COMMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // (WS|COMMENT)*
  private static boolean module_definition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_definition_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!module_definition_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "module_definition_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // WS|COMMENT
  private static boolean module_definition_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_definition_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WS);
    if (!r) r = consumeToken(b, COMMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // (WS|COMMENT)*
  private static boolean module_definition_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_definition_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!module_definition_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "module_definition_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // WS|COMMENT
  private static boolean module_definition_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_definition_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WS);
    if (!r) r = consumeToken(b, COMMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // (WS|COMMENT)*
  private static boolean module_definition_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_definition_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!module_definition_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "module_definition_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // WS|COMMENT
  private static boolean module_definition_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_definition_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WS);
    if (!r) r = consumeToken(b, COMMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ENDMODULE CRLF*
  public static boolean module_end(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_end")) return false;
    if (!nextTokenIs(b, ENDMODULE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENDMODULE);
    r = r && module_end_1(b, l + 1);
    exit_section_(b, m, MODULE_END, r);
    return r;
  }

  // CRLF*
  private static boolean module_end_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_end_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, CRLF)) break;
      if (!empty_element_parsed_guard_(b, "module_end_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // WS* MODULE WS+ MODULE_NAME WS* CRLF*
  public static boolean module_start(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_start")) return false;
    if (!nextTokenIs(b, "<module start>", MODULE, WS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODULE_START, "<module start>");
    r = module_start_0(b, l + 1);
    r = r && consumeToken(b, MODULE);
    r = r && module_start_2(b, l + 1);
    r = r && consumeToken(b, MODULE_NAME);
    r = r && module_start_4(b, l + 1);
    r = r && module_start_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // WS*
  private static boolean module_start_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_start_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "module_start_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // WS+
  private static boolean module_start_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_start_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WS);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "module_start_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // WS*
  private static boolean module_start_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_start_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "module_start_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // CRLF*
  private static boolean module_start_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_start_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, CRLF)) break;
      if (!empty_element_parsed_guard_(b, "module_start_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // SPECIAL_SIGN WS* (OPTION | TYPE) WS*  SPECIAL_SIGN? CRLF*
  public static boolean precedence_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precedence_")) return false;
    if (!nextTokenIs(b, SPECIAL_SIGN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SPECIAL_SIGN);
    r = r && precedence__1(b, l + 1);
    r = r && precedence__2(b, l + 1);
    r = r && precedence__3(b, l + 1);
    r = r && precedence__4(b, l + 1);
    r = r && precedence__5(b, l + 1);
    exit_section_(b, m, PRECEDENCE_, r);
    return r;
  }

  // WS*
  private static boolean precedence__1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precedence__1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "precedence__1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OPTION | TYPE
  private static boolean precedence__2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precedence__2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPTION);
    if (!r) r = consumeToken(b, TYPE);
    exit_section_(b, m, null, r);
    return r;
  }

  // WS*
  private static boolean precedence__3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precedence__3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "precedence__3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPECIAL_SIGN?
  private static boolean precedence__4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precedence__4")) return false;
    consumeToken(b, SPECIAL_SIGN);
    return true;
  }

  // CRLF*
  private static boolean precedence__5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precedence__5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, CRLF)) break;
      if (!empty_element_parsed_guard_(b, "precedence__5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // (KEY? SEPARATOR VALUE?) | KEY
  public static boolean property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property")) return false;
    if (!nextTokenIs(b, "<property>", KEY, SEPARATOR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY, "<property>");
    r = property_0(b, l + 1);
    if (!r) r = consumeToken(b, KEY);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KEY? SEPARATOR VALUE?
  private static boolean property_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = property_0_0(b, l + 1);
    r = r && consumeToken(b, SEPARATOR);
    r = r && property_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KEY?
  private static boolean property_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_0_0")) return false;
    consumeToken(b, KEY);
    return true;
  }

  // VALUE?
  private static boolean property_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_0_2")) return false;
    consumeToken(b, VALUE);
    return true;
  }

  /* ********************************************************** */
  // ((ID SPECIAL_SIGN TYPE  WS* SPECIAL_SIGN? WS*)+ WS* ID WS* SPECIAL_SIGN TYPE? WS* ID CRLF* condition_? WS* OPTION?)
  //         | ((STRING WS*)+ WS* ID (SPECIAL_SIGN TYPE)? WS* STRING WS* ID (SPECIAL_SIGN TYPE)? WS* SPECIAL_SIGN WS* ID (SPECIAL_SIGN TYPE)? WS* OPTION?)
  //         | (ID? SPECIAL_SIGN? TYPE? WS* (SPECIAL_SIGN WS*) OPTION?)*
  public static boolean rule_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RULE_, "<rule>");
    r = rule__0(b, l + 1);
    if (!r) r = rule__1(b, l + 1);
    if (!r) r = rule__2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (ID SPECIAL_SIGN TYPE  WS* SPECIAL_SIGN? WS*)+ WS* ID WS* SPECIAL_SIGN TYPE? WS* ID CRLF* condition_? WS* OPTION?
  private static boolean rule__0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rule__0_0(b, l + 1);
    r = r && rule__0_1(b, l + 1);
    r = r && consumeToken(b, ID);
    r = r && rule__0_3(b, l + 1);
    r = r && consumeToken(b, SPECIAL_SIGN);
    r = r && rule__0_5(b, l + 1);
    r = r && rule__0_6(b, l + 1);
    r = r && consumeToken(b, ID);
    r = r && rule__0_8(b, l + 1);
    r = r && rule__0_9(b, l + 1);
    r = r && rule__0_10(b, l + 1);
    r = r && rule__0_11(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ID SPECIAL_SIGN TYPE  WS* SPECIAL_SIGN? WS*)+
  private static boolean rule__0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rule__0_0_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!rule__0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rule__0_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ID SPECIAL_SIGN TYPE  WS* SPECIAL_SIGN? WS*
  private static boolean rule__0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ID, SPECIAL_SIGN, TYPE);
    r = r && rule__0_0_0_3(b, l + 1);
    r = r && rule__0_0_0_4(b, l + 1);
    r = r && rule__0_0_0_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WS*
  private static boolean rule__0_0_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__0_0_0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "rule__0_0_0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPECIAL_SIGN?
  private static boolean rule__0_0_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__0_0_0_4")) return false;
    consumeToken(b, SPECIAL_SIGN);
    return true;
  }

  // WS*
  private static boolean rule__0_0_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__0_0_0_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "rule__0_0_0_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // WS*
  private static boolean rule__0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "rule__0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // WS*
  private static boolean rule__0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "rule__0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TYPE?
  private static boolean rule__0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__0_5")) return false;
    consumeToken(b, TYPE);
    return true;
  }

  // WS*
  private static boolean rule__0_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__0_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "rule__0_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // CRLF*
  private static boolean rule__0_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__0_8")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, CRLF)) break;
      if (!empty_element_parsed_guard_(b, "rule__0_8", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // condition_?
  private static boolean rule__0_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__0_9")) return false;
    condition_(b, l + 1);
    return true;
  }

  // WS*
  private static boolean rule__0_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__0_10")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "rule__0_10", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OPTION?
  private static boolean rule__0_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__0_11")) return false;
    consumeToken(b, OPTION);
    return true;
  }

  // (STRING WS*)+ WS* ID (SPECIAL_SIGN TYPE)? WS* STRING WS* ID (SPECIAL_SIGN TYPE)? WS* SPECIAL_SIGN WS* ID (SPECIAL_SIGN TYPE)? WS* OPTION?
  private static boolean rule__1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rule__1_0(b, l + 1);
    r = r && rule__1_1(b, l + 1);
    r = r && consumeToken(b, ID);
    r = r && rule__1_3(b, l + 1);
    r = r && rule__1_4(b, l + 1);
    r = r && consumeToken(b, STRING);
    r = r && rule__1_6(b, l + 1);
    r = r && consumeToken(b, ID);
    r = r && rule__1_8(b, l + 1);
    r = r && rule__1_9(b, l + 1);
    r = r && consumeToken(b, SPECIAL_SIGN);
    r = r && rule__1_11(b, l + 1);
    r = r && consumeToken(b, ID);
    r = r && rule__1_13(b, l + 1);
    r = r && rule__1_14(b, l + 1);
    r = r && rule__1_15(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (STRING WS*)+
  private static boolean rule__1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rule__1_0_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!rule__1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rule__1_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // STRING WS*
  private static boolean rule__1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    r = r && rule__1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WS*
  private static boolean rule__1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__1_0_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "rule__1_0_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // WS*
  private static boolean rule__1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "rule__1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (SPECIAL_SIGN TYPE)?
  private static boolean rule__1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__1_3")) return false;
    rule__1_3_0(b, l + 1);
    return true;
  }

  // SPECIAL_SIGN TYPE
  private static boolean rule__1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SPECIAL_SIGN, TYPE);
    exit_section_(b, m, null, r);
    return r;
  }

  // WS*
  private static boolean rule__1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__1_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "rule__1_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // WS*
  private static boolean rule__1_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__1_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "rule__1_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (SPECIAL_SIGN TYPE)?
  private static boolean rule__1_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__1_8")) return false;
    rule__1_8_0(b, l + 1);
    return true;
  }

  // SPECIAL_SIGN TYPE
  private static boolean rule__1_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__1_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SPECIAL_SIGN, TYPE);
    exit_section_(b, m, null, r);
    return r;
  }

  // WS*
  private static boolean rule__1_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__1_9")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "rule__1_9", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // WS*
  private static boolean rule__1_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__1_11")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "rule__1_11", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (SPECIAL_SIGN TYPE)?
  private static boolean rule__1_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__1_13")) return false;
    rule__1_13_0(b, l + 1);
    return true;
  }

  // SPECIAL_SIGN TYPE
  private static boolean rule__1_13_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__1_13_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SPECIAL_SIGN, TYPE);
    exit_section_(b, m, null, r);
    return r;
  }

  // WS*
  private static boolean rule__1_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__1_14")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "rule__1_14", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OPTION?
  private static boolean rule__1_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__1_15")) return false;
    consumeToken(b, OPTION);
    return true;
  }

  // (ID? SPECIAL_SIGN? TYPE? WS* (SPECIAL_SIGN WS*) OPTION?)*
  private static boolean rule__2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!rule__2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rule__2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ID? SPECIAL_SIGN? TYPE? WS* (SPECIAL_SIGN WS*) OPTION?
  private static boolean rule__2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rule__2_0_0(b, l + 1);
    r = r && rule__2_0_1(b, l + 1);
    r = r && rule__2_0_2(b, l + 1);
    r = r && rule__2_0_3(b, l + 1);
    r = r && rule__2_0_4(b, l + 1);
    r = r && rule__2_0_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ID?
  private static boolean rule__2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__2_0_0")) return false;
    consumeToken(b, ID);
    return true;
  }

  // SPECIAL_SIGN?
  private static boolean rule__2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__2_0_1")) return false;
    consumeToken(b, SPECIAL_SIGN);
    return true;
  }

  // TYPE?
  private static boolean rule__2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__2_0_2")) return false;
    consumeToken(b, TYPE);
    return true;
  }

  // WS*
  private static boolean rule__2_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__2_0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "rule__2_0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SPECIAL_SIGN WS*
  private static boolean rule__2_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__2_0_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SPECIAL_SIGN);
    r = r && rule__2_0_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WS*
  private static boolean rule__2_0_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__2_0_4_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "rule__2_0_4_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OPTION?
  private static boolean rule__2_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule__2_0_5")) return false;
    consumeToken(b, OPTION);
    return true;
  }

  /* ********************************************************** */
  // (WS* RULE WS* rule_ CRLF*)+
  public static boolean rule_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_block")) return false;
    if (!nextTokenIs(b, "<rule block>", RULE, WS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RULE_BLOCK, "<rule block>");
    r = rule_block_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!rule_block_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rule_block", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // WS* RULE WS* rule_ CRLF*
  private static boolean rule_block_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_block_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rule_block_0_0(b, l + 1);
    r = r && consumeToken(b, RULE);
    r = r && rule_block_0_2(b, l + 1);
    r = r && rule_(b, l + 1);
    r = r && rule_block_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WS*
  private static boolean rule_block_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_block_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "rule_block_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // WS*
  private static boolean rule_block_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_block_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "rule_block_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // CRLF*
  private static boolean rule_block_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_block_0_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, CRLF)) break;
      if (!empty_element_parsed_guard_(b, "rule_block_0_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // TYPE WS+ ASSIGN WS+ expression_block
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    if (!nextTokenIs(b, TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPE);
    r = r && statement_1(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && statement_3(b, l + 1);
    r = r && expression_block(b, l + 1);
    exit_section_(b, m, STATEMENT, r);
    return r;
  }

  // WS+
  private static boolean statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WS);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "statement_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // WS+
  private static boolean statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WS);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "statement_3", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (WS* SYNTAX WS+ statement CRLF*)+
  public static boolean syntax_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntax_block")) return false;
    if (!nextTokenIs(b, "<syntax block>", SYNTAX, WS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYNTAX_BLOCK, "<syntax block>");
    r = syntax_block_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!syntax_block_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "syntax_block", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // WS* SYNTAX WS+ statement CRLF*
  private static boolean syntax_block_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntax_block_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = syntax_block_0_0(b, l + 1);
    r = r && consumeToken(b, SYNTAX);
    r = r && syntax_block_0_2(b, l + 1);
    r = r && statement(b, l + 1);
    r = r && syntax_block_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WS*
  private static boolean syntax_block_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntax_block_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "syntax_block_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // WS+
  private static boolean syntax_block_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntax_block_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WS);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "syntax_block_0_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // CRLF*
  private static boolean syntax_block_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntax_block_0_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, CRLF)) break;
      if (!empty_element_parsed_guard_(b, "syntax_block_0_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

}