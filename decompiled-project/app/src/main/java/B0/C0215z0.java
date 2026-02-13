package B0;

import android.os.Bundle;
import c.AbstractActivityC0867k;
import c.C0865i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l2.EnumC1474s;

/* renamed from: B0.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0215z0 implements Q2.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2028a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2029b;

    public /* synthetic */ C0215z0(Object obj, int i7) {
        this.f2028a = i7;
        this.f2029b = obj;
    }

    @Override // Q2.d
    public final Bundle a() {
        W1.U j;
        Db.j[] jVarArr;
        Object obj = this.f2029b;
        switch (this.f2028a) {
            case 0:
                Map c10 = ((Z.k) obj).c();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : c10.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
            case 1:
                W1.G g = (W1.G) obj;
                do {
                    j = g.j();
                    EnumC1474s enumC1474s = EnumC1474s.f19227a;
                } while (W1.G.k(j));
                g.f10316J.d(l2.r.ON_STOP);
                return new Bundle();
            case 2:
                return ((W1.U) obj).Y();
            case 3:
                Bundle bundle2 = new Bundle();
                C0865i c0865i = ((AbstractActivityC0867k) obj).f14055w;
                c0865i.getClass();
                LinkedHashMap linkedHashMap = c0865i.f14032b;
                bundle2.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0865i.f14034d));
                bundle2.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(c0865i.g));
                return bundle2;
            default:
                A9.O0 o02 = (A9.O0) obj;
                for (Map.Entry entry2 : Eb.B.L((LinkedHashMap) o02.f925d).entrySet()) {
                    o02.A(((fc.b0) ((fc.J) entry2.getValue())).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : Eb.B.L((LinkedHashMap) o02.f923b).entrySet()) {
                    o02.A(((Q2.d) entry3.getValue()).a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) o02.f922a;
                if (linkedHashMap2.isEmpty()) {
                    jVarArr = new Db.j[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        arrayList.add(new Db.j((String) entry4.getKey(), entry4.getValue()));
                    }
                    jVarArr = (Db.j[]) arrayList.toArray(new Db.j[0]);
                }
                return com.bumptech.glide.c.f((Db.j[]) Arrays.copyOf(jVarArr, jVarArr.length));
        }
    }
}
