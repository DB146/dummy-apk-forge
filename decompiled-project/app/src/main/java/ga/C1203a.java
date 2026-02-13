package ga;

import W9.b;
import W9.c;
import java.util.ArrayList;
import java.util.List;
import jb.InterfaceC1394e;
import jb.InterfaceC1395f;
import kotlin.jvm.internal.l;

/* renamed from: ga.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1203a implements InterfaceC1395f, InterfaceC1394e {

    /* renamed from: a, reason: collision with root package name */
    public static final C1203a f17481a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C1203a f17482b = new Object();

    @Override // jb.InterfaceC1394e
    public Object apply(Object obj) {
        List it = (List) obj;
        l.e(it, "it");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : it) {
            if (((c) obj2).j != b.f10856b) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @Override // jb.InterfaceC1395f
    public boolean test(Object obj) {
        c it = (c) obj;
        l.e(it, "it");
        return it.f10862e < it.f10863f;
    }
}
