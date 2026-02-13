package O7;

import G8.m;
import L7.C0385e;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.viewmodels.BaseTVChannelViewModel;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import jb.InterfaceC1393d;

/* loaded from: classes.dex */
public final class e implements f, InterfaceC1393d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7492a;

    public e() {
        this.f7492a = new ArrayList();
    }

    public e(BaseTVChannelViewModel baseTVChannelViewModel, ArrayList arrayList) {
        this.f7492a = arrayList;
    }

    public e(ArrayList arrayList) {
        this.f7492a = arrayList;
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
        List<TVChannel> it = (List) obj;
        kotlin.jvm.internal.l.e(it, "it");
        String message = "Response data: " + new m().f(it);
        kotlin.jvm.internal.l.e(message, "message");
        for (TVChannel tVChannel : it) {
            ArrayList arrayList = this.f7492a;
            if (!arrayList.contains(tVChannel)) {
                arrayList.add(tVChannel);
            }
        }
    }

    @Override // O7.f
    public Object l(C0385e c0385e, Object obj, Object obj2) {
        this.f7492a.add(new AbstractMap.SimpleImmutableEntry(c0385e, obj));
        return null;
    }
}
