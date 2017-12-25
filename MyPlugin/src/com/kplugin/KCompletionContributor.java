package com.kplugin;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import com.kplugin.psi.KTypes;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

/**
 * Created by AMI on 2017-12-23.
 */


public class KCompletionContributor extends CompletionContributor {
    private static final List <String> suggestions =
            Arrays.asList(
                    "module");

    public KCompletionContributor() {
        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement(KTypes.MODULE).withLanguage(KLanguage.INSTANCE),
                new CompletionProvider <CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        for (String suggestion : suggestions) {
                            resultSet.addElement(LookupElementBuilder.create(suggestion));
                        }
                    }
                }
        );
    }
}


