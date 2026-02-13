package Ia;

import android.util.Log;
import com.kt.apps.core.tv.model.TVChannel;
import gb.i;
import java.util.ArrayList;
import java.util.List;
import jb.InterfaceC1392c;
import jb.InterfaceC1394e;
import jb.InterfaceC1395f;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class e implements InterfaceC1394e, InterfaceC1395f, InterfaceC1392c {

    /* renamed from: a, reason: collision with root package name */
    public static final e f5342a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final e f5343b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final e f5344c = new Object();

    @Override // jb.InterfaceC1394e
    public Object apply(Object obj) {
        List it = (List) obj;
        l.e(it, "it");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : it) {
            if (!((TVChannel) obj2).isRadio()) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : it) {
            if (((TVChannel) obj3).isRadio()) {
                arrayList2.add(obj3);
            }
        }
        return i.k(arrayList, arrayList2);
    }

    @Override // jb.InterfaceC1395f
    public boolean test(Object obj) {
        List it = (List) obj;
        l.e(it, "it");
        return !it.isEmpty();
    }

    @Override // jb.InterfaceC1392c
    public boolean w(Integer num, Throwable th) {
        l.e(th, "<unused var>");
        Log.e("TAG", "ThreadName: " + Thread.currentThread().getName());
        Thread.sleep(((long) num.intValue()) * 2000);
        return num.intValue() < 3;
    }
}
