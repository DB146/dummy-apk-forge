package Z6;

import N6.L;
import Y5.D0;
import android.os.Bundle;
import c7.C0912a;
import c7.C0914c;
import c7.InterfaceC0913b;
import com.google.android.gms.common.internal.G;
import d7.AbstractC1054a;
import j8.InterfaceC1387b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1387b f12205a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f12206b = null;

    public c(InterfaceC1387b interfaceC1387b) {
        this.f12205a = interfaceC1387b;
    }

    public static boolean a(ArrayList arrayList, b bVar) {
        String str = bVar.f12199a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar2 = (b) it.next();
            if (bVar2.f12199a.equals(str) && bVar2.f12200b.equals(bVar.f12200b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, c7.a] */
    public final ArrayList b() {
        C0914c c0914c = (C0914c) ((InterfaceC0913b) this.f12205a.get());
        c0914c.getClass();
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : c0914c.f14438a.f10991a.zzn("frc", "")) {
            L l10 = AbstractC1054a.f16542a;
            G.g(bundle);
            ?? obj = new Object();
            String str = (String) D0.e(bundle, "origin", String.class, null);
            G.g(str);
            obj.f14425a = str;
            String str2 = (String) D0.e(bundle, "name", String.class, null);
            G.g(str2);
            obj.f14426b = str2;
            obj.f14427c = D0.e(bundle, "value", Object.class, null);
            obj.f14428d = (String) D0.e(bundle, "trigger_event_name", String.class, null);
            obj.f14429e = ((Long) D0.e(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            obj.f14430f = (String) D0.e(bundle, "timed_out_event_name", String.class, null);
            obj.g = (Bundle) D0.e(bundle, "timed_out_event_params", Bundle.class, null);
            obj.f14431h = (String) D0.e(bundle, "triggered_event_name", String.class, null);
            obj.f14432i = (Bundle) D0.e(bundle, "triggered_event_params", Bundle.class, null);
            obj.j = ((Long) D0.e(bundle, "time_to_live", Long.class, 0L)).longValue();
            obj.k = (String) D0.e(bundle, "expired_event_name", String.class, null);
            obj.f14433l = (Bundle) D0.e(bundle, "expired_event_params", Bundle.class, null);
            obj.f14435n = ((Boolean) D0.e(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            obj.f14434m = ((Long) D0.e(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            obj.f14436o = ((Long) D0.e(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final void c(ArrayList arrayList) {
        String str;
        ObjectOutputStream objectOutputStream;
        ObjectInputStream objectInputStream;
        String str2;
        String str3;
        String str4;
        InterfaceC1387b interfaceC1387b = this.f12205a;
        if (interfaceC1387b.get() == null) {
            throw new Exception("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                if (arrayList2.isEmpty()) {
                    if (interfaceC1387b.get() == null) {
                        throw new Exception("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                    }
                    Iterator it2 = b().iterator();
                    while (it2.hasNext()) {
                        ((C0914c) ((InterfaceC0913b) interfaceC1387b.get())).f14438a.f10991a.zzm(((C0912a) it2.next()).f14426b, null, null);
                    }
                    return;
                }
                if (interfaceC1387b.get() == null) {
                    throw new Exception("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                }
                ArrayList b2 = b();
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = b2.iterator();
                while (it3.hasNext()) {
                    C0912a c0912a = (C0912a) it3.next();
                    String[] strArr = b.g;
                    String str5 = c0912a.f14428d;
                    arrayList3.add(new b(c0912a.f14426b, String.valueOf(c0912a.f14427c), str5 != null ? str5 : str, new Date(c0912a.f14434m), c0912a.f14429e, c0912a.j));
                    str = str;
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    b bVar = (b) it4.next();
                    if (!a(arrayList2, bVar)) {
                        arrayList4.add(bVar.a());
                    }
                }
                Iterator it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    ((C0914c) ((InterfaceC0913b) interfaceC1387b.get())).f14438a.f10991a.zzm(((C0912a) it5.next()).f14426b, null, null);
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    b bVar2 = (b) it6.next();
                    if (!a(arrayList3, bVar2)) {
                        arrayList5.add(bVar2);
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque(b());
                if (this.f12206b == null) {
                    this.f12206b = Integer.valueOf(((C0914c) ((InterfaceC0913b) interfaceC1387b.get())).f14438a.f10991a.zzF("frc"));
                }
                int intValue = this.f12206b.intValue();
                Iterator it7 = arrayList5.iterator();
                while (it7.hasNext()) {
                    b bVar3 = (b) it7.next();
                    while (arrayDeque.size() >= intValue) {
                        ((C0914c) ((InterfaceC0913b) interfaceC1387b.get())).f14438a.f10991a.zzm(((C0912a) arrayDeque.pollFirst()).f14426b, null, null);
                    }
                    C0912a a9 = bVar3.a();
                    C0914c c0914c = (C0914c) ((InterfaceC0913b) interfaceC1387b.get());
                    c0914c.getClass();
                    L l10 = AbstractC1054a.f16542a;
                    String str6 = a9.f14425a;
                    if (str6 != null && !str6.isEmpty()) {
                        Object obj = a9.f14427c;
                        if (obj != null) {
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                try {
                                    objectOutputStream.writeObject(obj);
                                    objectOutputStream.flush();
                                    objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                                    try {
                                        Object obj2 = objectInputStream.readObject();
                                        try {
                                            objectOutputStream.close();
                                            objectInputStream.close();
                                        } catch (IOException | ClassNotFoundException unused) {
                                            obj2 = null;
                                        }
                                        if (obj2 == null) {
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        if (objectOutputStream != null) {
                                            objectOutputStream.close();
                                        }
                                        if (objectInputStream != null) {
                                            objectInputStream.close();
                                        }
                                        throw th;
                                        break;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    objectInputStream = null;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                objectOutputStream = null;
                                objectInputStream = null;
                            }
                        }
                        if (AbstractC1054a.a(str6) && AbstractC1054a.c(str6, a9.f14426b) && (((str2 = a9.k) == null || (AbstractC1054a.b(str2, a9.f14433l) && AbstractC1054a.d(str6, a9.k, a9.f14433l))) && (((str3 = a9.f14431h) == null || (AbstractC1054a.b(str3, a9.f14432i) && AbstractC1054a.d(str6, a9.f14431h, a9.f14432i))) && ((str4 = a9.f14430f) == null || (AbstractC1054a.b(str4, a9.g) && AbstractC1054a.d(str6, a9.f14430f, a9.g)))))) {
                            Bundle bundle = new Bundle();
                            String str7 = a9.f14425a;
                            if (str7 != null) {
                                bundle.putString("origin", str7);
                            }
                            String str8 = a9.f14426b;
                            if (str8 != null) {
                                bundle.putString("name", str8);
                            }
                            Object obj3 = a9.f14427c;
                            if (obj3 != null) {
                                D0.d(bundle, obj3);
                            }
                            String str9 = a9.f14428d;
                            if (str9 != null) {
                                bundle.putString("trigger_event_name", str9);
                            }
                            bundle.putLong("trigger_timeout", a9.f14429e);
                            String str10 = a9.f14430f;
                            if (str10 != null) {
                                bundle.putString("timed_out_event_name", str10);
                            }
                            Bundle bundle2 = a9.g;
                            if (bundle2 != null) {
                                bundle.putBundle("timed_out_event_params", bundle2);
                            }
                            String str11 = a9.f14431h;
                            if (str11 != null) {
                                bundle.putString("triggered_event_name", str11);
                            }
                            Bundle bundle3 = a9.f14432i;
                            if (bundle3 != null) {
                                bundle.putBundle("triggered_event_params", bundle3);
                            }
                            bundle.putLong("time_to_live", a9.j);
                            String str12 = a9.k;
                            if (str12 != null) {
                                bundle.putString("expired_event_name", str12);
                            }
                            Bundle bundle4 = a9.f14433l;
                            if (bundle4 != null) {
                                bundle.putBundle("expired_event_params", bundle4);
                            }
                            bundle.putLong("creation_timestamp", a9.f14434m);
                            bundle.putBoolean("active", a9.f14435n);
                            bundle.putLong("triggered_timestamp", a9.f14436o);
                            c0914c.f14438a.f10991a.zzl(bundle);
                        }
                    }
                    arrayDeque.offer(a9);
                }
                return;
            }
            Map map = (Map) it.next();
            String[] strArr2 = b.g;
            ArrayList arrayList6 = new ArrayList();
            String[] strArr3 = b.g;
            for (int i7 = 0; i7 < 5; i7++) {
                String str13 = strArr3[i7];
                if (!map.containsKey(str13)) {
                    arrayList6.add(str13);
                }
            }
            if (!arrayList6.isEmpty()) {
                throw new Exception(String.format("The following keys are missing from the experiment info map: %s", arrayList6));
            }
            try {
                arrayList2.add(new b((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", b.f12198h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis"))));
            } catch (NumberFormatException e2) {
                throw new Exception("Could not process experiment: one of the durations could not be converted into a long.", e2);
            } catch (ParseException e10) {
                throw new Exception("Could not process experiment: parsing experiment start time failed.", e10);
            }
        }
    }
}
