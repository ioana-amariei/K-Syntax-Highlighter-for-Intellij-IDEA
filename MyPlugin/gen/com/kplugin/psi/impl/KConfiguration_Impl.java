// This is a generated file. Not intended for manual editing.
package com.kplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.kplugin.psi.KTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.kplugin.psi.*;

public class KConfiguration_Impl extends ASTWrapperPsiElement implements KConfiguration_ {

  public KConfiguration_Impl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KVisitor visitor) {
    visitor.visitConfiguration_(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KVisitor) accept((KVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public KCellContent getCellContent() {
    return findNotNullChildByClass(KCellContent.class);
  }

  @Override
  @NotNull
  public KCellEnd getCellEnd() {
    return findNotNullChildByClass(KCellEnd.class);
  }

  @Override
  @NotNull
  public KCellStart getCellStart() {
    return findNotNullChildByClass(KCellStart.class);
  }

}
