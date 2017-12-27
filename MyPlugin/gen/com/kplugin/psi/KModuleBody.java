// This is a generated file. Not intended for manual editing.
package com.kplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KModuleBody extends PsiElement {

  @NotNull
  List<KConfigurationBlock> getConfigurationBlockList();

  @NotNull
  List<KImportsBlock> getImportsBlockList();

  @NotNull
  List<KRuleBlock> getRuleBlockList();

  @NotNull
  List<KSyntaxBlock> getSyntaxBlockList();

}
