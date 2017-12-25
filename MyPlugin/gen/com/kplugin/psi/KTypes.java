// This is a generated file. Not intended for manual editing.
package com.kplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.kplugin.psi.impl.*;

public interface KTypes {

  IElementType IMPORTS_BLOCK = new KElementType("IMPORTS_BLOCK");
  IElementType ITEM_ = new KElementType("ITEM_");
  IElementType PROPERTY = new KElementType("PROPERTY");

  IElementType COMMENT = new KTokenType("COMMENT");
  IElementType CRLF = new KTokenType("CRLF");
  IElementType ENDMODULE = new KTokenType("ENDMODULE");
  IElementType IMPORTS = new KTokenType("IMPORTS");
  IElementType KEY = new KTokenType("KEY");
  IElementType MODULE = new KTokenType("MODULE");
  IElementType MODULE_NAME = new KTokenType("MODULE_NAME");
  IElementType SEPARATOR = new KTokenType("SEPARATOR");
  IElementType VALUE = new KTokenType("VALUE");
  IElementType WHITE_SPACE = new KTokenType("WHITE_SPACE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == IMPORTS_BLOCK) {
        return new KImportsBlockImpl(node);
      }
      else if (type == ITEM_) {
        return new KItem_Impl(node);
      }
      else if (type == PROPERTY) {
        return new KPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
