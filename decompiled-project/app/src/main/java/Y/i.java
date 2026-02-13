package Y;

import Q.AbstractC0499k0;
import Q.U0;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class i extends AbstractMap implements Map, Sb.d {

    /* renamed from: a, reason: collision with root package name */
    public X.b f11047a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public V.l f11048b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11049c;

    /* renamed from: d, reason: collision with root package name */
    public int f11050d;

    /* renamed from: e, reason: collision with root package name */
    public int f11051e;

    /* renamed from: f, reason: collision with root package name */
    public j f11052f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.b] */
    public i(j jVar) {
        this.f11048b = jVar.f9940a;
        this.f11051e = jVar.f9941b;
        this.f11052f = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.b] */
    /* JADX WARN: Type inference failed for: r1v2, types: [V.c] */
    public final j a() {
        V.l lVar = this.f11048b;
        j jVar = this.f11052f;
        V.l lVar2 = jVar.f9940a;
        j jVar2 = jVar;
        if (lVar != lVar2) {
            this.f11047a = new Object();
            jVar2 = new V.c(this.f11048b, this.f11051e);
        }
        this.f11052f = jVar2;
        return jVar2;
    }

    public final boolean b(Object obj) {
        return this.f11048b.d(obj, obj != null ? obj.hashCode() : 0, 0);
    }

    public final Object c(Object obj) {
        return this.f11048b.g(obj, obj != null ? obj.hashCode() : 0, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f11048b = V.l.f9957e;
        e(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC0499k0) {
            return b((AbstractC0499k0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof U0) {
            return super.containsValue((U0) obj);
        }
        return false;
    }

    public final Object d(Object obj) {
        this.f11049c = null;
        V.l n6 = this.f11048b.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n6 == null) {
            n6 = V.l.f9957e;
        }
        this.f11048b = n6;
        return this.f11049c;
    }

    public final void e(int i7) {
        this.f11051e = i7;
        this.f11050d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new V.f(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC0499k0) {
            return (U0) c((AbstractC0499k0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC0499k0) ? obj2 : (U0) super.getOrDefault((AbstractC0499k0) obj, (U0) obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new V.f(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f11049c = null;
        this.f11048b = this.f11048b.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f11049c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [V.c] */
    /* JADX WARN: Type inference failed for: r3v0, types: [V.l] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, X.a] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        j jVar = null;
        j jVar2 = map instanceof V.c ? (V.c) map : null;
        if (jVar2 == null) {
            i iVar = map instanceof i ? (i) map : null;
            if (iVar != null) {
                jVar = iVar.a();
            }
        } else {
            jVar = jVar2;
        }
        if (jVar == null) {
            super.putAll(map);
            return;
        }
        ?? obj = new Object();
        obj.f10900a = 0;
        int i7 = this.f11051e;
        ?? r32 = this.f11048b;
        V.l lVar = jVar.f9940a;
        kotlin.jvm.internal.l.c(lVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f11048b = r32.m(lVar, 0, obj, this);
        int i10 = (jVar.f9941b + i7) - obj.f10900a;
        if (i7 != i10) {
            e(i10);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof AbstractC0499k0) {
            return (U0) d((AbstractC0499k0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i7 = this.f11051e;
        V.l o10 = this.f11048b.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o10 == null) {
            o10 = V.l.f9957e;
        }
        this.f11048b = o10;
        return i7 != this.f11051e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f11051e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new Fb.h(this, 1);
    }
}
