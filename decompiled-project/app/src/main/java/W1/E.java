package W1;

import android.os.Bundle;
import c.AbstractActivityC0867k;
import c.C0865i;
import e.InterfaceC1073a;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class E implements InterfaceC1073a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10308a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0867k f10309b;

    public /* synthetic */ E(AbstractActivityC0867k abstractActivityC0867k, int i7) {
        this.f10308a = i7;
        this.f10309b = abstractActivityC0867k;
    }

    @Override // e.InterfaceC1073a
    public final void a(AbstractActivityC0867k it) {
        switch (this.f10308a) {
            case 0:
                F f4 = (F) ((G) this.f10309b).f10315I.f8074b;
                f4.f10313d.b(f4, f4, null);
                return;
            default:
                kotlin.jvm.internal.l.e(it, "it");
                AbstractActivityC0867k abstractActivityC0867k = this.f10309b;
                Bundle o10 = ((q3.s) abstractActivityC0867k.f14050d.f23372c).o("android:support:activity-result");
                if (o10 != null) {
                    C0865i c0865i = abstractActivityC0867k.f14055w;
                    c0865i.getClass();
                    ArrayList<Integer> integerArrayList = o10.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = o10.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = o10.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        c0865i.f14034d.addAll(stringArrayList2);
                    }
                    Bundle bundle = o10.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    Bundle bundle2 = c0865i.g;
                    if (bundle != null) {
                        bundle2.putAll(bundle);
                    }
                    int size = stringArrayList.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        String str = stringArrayList.get(i7);
                        LinkedHashMap linkedHashMap = c0865i.f14032b;
                        boolean containsKey = linkedHashMap.containsKey(str);
                        LinkedHashMap linkedHashMap2 = c0865i.f14031a;
                        if (containsKey) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (!bundle2.containsKey(str)) {
                                kotlin.jvm.internal.y.a(linkedHashMap2).remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i7);
                        kotlin.jvm.internal.l.d(num2, "rcs[i]");
                        int intValue = num2.intValue();
                        String str2 = stringArrayList.get(i7);
                        kotlin.jvm.internal.l.d(str2, "keys[i]");
                        String str3 = str2;
                        linkedHashMap2.put(Integer.valueOf(intValue), str3);
                        linkedHashMap.put(str3, Integer.valueOf(intValue));
                    }
                    return;
                }
                return;
        }
    }
}
