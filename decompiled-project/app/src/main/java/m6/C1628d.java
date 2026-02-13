package m6;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;

/* renamed from: m6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1628d extends I1.a {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f20691q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1628d(Chip chip, Chip chip2) {
        super(chip2);
        this.f20691q = chip;
    }

    @Override // I1.a
    public final void l(ArrayList arrayList) {
        C1630f c1630f;
        arrayList.add(0);
        Rect rect = Chip.L;
        Chip chip = this.f20691q;
        if (!chip.c() || (c1630f = chip.f15277e) == null || !c1630f.f20724Y || chip.f15280v == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // I1.a
    public final void o(int i7, z1.e eVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f28173a;
        if (i7 != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.L);
            return;
        }
        Chip chip = this.f20691q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
        eVar.b(z1.d.f28159e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
