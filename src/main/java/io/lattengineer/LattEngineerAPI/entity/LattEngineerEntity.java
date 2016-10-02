package io.lattengineer.LattEngineerAPI.entity;

import java.util.Objects;
import java.util.Map.Entry;

/*
import com.massivecraft.massivecore.MassiveCore;
import com.massivecraft.massivecore.store.Coll;
import com.massivecraft.massivecore.store.Modification;
import com.massivecraft.massivecore.store.accessor.Accessor;
import com.massivecraft.massivecore.xlib.gson.Gson;*/

import io.lattengineer.LattEngineerAPI.gson.JsonObject;
import io.lattengineer.LattEngineerAPI.store.LattEngineerColl;

public class LattEngineerEntity<E extends LattEngineerEntity<E>>
{
	
}
/*
{
	protected transient LattEngineerColl<E> coll;
	protected transient String id;
	private transient volatile JsonObject lastRaw = null;
	private transient volatile long lastMtime = 0L;
	private transient volatile boolean lastDefault = false;

	protected void setColl(LattEngineerColl<E> val) {
		this.coll = val;
	}

	public LattEngineerColl<E> getColl() 
	{
		return this.coll;
	}

	protected void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public String getUniverse() {
		Coll coll = this.getColl();
		return coll == null ? null : coll.getUniverse();
	}

	public JsonObject getLastRaw() {
		return this.lastRaw;
	}

	public void setLastRaw(JsonObject lastRaw) {
		this.lastRaw = lastRaw;
	}

	public long getLastMtime() {
		return this.lastMtime;
	}

	public void setLastMtime(long lastMtime) {
		this.lastMtime = lastMtime;
	}

	public boolean getLastDefault() {
		return this.lastDefault;
	}

	public void setLastDefault(boolean lastDefault) {
		this.lastDefault = lastDefault;
	}

	public void clearSyncLogFields() {
		this.lastRaw = null;
		this.lastMtime = 0L;
		this.lastDefault = false;
	}

	public String attach(Coll<E> coll) {
		return coll.attach(this);
	}

	public E detach() {
		Coll coll = this.getColl();
		return coll == null ? this : coll.detachEntity(this);
	}

	public boolean attached() {
		return this.getColl() != null && this.getId() != null;
	}

	public boolean detached() {
		return !this.attached();
	}

	public void preAttach(String id) {
	}

	public void postAttach(String id) {
	}

	public void preDetach(String id) {
	}

	public void postDetach(String id) {
	}

	public boolean isLive() {
		String id = this.getId();
		if (id == null) {
			return false;
		} else {
			Coll coll = this.getColl();
			return coll == null ? false : coll.isActive();
		}
	}

	public void changed() {
		if (this.isLive()) {
			this.getColl().putIdentifiedModificationFixed(this.getId(), Modification.UNKNOWN);
		}
	}

	public Modification sync() {
		return !this.isLive() ? Modification.UNKNOWN : this.getColl().syncIdFixed(this.id);
	}

	public void saveToRemote() {
		if (this.isLive()) {
			this.getColl().saveToRemoteFixed(this.id);
		}
	}

	public void loadFromRemote() {
		if (this.isLive()) {
			this.getColl().loadFromRemoteFixed(this.id, (Entry) null);
		}
	}

	public E load(E that) {
		Accessor.get(this.getClass()).copy(that, this);
		return this;
	}

	public boolean isDefault() {
		return false;
	}

	public <T> T convertGet(T value, T standard) {
		return value != null ? value : standard;
	}

	public <T> T convertSet(T value, T standard) {
		this.changed();
		return Objects.equals(value, standard) ? null : value;
	}

	public boolean convertGet(Boolean value) {
		return ((Boolean) this.convertGet(value, Boolean.valueOf(false))).booleanValue();
	}

	public Boolean convertSet(Boolean value) {
		return (Boolean) this.convertSet(value, Boolean.valueOf(false));
	}

	public String toString() {
		Gson gson = MassiveCore.gson;
		Coll coll = this.getColl();
		if (coll != null) {
			gson = coll.getGson();
		}

		return this.getClass().getSimpleName() + gson.toJson(this, this.getClass());
	}*/

