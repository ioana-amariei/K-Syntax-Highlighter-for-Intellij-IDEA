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
    if (t == IMPORTS_BLOCK) {
      r = imports_block(b, 0);
    }
    else if (t == ITEM_) {
      r = item_(b, 0);
    }
    else if (t == PROPERTY) {
      r = property(b, 0);
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
  // IMPORTS WHITE_SPACE MODULE_NAME CRLF
  public static boolean imports_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "imports_block")) return false;
    if (!nextTokenIs(b, IMPORTS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IMPORTS, WHITE_SPACE, MODULE_NAME, CRLF);
    exit_section_(b, m, IMPORTS_BLOCK, r);
    return r;
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
  // module_*
  static boolean kFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "kFile")) return false;
    int c = current_position_(b);
    while (true) {
      if (!module_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "kFile", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // MODULE WHITE_SPACE MODULE_NAME CRLF imports_block* ENDMODULE CRLF
  static boolean module_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_")) return false;
    if (!nextTokenIs(b, MODULE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MODULE, WHITE_SPACE, MODULE_NAME, CRLF);
    r = r && module__4(b, l + 1);
    r = r && consumeTokens(b, 0, ENDMODULE, CRLF);
    exit_section_(b, m, null, r);
    return r;
  }

  // imports_block*
  private static boolean module__4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module__4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!imports_block(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "module__4", c)) break;
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

}
