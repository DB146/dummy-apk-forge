package P4;

import android.util.Log;
import androidx.work.impl.WorkDatabase;
import b4.C0837h;
import b4.C0838i;
import c4.InterfaceC0906h;
import g4.C1196a;
import h3.C1240b;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.logging.Logger;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class F implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7858b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7859c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7861e;

    public /* synthetic */ F(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f7857a = i7;
        this.f7858b = obj;
        this.f7859c = obj2;
        this.f7860d = obj3;
        this.f7861e = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, P4.I] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Map map;
        List list;
        String obj;
        BufferedWriter bufferedWriter;
        switch (this.f7857a) {
            case 0:
                this.f7859c.H(((A4.s) this.f7858b).f470a, (B) this.f7860d, (C0474w) this.f7861e);
                return;
            case 1:
                C0838i c0838i = (C0838i) this.f7859c;
                String str = c0838i.f13859a;
                Y3.g gVar = (Y3.g) this.f7860d;
                C0837h c0837h = (C0837h) this.f7861e;
                C1196a c1196a = (C1196a) this.f7858b;
                c1196a.getClass();
                Logger logger = C1196a.f17446f;
                try {
                    InterfaceC0906h a9 = c1196a.f17449c.a(str);
                    if (a9 == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        gVar.b(new IllegalArgumentException(str2));
                    } else {
                        ((i4.g) c1196a.f17451e).T(new M9.e(c1196a, c0838i, ((Z3.b) a9).a(c0837h), 7));
                        gVar.b(null);
                    }
                    return;
                } catch (Exception e2) {
                    logger.warning("Error scheduling event " + e2.getMessage());
                    gVar.b(e2);
                    return;
                }
            case 2:
                List list2 = (List) this.f7858b;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ((i3.f) it.next()).a(((q3.j) this.f7859c).f23386a);
                }
                i3.h.b((C1240b) this.f7860d, (WorkDatabase) this.f7861e, list2);
                return;
            default:
                B7.d dVar = (B7.d) this.f7858b;
                String str3 = (String) ((AtomicMarkableReference) dVar.g).getReference();
                String str4 = (String) this.f7859c;
                x7.h hVar = (x7.h) dVar.f2211b;
                if (str3 != null) {
                    String str5 = (String) ((AtomicMarkableReference) dVar.g).getReference();
                    File b2 = hVar.f26256a.b(str4, "user-data");
                    BufferedWriter bufferedWriter2 = null;
                    try {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("userId", str5);
                            obj = jSONObject.toString();
                            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b2), x7.h.f26255b));
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Exception e10) {
                        e = e10;
                    }
                    try {
                        bufferedWriter.write(obj);
                        bufferedWriter.flush();
                        v7.g.b(bufferedWriter, "Failed to close user metadata file.");
                    } catch (Exception e11) {
                        e = e11;
                        bufferedWriter2 = bufferedWriter;
                        Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
                        v7.g.b(bufferedWriter2, "Failed to close user metadata file.");
                        map = (Map) this.f7860d;
                        if (!map.isEmpty()) {
                        }
                        list = (List) this.f7861e;
                        if (list.isEmpty()) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedWriter2 = bufferedWriter;
                        v7.g.b(bufferedWriter2, "Failed to close user metadata file.");
                        throw th;
                    }
                }
                map = (Map) this.f7860d;
                if (!map.isEmpty()) {
                    hVar.h(str4, map, false);
                }
                list = (List) this.f7861e;
                if (list.isEmpty()) {
                    hVar.i(str4, list);
                    return;
                }
                return;
        }
    }
}
