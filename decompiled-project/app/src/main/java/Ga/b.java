package Ga;

import A0.G0;
import Ba.o;
import C.F;
import E.q;
import Eb.v;
import android.content.Context;
import android.os.Bundle;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.t;
import v2.C2133e;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4406a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4407b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4408c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4410e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4411f;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f4406a = i7;
        this.f4407b = obj;
        this.f4408c = obj2;
        this.f4409d = obj3;
        this.f4410e = obj4;
        this.f4411f = obj5;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        List list;
        switch (this.f4406a) {
            case 0:
                E.h LazyColumn = (E.h) obj;
                kotlin.jvm.internal.l.e(LazyColumn, "$this$LazyColumn");
                LazyColumn.f3411a.d(1, new G0(new E.f("SpacerTop", 0), new q(1, 3), new Y.e(-1010194746, new E.g(new Y.e(561525144, new h((TVChannelLinkStream) this.f4408c, (F) this.f4409d), true), 0), true), 11));
                List list2 = (List) this.f4407b;
                E.h.a(LazyColumn, list2.size(), new o(list2, 8), new Y.e(-532679903, new m(list2, (Rb.c) this.f4410e, (Context) this.f4411f), true));
                return Db.q.f3365a;
            default:
                C2133e entry = (C2133e) obj;
                kotlin.jvm.internal.l.e(entry, "entry");
                ((r) this.f4407b).f19130a = true;
                ArrayList arrayList = (ArrayList) this.f4408c;
                int indexOf = arrayList.indexOf(entry);
                if (indexOf != -1) {
                    t tVar = (t) this.f4409d;
                    int i7 = indexOf + 1;
                    list = arrayList.subList(tVar.f19132a, i7);
                    tVar.f19132a = i7;
                } else {
                    list = v.f3891a;
                }
                ((y2.f) this.f4410e).a(entry.f24967b, (Bundle) this.f4411f, entry, list);
                return Db.q.f3365a;
        }
    }
}
