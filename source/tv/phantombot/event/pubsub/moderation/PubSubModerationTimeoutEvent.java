/*
 * Copyright (C) 2016-2017 phantombot.tv
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package tv.phantombot.event.pubsub;

public class PubSubModerationTimeoutEvent extends PubSubModerationEvent {

	private final String reason;
	private final String time;

	public PubSubModerationTimeoutEvent(String username, String creator, String message, String time) {
		super(username, creator, message);

		this.reason = "";
		this.time = time;
	}

	public PubSubModerationTimeoutEvent(String username, String creator, String message, String reason, String time) {
		super(username, creator, message);

		this.reason = reason;
		this.time = time;
	}

	public String getReason() {
		return this.reason;
	}

	public String getTime() {
		return this.time;
	}
}
