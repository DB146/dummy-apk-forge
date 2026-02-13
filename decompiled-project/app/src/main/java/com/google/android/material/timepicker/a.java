package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import s6.n;

/* loaded from: classes.dex */
public final class a extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f15551a;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.f15551a = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f15551a;
        if (isEmpty) {
            chipTextInputComboView.f15520a.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            return;
        }
        String a9 = ChipTextInputComboView.a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f15520a;
        if (TextUtils.isEmpty(a9)) {
            a9 = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chip.setText(a9);
    }
}
