package A8;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import k8.C1433a;

/* loaded from: classes.dex */
public final class A {
    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(2:3|(12:5|6|7|(1:(1:(6:11|12|13|14|15|16)(2:19|20))(2:21|22))(5:29|30|31|32|(1:34)(1:35))|23|24|25|(1:27)|13|14|15|16))|43|6|7|(0)(0)|23|24|25|(0)|13|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0046, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0033, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
    
        android.util.Log.w("InstallationId", "Error getting Firebase installation id .", r10);
        r9 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(k8.e eVar, Jb.c cVar) {
        C0061z c0061z;
        Object obj;
        Ib.a aVar;
        int i7;
        k8.e eVar2;
        ?? r92;
        if (cVar instanceof C0061z) {
            c0061z = (C0061z) cVar;
            int i10 = c0061z.f729d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0061z.f729d = i10 - Integer.MIN_VALUE;
                obj = c0061z.f727b;
                aVar = Ib.a.f5345a;
                i7 = c0061z.f729d;
                String str = "";
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    k8.d dVar = (k8.d) eVar;
                    Task d10 = dVar.d();
                    try {
                        kotlin.jvm.internal.l.d(d10, "firebaseInstallations.getToken(false)");
                        c0061z.f726a = dVar;
                        c0061z.f729d = 1;
                        Object j = tc.b.j(d10, c0061z);
                        if (j == aVar) {
                            return aVar;
                        }
                        obj = j;
                        eVar = dVar;
                    } catch (Exception e2) {
                        e = e2;
                        eVar = dVar;
                        Log.w("InstallationId", "Error getting authentication token.", e);
                        eVar2 = eVar;
                        r92 = "";
                        Task c10 = ((k8.d) eVar2).c();
                        kotlin.jvm.internal.l.d(c10, "firebaseInstallations.id");
                        c0061z.f726a = r92;
                        c0061z.f729d = 2;
                        obj = tc.b.j(c10, c0061z);
                        eVar = r92;
                        if (obj == aVar) {
                        }
                        kotlin.jvm.internal.l.d(obj, "{\n          firebaseInst…ions.id.await()\n        }");
                        str = (String) obj;
                        ?? r93 = eVar;
                        return new B(str, r93);
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r94 = (String) c0061z.f726a;
                        com.bumptech.glide.c.c0(obj);
                        eVar = r94;
                        kotlin.jvm.internal.l.d(obj, "{\n          firebaseInst…ions.id.await()\n        }");
                        str = (String) obj;
                        ?? r932 = eVar;
                        return new B(str, r932);
                    }
                    k8.e eVar3 = (k8.e) c0061z.f726a;
                    com.bumptech.glide.c.c0(obj);
                    eVar = eVar3;
                }
                String str2 = ((C1433a) obj).f19028a;
                kotlin.jvm.internal.l.d(str2, "{\n          firebaseInst…).await().token\n        }");
                eVar2 = eVar;
                r92 = str2;
                Task c102 = ((k8.d) eVar2).c();
                kotlin.jvm.internal.l.d(c102, "firebaseInstallations.id");
                c0061z.f726a = r92;
                c0061z.f729d = 2;
                obj = tc.b.j(c102, c0061z);
                eVar = r92;
                if (obj == aVar) {
                    return aVar;
                }
                kotlin.jvm.internal.l.d(obj, "{\n          firebaseInst…ions.id.await()\n        }");
                str = (String) obj;
                ?? r9322 = eVar;
                return new B(str, r9322);
            }
        }
        c0061z = new C0061z(this, cVar);
        obj = c0061z.f727b;
        aVar = Ib.a.f5345a;
        i7 = c0061z.f729d;
        String str3 = "";
        if (i7 != 0) {
        }
        String str22 = ((C1433a) obj).f19028a;
        kotlin.jvm.internal.l.d(str22, "{\n          firebaseInst…).await().token\n        }");
        eVar2 = eVar;
        r92 = str22;
        Task c1022 = ((k8.d) eVar2).c();
        kotlin.jvm.internal.l.d(c1022, "firebaseInstallations.id");
        c0061z.f726a = r92;
        c0061z.f729d = 2;
        obj = tc.b.j(c1022, c0061z);
        eVar = r92;
        if (obj == aVar) {
        }
        kotlin.jvm.internal.l.d(obj, "{\n          firebaseInst…ions.id.await()\n        }");
        str3 = (String) obj;
        ?? r93222 = eVar;
        return new B(str3, r93222);
    }
}
