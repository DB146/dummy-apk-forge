package J8;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: J8.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0367w implements G8.A {

    /* renamed from: a, reason: collision with root package name */
    public final q3.e f5732a;

    /* renamed from: b, reason: collision with root package name */
    public final G8.h f5733b;

    /* renamed from: c, reason: collision with root package name */
    public final I8.d f5734c;

    /* renamed from: d, reason: collision with root package name */
    public final C0357l f5735d;

    /* renamed from: e, reason: collision with root package name */
    public final List f5736e;

    public C0367w(q3.e eVar, G8.h hVar, I8.d dVar, C0357l c0357l, List list) {
        this.f5732a = eVar;
        this.f5733b = hVar;
        this.f5734c = dVar;
        this.f5735d = c0357l;
        this.f5736e = list;
    }

    public static void b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + L8.c.c(field) + " and " + L8.c.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    @Override // G8.A
    public final G8.z a(G8.m mVar, N8.a aVar) {
        Class cls = aVar.f7386a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        com.bumptech.glide.d dVar = L8.c.f6421a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new G8.j(2);
        }
        I8.h.f(this.f5736e);
        return L8.c.f6421a.s(cls) ? new C0366v(cls, c(mVar, aVar, cls, true)) : new C0364t(this.f5732a.l(aVar, true), c(mVar, aVar, cls, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x01bd, code lost:
    
        r11 = new N8.a(I8.h.j(r1, r12, r12.getGenericSuperclass(), new java.util.HashMap()));
        r12 = r11.f7386a;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00b5  */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0365u c(G8.m mVar, N8.a aVar, Class cls, boolean z8) {
        boolean z10;
        Method method;
        H8.b bVar;
        List asList;
        String str;
        boolean z11;
        ?? r15;
        ?? r42;
        H8.a aVar2;
        N8.a aVar3;
        String str2;
        boolean z12;
        Field field;
        int i7;
        G8.z zVar;
        if (cls.isInterface()) {
            return C0365u.f5725c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        N8.a aVar4 = aVar;
        Class cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            if (cls2 != cls && declaredFields.length > 0) {
                I8.h.f(this.f5736e);
            }
            int length = declaredFields.length;
            boolean z13 = false;
            int i10 = 0;
            while (true) {
                Type type = aVar4.f7387b;
                if (i10 < length) {
                    Field field2 = declaredFields[i10];
                    boolean d10 = d(field2, true);
                    boolean d11 = d(field2, z13);
                    if (d10 || d11) {
                        if (!z8) {
                            z10 = d11;
                        } else if (Modifier.isStatic(field2.getModifiers())) {
                            z10 = z13;
                        } else {
                            Method m10 = L8.c.f6421a.m(cls2, field2);
                            L8.c.f(m10);
                            if (m10.getAnnotation(H8.b.class) != null && field2.getAnnotation(H8.b.class) == null) {
                                throw new Db.d(y.S.b("@SerializedName on ", L8.c.d(m10, z13), " is not supported"), 4);
                            }
                            z10 = d11;
                            method = m10;
                            if (method == null) {
                                L8.c.f(field2);
                            }
                            Type j = I8.h.j(type, cls2, field2.getGenericType(), new HashMap());
                            bVar = (H8.b) field2.getAnnotation(H8.b.class);
                            if (bVar != null) {
                                str = this.f5733b.b(field2);
                                asList = Collections.emptyList();
                            } else {
                                String value = bVar.value();
                                asList = Arrays.asList(bVar.alternate());
                                str = value;
                            }
                            if (asList.isEmpty()) {
                                z11 = true;
                                ArrayList arrayList = new ArrayList(asList.size() + 1);
                                arrayList.add(str);
                                arrayList.addAll(asList);
                                r15 = arrayList;
                                r42 = 0;
                            } else {
                                r42 = z13;
                                z11 = true;
                                r15 = Collections.singletonList(str);
                            }
                            String str3 = (String) r15.get(r42);
                            N8.a aVar5 = new N8.a(j);
                            Class cls3 = aVar5.f7386a;
                            boolean z14 = (cls3 == null && cls3.isPrimitive()) ? z11 : r42;
                            int modifiers = field2.getModifiers();
                            boolean z15 = (Modifier.isStatic(modifiers) || !Modifier.isFinal(modifiers)) ? r42 : z11;
                            aVar2 = (H8.a) field2.getAnnotation(H8.a.class);
                            if (aVar2 == null) {
                                aVar3 = aVar5;
                                str2 = str3;
                                z12 = false;
                                field = field2;
                                i7 = i10;
                                zVar = this.f5735d.b(this.f5732a, mVar, aVar3, aVar2, false);
                            } else {
                                aVar3 = aVar5;
                                str2 = str3;
                                z12 = r42;
                                field = field2;
                                i7 = i10;
                                zVar = null;
                            }
                            boolean z16 = zVar == null ? z11 : z12;
                            N8.a aVar6 = aVar3;
                            if (zVar == null) {
                                zVar = mVar.d(aVar6);
                            }
                            r rVar = new r(str2, field, method, d10 ? zVar : z16 ? zVar : new C0369y(mVar, zVar, aVar6.f7387b), zVar, z14, z15);
                            if (z10) {
                                for (String str4 : r15) {
                                    r rVar2 = (r) linkedHashMap.put(str4, rVar);
                                    if (rVar2 != null) {
                                        b(cls, str4, rVar2.f5717b, field);
                                        throw null;
                                    }
                                }
                            }
                            Field field3 = field;
                            if (d10) {
                                continue;
                            } else {
                                String str5 = str2;
                                r rVar3 = (r) linkedHashMap2.put(str5, rVar);
                                if (rVar3 != null) {
                                    b(cls, str5, rVar3.f5717b, field3);
                                    throw null;
                                }
                            }
                        }
                        method = null;
                        if (method == null) {
                        }
                        Type j10 = I8.h.j(type, cls2, field2.getGenericType(), new HashMap());
                        bVar = (H8.b) field2.getAnnotation(H8.b.class);
                        if (bVar != null) {
                        }
                        if (asList.isEmpty()) {
                        }
                        String str32 = (String) r15.get(r42);
                        N8.a aVar52 = new N8.a(j10);
                        Class cls32 = aVar52.f7386a;
                        if (cls32 == null) {
                        }
                        int modifiers2 = field2.getModifiers();
                        if (Modifier.isStatic(modifiers2)) {
                        }
                        aVar2 = (H8.a) field2.getAnnotation(H8.a.class);
                        if (aVar2 == null) {
                        }
                        if (zVar == null) {
                        }
                        N8.a aVar62 = aVar3;
                        if (zVar == null) {
                        }
                        if (d10) {
                        }
                        r rVar4 = new r(str2, field, method, d10 ? zVar : z16 ? zVar : new C0369y(mVar, zVar, aVar62.f7387b), zVar, z14, z15);
                        if (z10) {
                        }
                        Field field32 = field;
                        if (d10) {
                        }
                    } else {
                        i7 = i10;
                        z12 = z13;
                    }
                    i10 = i7 + 1;
                    z13 = z12;
                }
            }
        }
        return new C0365u(linkedHashMap, new ArrayList(linkedHashMap2.values()));
    }

    public final boolean d(Field field, boolean z8) {
        boolean z10;
        I8.d dVar = this.f5734c;
        dVar.getClass();
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || dVar.b(field.getType(), z8)) {
            z10 = true;
        } else {
            List list = z8 ? dVar.f5269a : dVar.f5270b;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw h3.o.j(it);
                }
            }
            z10 = false;
        }
        return !z10;
    }
}
