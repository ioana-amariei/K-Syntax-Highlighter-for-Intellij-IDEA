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

public class KModuleBodyImpl extends ASTWrapperPsiElement implements KModuleBody {

  public KModuleBodyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KVisitor visitor) {
    visitor.visitModuleBody(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KVisitor) accept((KVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<KConfigurationBlock> getConfigurationBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KConfigurationBlock.class);
  }

  @Override
  @NotNull
  public List<KImportsBlock> getImportsBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KImportsBlock.class);
  }

  @Override
  @NotNull
  public List<KRuleBlock> getRuleBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KRuleBlock.class);
  }

  @Override
  @NotNull
  public List<KSyntaxBlock> getSyntaxBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KSyntaxBlock.class);
  }

}
