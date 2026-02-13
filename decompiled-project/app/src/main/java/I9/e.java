package I9;

import Eb.o;
import android.text.format.DateUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import jb.InterfaceC1393d;
import kotlin.jvm.internal.l;
import va.C2161e;
import y9.D;
import y9.G;

/* loaded from: classes2.dex */
public final class e implements InterfaceC1393d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5319a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2161e f5320b;

    public /* synthetic */ e(C2161e c2161e, int i7) {
        this.f5319a = i7;
        this.f5320b = c2161e;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Comparator] */
    @Override // jb.InterfaceC1393d
    public final void accept(Object obj) {
        switch (this.f5319a) {
            case 0:
                List it = (List) obj;
                l.e(it, "it");
                String.valueOf(it);
                if (it.isEmpty()) {
                    int i7 = L9.c.f6423d;
                    L9.b l10 = U9.j.l(4, "Empty program found");
                    this.f5320b.get_listProgramForChannel().l(new D(l10));
                    this.f5320b.get_programmeForChannelLiveData().l(new D(l10));
                    return;
                }
                if (it.size() <= 1) {
                    int i10 = L9.c.f6423d;
                    this.f5320b.get_listProgramForChannel().l(new D(U9.j.l(4, "Only 1 program found")));
                    this.f5320b.get_programmeForChannelLiveData().l(new G(o.Y(it)));
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : it) {
                    if (DateUtils.isToday(((N9.a) obj2).d())) {
                        arrayList.add(obj2);
                    }
                }
                List<N9.a> n02 = o.n0(new Object(), arrayList);
                String message = "Thread oldProgramList: " + n02;
                l.e(message, "message");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : n02) {
                    if (DateUtils.isToday(((N9.a) obj3).d())) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList u02 = o.u0(arrayList2);
                for (N9.a aVar : n02) {
                    if (aVar.c()) {
                        synchronized (u02) {
                            try {
                                for (N9.a aVar2 : n02) {
                                    if (aVar2.c()) {
                                        if (l.a(aVar2.f7391c, aVar.f7391c) && l.a(aVar2.f7393e, aVar.f7393e)) {
                                        }
                                        u02.remove(aVar2);
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        this.f5320b.get_listProgramForChannel().l(new G(u02));
                        try {
                            for (Object obj4 : it) {
                                if (((N9.a) obj4).c()) {
                                    this.f5320b.get_programmeForChannelLiveData().l(new G((N9.a) obj4));
                                    return;
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        } catch (NoSuchElementException e2) {
                            this.f5320b.get_programmeForChannelLiveData().l(new D(e2));
                            return;
                        }
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            default:
                Throwable it2 = (Throwable) obj;
                l.e(it2, "it");
                A3.c.r(it2, this.f5320b.b());
                return;
        }
    }
}
