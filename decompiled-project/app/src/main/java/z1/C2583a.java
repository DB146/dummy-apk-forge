package z1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: z1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2583a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f28155a;

    /* renamed from: b, reason: collision with root package name */
    public final e f28156b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28157c;

    public C2583a(int i7, e eVar, int i10) {
        this.f28155a = i7;
        this.f28156b = eVar;
        this.f28157c = i10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f28155a);
        this.f28156b.f28173a.performAction(this.f28157c, bundle);
    }
}
