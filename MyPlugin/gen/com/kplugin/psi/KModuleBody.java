// This is a generated file. Not intended for manual editing.
package com.kplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KModuleBody extends PsiElement {

  @NotNull
  KImportsBlock getImportsBlock();

  @Nullable
  KRuleBlock getRuleBlock();

  @Nullable
  KSyntaxBlock getSyntaxBlock();

}