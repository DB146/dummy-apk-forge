package a3;

import android.view.View;
import java.util.ArrayList;

/* renamed from: a3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0732i implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f12542b;

    public C0732i(View view, ArrayList arrayList) {
        this.f12541a = view;
        this.f12542b = arrayList;
    }

    @Override // a3.s
    public final void b() {
    }

    @Override // a3.s
    public final void c() {
    }

    @Override // a3.s
    public final void d(u uVar) {
        uVar.B(this);
        this.f12541a.setVisibility(8);
        ArrayList arrayList = this.f12542b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((View) arrayList.get(i7)).setVisibility(0);
        }
    }

    @Override // a3.s
    public final void e(u uVar) {
        uVar.B(this);
        uVar.a(this);
    }

    @Override // a3.s
    public final void f(u uVar) {
    }
}
