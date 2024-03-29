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

public class KRule_Impl extends ASTWrapperPsiElement implements KRule_ {

  public KRule_Impl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KVisitor visitor) {
    visitor.visitRule_(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KVisitor) accept((KVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public KCondition_ getCondition_() {
    return findChildByClass(KCondition_.class);
  }

  @Override
  @Nullable
  public KListOptions getListOptions() {
    return findChildByClass(KListOptions.class);
  }

  @Override
  @NotNull
  public List<KSpecialRule> getSpecialRuleList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KSpecialRule.class);
  }

}
