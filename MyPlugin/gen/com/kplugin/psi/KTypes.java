// This is a generated file. Not intended for manual editing.
package com.kplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.kplugin.psi.impl.*;

public interface KTypes {

  IElementType EXPRESSION_ = new KElementType("EXPRESSION_");
  IElementType EXPRESSION_BLOCK = new KElementType("EXPRESSION_BLOCK");
  IElementType HEADER_BLOCK = new KElementType("HEADER_BLOCK");
  IElementType HEADER_LINE = new KElementType("HEADER_LINE");
  IElementType IMPORTS_BLOCK = new KElementType("IMPORTS_BLOCK");
  IElementType IMPORTS_LINE = new KElementType("IMPORTS_LINE");
  IElementType ITEM_ = new KElementType("ITEM_");
  IElementType LIST_OPTIONS = new KElementType("LIST_OPTIONS");
  IElementType MODULE_BODY = new KElementType("MODULE_BODY");
  IElementType MODULE_END = new KElementType("MODULE_END");
  IElementType MODULE_START = new KElementType("MODULE_START");
  IElementType PROPERTY = new KElementType("PROPERTY");
  IElementType RULE_BLOCK = new KElementType("RULE_BLOCK");
  IElementType STATEMENT = new KElementType("STATEMENT");
  IElementType SYNTAX_BLOCK = new KElementType("SYNTAX_BLOCK");

  IElementType ASSIGN = new KTokenType("ASSIGN");
  IElementType COMMENT = new KTokenType("COMMENT");
  IElementType CRLF = new KTokenType("CRLF");
  IElementType ENDMODULE = new KTokenType("ENDMODULE");
  IElementType IMPORTS = new KTokenType("IMPORTS");
  IElementType KEY = new KTokenType("KEY");
  IElementType MODULE = new KTokenType("MODULE");
  IElementType MODULE_NAME = new KTokenType("MODULE_NAME");
  IElementType OPTION = new KTokenType("OPTION");
  IElementType OR_SIGN = new KTokenType("OR_SIGN");
  IElementType REQUIRE = new KTokenType("REQUIRE");
  IElementType RULE = new KTokenType("RULE");
  IElementType SEPARATOR = new KTokenType("SEPARATOR");
  IElementType SIGN = new KTokenType("SIGN");
  IElementType SYNTAX = new KTokenType("SYNTAX");
  IElementType TYPE = new KTokenType("TYPE");
  IElementType VALUE = new KTokenType("VALUE");
  IElementType WS = new KTokenType("WS");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == EXPRESSION_) {
        return new KExpression_Impl(node);
      }
      else if (type == EXPRESSION_BLOCK) {
        return new KExpressionBlockImpl(node);
      }
      else if (type == HEADER_BLOCK) {
        return new KHeaderBlockImpl(node);
      }
      else if (type == HEADER_LINE) {
        return new KHeaderLineImpl(node);
      }
      else if (type == IMPORTS_BLOCK) {
        return new KImportsBlockImpl(node);
      }
      else if (type == IMPORTS_LINE) {
        return new KImportsLineImpl(node);
      }
      else if (type == ITEM_) {
        return new KItem_Impl(node);
      }
      else if (type == LIST_OPTIONS) {
        return new KListOptionsImpl(node);
      }
      else if (type == MODULE_BODY) {
        return new KModuleBodyImpl(node);
      }
      else if (type == MODULE_END) {
        return new KModuleEndImpl(node);
      }
      else if (type == MODULE_START) {
        return new KModuleStartImpl(node);
      }
      else if (type == PROPERTY) {
        return new KPropertyImpl(node);
      }
      else if (type == RULE_BLOCK) {
        return new KRuleBlockImpl(node);
      }
      else if (type == STATEMENT) {
        return new KStatementImpl(node);
      }
      else if (type == SYNTAX_BLOCK) {
        return new KSyntaxBlockImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
