package ua;

import A9.I1;
import Q7.h;
import T3.g;
import android.graphics.drawable.Drawable;
import android.util.Log;
import i2.C1321i;
import java.util.ArrayList;
import kotlin.jvm.internal.l;

/* renamed from: ua.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2120c extends g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1321i f24908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f24909e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2120c(int i7, int i10, C1321i c1321i, e eVar) {
        super(i7, i10);
        this.f24908d = c1321i;
        this.f24909e = eVar;
    }

    @Override // T3.i
    public final void i(Object obj) {
        Drawable drawable = (Drawable) obj;
        Log.d("VideoDetailsFragment", "details overview card image url ready: " + drawable);
        this.f24908d.a(drawable);
        h hVar = this.f24909e.f24917g1;
        if (hVar == null) {
            l.j("mAdapter");
            throw null;
        }
        ((I1) hVar.f8695b).d(((ArrayList) hVar.f8697d).size());
    }
}
