// This is a generated file. Not intended for manual editing.
package com.kplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KRule_ extends PsiElement {

  @Nullable
  KCondition_ getCondition_();

  @Nullable
  KListOptions getListOptions();

  @NotNull
  List<KSpecialRule> getSpecialRuleList();

}
