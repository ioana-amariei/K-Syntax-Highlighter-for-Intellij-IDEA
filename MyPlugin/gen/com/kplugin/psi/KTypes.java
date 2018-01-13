// This is a generated file. Not intended for manual editing.
package com.kplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.kplugin.psi.impl.*;

public interface KTypes {

  IElementType CELL_CONTENT = new KElementType("CELL_CONTENT");
  IElementType CELL_END = new KElementType("CELL_END");
  IElementType CELL_START = new KElementType("CELL_START");
  IElementType CONDITION_ = new KElementType("CONDITION_");
  IElementType CONFIGURATION_ = new KElementType("CONFIGURATION_");
  IElementType CONFIGURATION_BLOCK = new KElementType("CONFIGURATION_BLOCK");
  IElementType CONTENT = new KElementType("CONTENT");
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
  IElementType PRECEDENCE_ = new KElementType("PRECEDENCE_");
  IElementType PROPERTY = new KElementType("PROPERTY");
  IElementType RULE_ = new KElementType("RULE_");
  IElementType RULE_BLOCK = new KElementType("RULE_BLOCK");
  IElementType SPECIAL_RULE = new KElementType("SPECIAL_RULE");
  IElementType STATEMENT = new KElementType("STATEMENT");
  IElementType SYNTAX_BLOCK = new KElementType("SYNTAX_BLOCK");

  IElementType ASSIGN = new KTokenType("ASSIGN");
  IElementType COMMENT = new KTokenType("COMMENT");
  IElementType CONFIGURATION = new KTokenType("CONFIGURATION");
  IElementType CRLF = new KTokenType("CRLF");
  IElementType ENDMODULE = new KTokenType("ENDMODULE");
  IElementType ID = new KTokenType("ID");
  IElementType IMPORTS = new KTokenType("IMPORTS");
  IElementType KEY = new KTokenType("KEY");
  IElementType MODULE = new KTokenType("MODULE");
  IElementType MODULE_NAME = new KTokenType("MODULE_NAME");
  IElementType OPTION = new KTokenType("OPTION");
  IElementType PGM = new KTokenType("PGM");
  IElementType REQUIRE = new KTokenType("REQUIRE");
  IElementType RULE = new KTokenType("RULE");
  IElementType SEPARATOR = new KTokenType("SEPARATOR");
  IElementType SPECIAL_SIGN = new KTokenType("SPECIAL_SIGN");
  IElementType STRING = new KTokenType("STRING");
  IElementType STRING_VALUE = new KTokenType("STRING_VALUE");
  IElementType SYNTAX = new KTokenType("SYNTAX");
  IElementType TYPE = new KTokenType("TYPE");
  IElementType VALUE = new KTokenType("VALUE");
  IElementType WHEN = new KTokenType("WHEN");
  IElementType WS = new KTokenType("WS");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == CELL_CONTENT) {
        return new KCellContentImpl(node);
      }
      else if (type == CELL_END) {
        return new KCellEndImpl(node);
      }
      else if (type == CELL_START) {
        return new KCellStartImpl(node);
      }
      else if (type == CONDITION_) {
        return new KCondition_Impl(node);
      }
      else if (type == CONFIGURATION_) {
        return new KConfiguration_Impl(node);
      }
      else if (type == CONFIGURATION_BLOCK) {
        return new KConfigurationBlockImpl(node);
      }
      else if (type == CONTENT) {
        return new KContentImpl(node);
      }
      else if (type == EXPRESSION_) {
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
      else if (type == PRECEDENCE_) {
        return new KPrecedence_Impl(node);
      }
      else if (type == PROPERTY) {
        return new KPropertyImpl(node);
      }
      else if (type == RULE_) {
        return new KRule_Impl(node);
      }
      else if (type == RULE_BLOCK) {
        return new KRuleBlockImpl(node);
      }
      else if (type == SPECIAL_RULE) {
        return new KSpecialRuleImpl(node);
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
