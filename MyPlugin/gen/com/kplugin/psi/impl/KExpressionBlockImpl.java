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

public class KExpressionBlockImpl extends ASTWrapperPsiElement implements KExpressionBlock {

  public KExpressionBlockImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KVisitor visitor) {
    visitor.visitExpressionBlock(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KVisitor) accept((KVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<KExpression_> getExpression_List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KExpression_.class);
  }

  @Override
  @NotNull
  public List<KListOptions> getListOptionsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KListOptions.class);
  }

  @Override
  @NotNull
  public List<KPrecedence_> getPrecedence_List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KPrecedence_.class);
  }

}
