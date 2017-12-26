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
    if (t == EXPRESSION_) {
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
    else if (t == PROPERTY) {
      r = property(b, 0);
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
  // TYPE
  //                 | (SIGN TYPE SIGN)
  //                 | (TYPE OPERATION TYPE)
  public static boolean expression_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_")) return false;
    if (!nextTokenIs(b, "<expression>", SIGN, TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_, "<expression>");
    r = consumeToken(b, TYPE);
    if (!r) r = expression__1(b, l + 1);
    if (!r) r = expression__2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SIGN TYPE SIGN
  private static boolean expression__1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression__1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SIGN, TYPE, SIGN);
    exit_section_(b, m, null, r);
    return r;
  }

  // TYPE OPERATION TYPE
  private static boolean expression__2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression__2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TYPE, OPERATION, TYPE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (WS* expression_ WS* list_options? CRLF* WS* OR_SIGN?)+
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

  // WS* expression_ WS* list_options? CRLF* WS* OR_SIGN?
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

  // OR_SIGN?
  private static boolean expression_block_0_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_block_0_6")) return false;
    consumeToken(b, OR_SIGN);
    return true;
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
  // header_block module_definition+
  static boolean kFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "kFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = header_block(b, l + 1);
    r = r && kFile_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // module_definition+
  private static boolean kFile_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "kFile_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = module_definition(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!module_definition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "kFile_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
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
  // (imports_block CRLF* syntax_block CRLF*) | (imports_block CRLF* rule_block CRLF*)
  public static boolean module_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODULE_BODY, "<module body>");
    r = module_body_0(b, l + 1);
    if (!r) r = module_body_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // imports_block CRLF* syntax_block CRLF*
  private static boolean module_body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_body_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = imports_block(b, l + 1);
    r = r && module_body_0_1(b, l + 1);
    r = r && syntax_block(b, l + 1);
    r = r && module_body_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CRLF*
  private static boolean module_body_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_body_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, CRLF)) break;
      if (!empty_element_parsed_guard_(b, "module_body_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // CRLF*
  private static boolean module_body_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_body_0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, CRLF)) break;
      if (!empty_element_parsed_guard_(b, "module_body_0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // imports_block CRLF* rule_block CRLF*
  private static boolean module_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_body_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = imports_block(b, l + 1);
    r = r && module_body_1_1(b, l + 1);
    r = r && rule_block(b, l + 1);
    r = r && module_body_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CRLF*
  private static boolean module_body_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_body_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, CRLF)) break;
      if (!empty_element_parsed_guard_(b, "module_body_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // CRLF*
  private static boolean module_body_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_body_1_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, CRLF)) break;
      if (!empty_element_parsed_guard_(b, "module_body_1_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // module_start module_body module_end
  static boolean module_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_definition")) return false;
    if (!nextTokenIs(b, "", MODULE, WS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = module_start(b, l + 1);
    r = r && module_body(b, l + 1);
    r = r && module_end(b, l + 1);
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
  // RULE
  public static boolean rule_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_block")) return false;
    if (!nextTokenIs(b, RULE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RULE);
    exit_section_(b, m, RULE_BLOCK, r);
    return r;
  }

  /* ********************************************************** */
  // SYNTAX WS+ TYPE WS+ ASSIGN WS+ expression_block
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    if (!nextTokenIs(b, SYNTAX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYNTAX);
    r = r && statement_1(b, l + 1);
    r = r && consumeToken(b, TYPE);
    r = r && statement_3(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && statement_5(b, l + 1);
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

  // WS+
  private static boolean statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WS);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, WS)) break;
      if (!empty_element_parsed_guard_(b, "statement_5", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // statement+
  public static boolean syntax_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntax_block")) return false;
    if (!nextTokenIs(b, SYNTAX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "syntax_block", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, SYNTAX_BLOCK, r);
    return r;
  }

}
